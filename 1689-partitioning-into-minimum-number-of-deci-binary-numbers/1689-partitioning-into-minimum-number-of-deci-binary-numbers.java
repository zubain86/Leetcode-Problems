class Solution {
    public int minPartitions(String n) {
        return (minPartition(n));
        
    }
    
     public int minPartition(String n)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int c = Character.getNumericValue(ch);
            set.add(c);
        }
        Integer[] digits = set.toArray(new Integer[set.size()]);
        Arrays.sort(digits);
        int count = 0;
        for (Integer i = 0; i < digits.length-1 ; i++) {
            count = count + digits[i];
            for (Integer j = i+1; j < digits.length ; j++) {
                digits[j] = digits[j] - digits[i];
            }
        }
        count = count + digits[digits.length-1];
        return count;
    }

}