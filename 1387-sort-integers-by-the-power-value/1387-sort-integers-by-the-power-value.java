import java.util.Map.Entry;
class Solution {
      public static int getKth(int lo, int hi, int k) {
        HashMap<Integer, Integer> dp = new HashMap<>();
        TreeMap<Integer, Integer> res = new TreeMap<>();
        for (int i = lo; i <= hi; i++) {
            res.put(i, loop(i, dp));

        }
        List<Entry<Integer, Integer>> list = new ArrayList<>(res.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                 int value  = Integer.compare(o1.getValue(),o2.getValue());
                return value;
            }
        });
        Entry<Integer,Integer> entry = list.get(k-1);
        return entry.getKey();


    }

    public static int loop(int n, HashMap<Integer, Integer> dp) {
        if (n == 1)
            return 0;
        if (dp.containsKey(n)) {
            return dp.get(n);
        }
        if (n % 2 == 0) {
            int c = 1 + loop(n / 2, dp);
            dp.put(n, c);
            return c;
        } else {
            int c = 1 + loop(3 * n + 1, dp);
            dp.put(n, c);
            return c;
        }
    }}