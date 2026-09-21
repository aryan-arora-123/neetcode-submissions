class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char string[]=strs[i].toCharArray();
            Arrays.sort(string);
            String sorted=new String(string);
            if(map.containsKey(sorted)){
                List<String> l=map.get(sorted);
                l.add(strs[i]);
                map.put(sorted, l);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted,list);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(String i: map.keySet()){
            ans.add(map.get(i));
        }
        return ans;
    }
}
