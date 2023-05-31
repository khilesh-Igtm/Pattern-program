public class PascalTriangle {
    public static void main(String[] args) {
        int n =5;
        pascal(n);
    }

    private static void pascal(int n) {
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //calculate and print the numbers in current row
            int currentValue = 1; // represents the current value in the row
            for(int k=1;k<=i;k++){
                System.out.print(currentValue+" ");

                // calculate the next value using the binomial coeffiecient formula
                currentValue = currentValue * (i-k)/k;
            }
            System.out.println();
        }
    }
}
