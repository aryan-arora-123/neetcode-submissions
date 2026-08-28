class Solution {
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            int l = s.length();
            String len = String.format("%03d", l);
            sb.append(len).append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        if(str.isEmpty()){
            return ans;
        }
        
        //String l="";
        
        for (int i = 0; i < str.length();) {
            String l = str.substring(i,i+3);
            int len=Integer.parseInt(l);
            i+=3;
            String sub=str.substring(i,i+len);
            
            ans.add(sub);
            i+=len;
        }
        System.out.println(ans);
        return ans;
    }
}
