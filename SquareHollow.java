public class SquareHollow {
    public static void main(String[] args) {
        int n =5;
        hollow(n);
    }

    private static void hollow(int n) {
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                // we only need to print star at 0 and last row&column
                if((i==0) || (j ==0) || (i==n-1) || (j==n-1) ){
                    System.out.print("*");
                }
                // rest will be space
                else{
                    System.out.print(" ");
                }
                System.out.print(" "); //for adding extra space between stars in row
            }
            System.out.println(); // for new line
        }
    }
}
