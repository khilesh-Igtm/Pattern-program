public class ReverseRightHalf {
    public static void main(String[] args) {
        int n =5;
        reverseright(n);
    }

    private static void reverseright(int n) {
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
