public class NumChangingPyramid {
    public static void main(String[] args) {
        int n = 4;
        numberchange(n);
    }

    private static void numberchange(int n) {
        int num =1;
        for(int i=1;i<=n;i++){ //handle number of rows
            for(int j =1;j<=i;j++){
                System.out.print(num+" "); //printing value of num in each iteration
                num++; //increasing value of num
            }
            System.out.println();
        }
    }
}
