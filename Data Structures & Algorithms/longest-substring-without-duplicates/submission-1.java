class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int l=-1,r=0;
        HashSet<Character> set=new HashSet<>();
        //set.add(s.charAt(0));
        int max=0;
        while(r<s.length() && l<r){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(++l));
            }
            set.add(s.charAt(r++));
            max=Math.max(r-l-1,max);
        }
        return max;
    }
}
