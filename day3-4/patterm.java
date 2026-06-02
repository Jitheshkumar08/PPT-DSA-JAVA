public class patterm {
    public static void main(String[] args) {
        int height = 5;
        printVoidSandclock(height);
    }

    private static void printVoidSandclock(int height) {
        int width = 2 * height - 1;

        for (int row = 0; row < width; row++) {
            int level = row < height ? row : width - 1 - row;

            if (level == 0) {
                for (int star = 0; star < width; star++) {
                    System.out.print("*");
                }
            } else if (level < height - 1) {
                for (int left = 0; left < level; left++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int space = 0; space < width - (level * 2) - 2; space++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int right = 0; right < level; right++) {
                    System.out.print(" ");
                }
            } else {
                for (int left = 0; left < level; left++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int right = 0; right < level; right++) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

