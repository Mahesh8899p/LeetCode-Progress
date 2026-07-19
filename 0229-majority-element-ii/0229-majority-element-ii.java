class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num) > n/3){
                list.add(num);
            }
            
        }
        return list;
        
    }
}