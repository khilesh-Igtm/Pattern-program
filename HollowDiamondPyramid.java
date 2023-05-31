public class HollowDiamondPyramid {
    public static void main(String[] args) {
        int n = 5;
        hollowdiamond(n);
    }

    private static void hollowdiamond(int n) {

        //this code is of hollow triangle
        for (int i = 1; i <= n; i++) {
            // print spaces before the triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print asterisks and spaces in each row
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    // print an asterisk at the first and last positions
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
            System.out.println(); // move to the next line
        }


        // this code is of reverse hollow triangle
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 ||  k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
