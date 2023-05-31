public class RightPascalTriangle {
    public static void main(String[] args) {
        int n =5;
        rightpascal(n);
    }

    private static void rightpascal(int n) {
        // right angle triangle code
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }



        // inverted right angle triangle code
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
