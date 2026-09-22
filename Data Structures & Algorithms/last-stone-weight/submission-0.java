class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i:stones){
            pq.offer(i);
        }
        while(!pq.isEmpty() && pq.size()!=1){
            System.out.println(pq);
            int x=pq.poll();
            int y=pq.poll();
            int z=Math.abs(x-y);
            if(z!=0){
                pq.offer(z);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.poll();
    }
}
