class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < adjacentPairs.length; i++) {
            for (int j = 0; j < adjacentPairs[0].length; j++) {
                set.add(adjacentPairs[i][j]);
            }
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (Integer i : set) {
            map.put(i,new ArrayList<>());
        }
        for (int[] arr : adjacentPairs){
                List<Integer> first = map.get(arr[0]);
                first.add(arr[1]);
                map.put(arr[0],first);
                List<Integer> last = map.get(arr[1]);
                last.add(arr[0]);
                map.put(arr[1],last);
            }
        int start = 0;
        for (Integer i:map.keySet()) {
            List<Integer> list = map.get(i);
            if(list.size()==1) {
                start = i;
                break;
            }
        }
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> ansset = new HashSet<>();
        ans.add(start);
        ansset.add(start);
        while(ans.size()!=set.size())
        {
            List<Integer> list = map.get(start);
            for (Integer i : list) {
                if(!(ansset.contains(i))) {
                    ans.add(i);
                    ansset.add(i);
                    start = i;
                    break;
                }
            }
        }
        int k = 0;
        int[] res = new int[ans.size()];
        for(Integer i:ans)
            res[k++] = i;
    return res;
}}