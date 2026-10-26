class Solution {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x,int y,int distSq,int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override 
        public  int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        // Point p = new Point();
        PriorityQueue<Point> pq = new PriorityQueue<>();
        // add elemnt to pq
        for(int i=0;i<points.length;i++){
            int distSq = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.add(new Point(points[i][0],points[i][1], distSq, i));
        }

         // nearest k cars
        int[][] near = new int[k][2];

        for (int i = 0; i < k; i++) {
            Point p = pq.poll();

            near[i][0] = p.x;
            near[i][1] = p.y;
        }

        return near;
    }
}
