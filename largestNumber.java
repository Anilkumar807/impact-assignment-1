class Solution {
    public String largestNumber(int[] nums) {
        String[] nts = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nts[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(nts, (a, b) -> (b + a).compareTo(a + b));

        
        if (nts[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String num : nts) {
            result.append(num);
        }

        return result.toString();
    }
}
