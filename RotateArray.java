public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {
        k = k % nums.length;
        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % nums.length] = nums[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;

        int[] result1 = rotateArray(nums1, k1);
        System.out.println(java.util.Arrays.toString(result1));

        int[] nums2 = {1, 2};
        int k2 = 3;

        int[] result2 = rotateArray(nums2, k2);
        System.out.println(java.util.Arrays.toString(result2));
    }
}
