class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stk=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")){
                if(tokens[i].equals("+")){
                    int num2=Integer.parseInt(stk.pop());
                    int num1=Integer.parseInt(stk.pop());
                    stk.push(Integer.toString(num1+num2));
                }
                else if(tokens[i].equals("-")){
                    int num2=Integer.parseInt(stk.pop());
                    int num1=Integer.parseInt(stk.pop());
                    stk.push(Integer.toString(num1-num2));
                }
                else if(tokens[i].equals("/")){
                    int num2=Integer.parseInt(stk.pop());
                    int num1=Integer.parseInt(stk.pop());
                    stk.push(Integer.toString(num1/num2));
                }
                else if(tokens[i].equals("*")){
                    int num2=Integer.parseInt(stk.pop());
                    int num1=Integer.parseInt(stk.pop());
                    stk.push(Integer.toString(num1*num2));
                }
            }
            else{
                stk.push(tokens[i]);
            }
        }
        return Integer.parseInt(stk.pop());
    }
}
