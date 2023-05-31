public class RightHalfPyramid {
    public static void main(String[] args) {
        int n =5;
        righthalf(n);
    }

    private static void righthalf(int n) {
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
