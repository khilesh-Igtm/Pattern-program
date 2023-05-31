public class ReverseLeftHalf {
    public static void main(String[] args) {
        int n =15;
        reverselefthalf(n);
    }

    private static void reverselefthalf(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
