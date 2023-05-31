public class HollowHourGlass {
    public static void main(String[] args) {
        int n =5;
        hourglass(n);
    }

    private static void hourglass(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for(int i=2;i<=n;i++){
            //print spaces before the triangle
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //print asterisks and spaces in each row
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==(2*i-1)){
                    //print an asterisk at the first and last positions
                    System.out.print("*");
                }else{
                    if(i== n){
                        //if it is the last row, print asterisks in the remaining positions
                        System.out.print("*");
                    }else{
                        //otherwise , print spaces in the remaining positions
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); //move to the next line
        }
    }
}
