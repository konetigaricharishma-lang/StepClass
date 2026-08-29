public class Duplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("nums = [1, 2, 3, 1] " 
                           + containsDuplicate(nums1));
        System.out.println("nums = [1, 2, 3, 4] " 
                           + containsDuplicate(nums2));
    }
}