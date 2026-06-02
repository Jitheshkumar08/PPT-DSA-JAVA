
class Recursion {

    public static void main(String[] args) {
        int stairs = 5;
        System.out.println(climb(stairs));
    }

    public static int climb(int stairs) {
        if (stairs <= 1) {
            return 1;
        } else if (stairs == 2) {
            return 2;
        } else {
            return climb(stairs - 1) + climb(stairs - 2);
        }
    }
}
