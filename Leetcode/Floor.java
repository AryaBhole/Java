public class Floor {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 4, 6};
        System.out.println(binarySearch(nums));
    }

    public static int binarySearch(int[] nums) {
        int target = 2;
        int start = 0, end = 4, mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }

        return end;
    }
}