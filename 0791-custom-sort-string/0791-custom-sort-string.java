class Solution {
    public String customSortString(String order, String s) {    
        
       HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                int c = map.get(ch) + 1;
                map.put(ch,c);
            }
        }
        String res = "";
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            if(map.containsKey(ch)){
                int j = map.get(ch);
                while(j>0){
                res += ch;
                j--;
                }
                map.remove(ch);
            }

        }
        for (Character r : map.keySet()) {
            int j = map.get(r);
            while(j>0){
            res += r;
            j--;
            }
        }


        return res;
}}