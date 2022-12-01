class Solution {
    public boolean judgeSquareSum(int c) {
      
         HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= (int)Math.sqrt(c) + 1; i++) {
            set.add(i*i);
            list.add(i*i);
        }
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if(set.contains(c-n) ) {
                
                return true;
            }
        }
         return false;

    }
        
    }
