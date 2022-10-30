class Solution {
    public String oddString(String[] words) {
        List<List<Integer>> outer = new ArrayList<>();
        int i,j;
        String m = "";
        for(i=0;i<words.length;i++)
        {
         m = words[i];
        List<Integer> list = new ArrayList<>();
        for(j=0;j<=m.length()-2;j++)
        { 
            int diff = m.charAt(j+1) - m.charAt(j);
            list.add(diff);
        }
              outer.add(list);
        }
        System.out.println(outer);
        List<Integer> list1;
        List<Integer> list2;
        List<Integer> list3;
        int ind=0;
        for(i=0;i<=outer.size()-3;i++)
        {
            list1 = outer.get(i);
             list2 = outer.get(i+1);
             list3 = outer.get(i+2);
            if(list1.equals(list2)&& !(list1.equals(list3)))
                      ind  = i+2;
           else if(list1.equals(list3)&& !(list2.equals(list3)))
                     ind  = i+1;
            else if(list2.equals(list3)&& !(list1.equals(list3)))
                     ind  = i;
            else
                continue;
            break;
        }
        return words[ind];
    }
}