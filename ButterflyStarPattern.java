public class ButterflyStarPattern {
    public static void main(String[] args) {
        int n =5;
        butterfly(n);
    }

    private static void butterfly(int n) {
        //upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces between the starts from starting and the end, and the with the increase in value of i , the space reduces
            int spaces = 2*(n-i);
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // 2 is multiplied for better UI if stars
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
