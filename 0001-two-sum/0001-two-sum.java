class Solution {
    public int[] twoSum(int[] nums, int target) {
               int[] sol = new int[2];
        List<Integer> solutionList = new ArrayList<Integer>();

        for (int num : nums) {
            solutionList.add(num);
        }
        for (int item : solutionList) {
            int valueToSearch = target - item;
            if (solutionList.contains(valueToSearch) && solutionList.indexOf(valueToSearch) != solutionList.lastIndexOf(item)) {
                sol[0] = solutionList.indexOf(valueToSearch);
                sol[1] = solutionList.lastIndexOf(item);
            }
        }

        return sol;
    }
}