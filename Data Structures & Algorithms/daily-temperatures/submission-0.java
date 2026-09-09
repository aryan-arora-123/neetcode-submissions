class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk=new Stack<>();
        int ans[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            if(stk.isEmpty()){
                stk.push(i);
            }
            else if(temperatures[stk.peek()]>=temperatures[i]){
                stk.push(i);
            }
            else{
                while(!stk.isEmpty() && temperatures[stk.peek()]<temperatures[i]){
                    ans[stk.peek()]=i-stk.peek();
                    stk.pop();
                }
                stk.push(i);
            }
        }
        return ans;
    }
}
