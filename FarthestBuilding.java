import java.util.PriorityQueue;

public class FarthestBuilding {
    
    static class Info implements Comparable<Info>{
        int currHt;
        int nextHt;
        int diff;
        public Info(int currHt, int nextHt, int diff){
            this.currHt = currHt;
            this.nextHt = nextHt;
            this.diff = diff;
        }
        @Override
        public int compareTo(Info i2){
            return this.currHt - i2.currHt;
        }
    }
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Info>pq = new PriorityQueue<>();

        for(int i = 0; i < heights.length - 1; i++){
            if(heights[i+1] > heights[i]){
                pq.add(new Info(i, i+1, heights[i+1] - heights[i]));
            }
        }
        // while(!pq.isEmpty()){
        //     Info i = pq.poll();
        //     if(bricks >= i.diff){
        //         bricks -= i.diff;
        //     }else if(ladders > 0){
        //         ladders -= 1;
        //     }
        //     else if((bricks < i.diff && ladders == 0)||(bricks == 0 && ladders == 0)){
                
        //         System.out.print(i.currHt+" ");
        //         System.out.print(i.nextHt+" ");
        //         System.out.print(i.diff);
        //         System.out.println();
        //         return i.currHt;
        //     }
        // }
        while((ladders > 0 || bricks > 0) && (!pq.isEmpty())){
                Info i = pq.poll();
                System.out.print(i.currHt+" ");
                System.out.print(i.nextHt+" ");
                System.out.print(i.diff);
                System.out.println();
                if(bricks >= i.diff){
                    System.out.println("going inside if");
                    bricks -= i.diff;
                    if(bricks == 0 &&ladders == 0 ){
                        return i.nextHt;
                    }
                    continue;
                    
                }else if(ladders > 0){
                    System.out.println("going inside else if");
                    ladders -= 1;
                    if(ladders == 0 && bricks == 0){
                        return i.nextHt;
                    }
                }else{
                    System.out.println("going inside else");
                    return i.currHt;
                }
        }
        return 0;
    }
    public static void main(String[] args){
        int heights[] = {4,2,7,6,9,14,12}; 
        int bricks = 5;
        int ladders = 1;
        System.out.println(furthestBuilding(heights, bricks, ladders));
    }
}
