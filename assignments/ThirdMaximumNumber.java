
public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long n = num;

            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        if (first == null) {
            return 0; // defensive: empty array -> return 0
        }

        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1,5,6,9,9};

        int result = thirdMax(nums);

        System.out.println("Third maximum number: " + result);
    }
}