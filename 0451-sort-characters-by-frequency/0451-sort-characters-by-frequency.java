class Solution {
    public String frequencySort(String s) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!(map.containsKey(s.charAt(i))))
            {
                for (int j = 0; j < s.length(); j++) {
                    if(s.charAt(i)==s.charAt(j))
                        count++;
                }
                map.put(s.charAt(i),count);
                count = 0;
            }
        }

        TreeMap<Double,Character> map1 = new TreeMap<>();
        for (Character i: map.keySet()) {
            double d = map.get(i).doubleValue();
            while(map1.containsKey(d))
            {
                d = d + 0.01;
            }
            map1.put(d,i);
        }
        String m = "";
        Double [] arr = map1.keySet().toArray(new Double[map1.size()]);
        Arrays.sort(arr, Collections.reverseOrder());
        for (Double i : arr) {
             int j = 0;
             int limit = i.intValue();
             while(j<limit)
             {
                 m = m + map1.get(i);
                 j++;
             }
        }
        
        return m;
  }
}