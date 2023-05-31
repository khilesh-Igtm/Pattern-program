public class SquareFill {
    public static void main(String[] args) {
        int n =5;
        square(n);
    }

    private static void square(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
