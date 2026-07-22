class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
      for(int num: nums){
        map.put(num,map.getOrDefault(num, 0)+1);
      }

      for(int occur: map.keySet()){
        if(map.get(occur) == 1){
            return occur;
        }
      }
      return -1;
    }
}