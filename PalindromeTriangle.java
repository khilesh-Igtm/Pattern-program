public class PalindromeTriangle {
    public static void main(String[] args) {
        int n =5;
        palindrome(n);
    }

    private static void palindrome(int n) {
        // handle rows
        for(int i =1;i<=n;i++){
            // print the spaces
            // Using (n - i) will result in a pattern with fewer spaces before each row compared to 2 * (n - i). This means that the pattern will
            //  be less spread out horizontally and may appear denser.
            for(int j =1;j<2*(n-i);j++){
                System.out.print(" ");
            }
            // print the first part
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //print the 2nd part
            for(int j =2;j<=i;j++){
                System.out.print(j+" ");
            }
            //print new line for each row
            System.out.println();
        }
    }
}
