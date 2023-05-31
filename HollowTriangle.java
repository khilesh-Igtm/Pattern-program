public class HollowTriangle {
    public static void main(String[] args) {
        int n =5;
        hollowtriangle(n);
    }

    private static void hollowtriangle(int n) {
        for(int i=1;i<=n;i++){
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
// Multiplying i by 2 gives us the number of characters in the row if it were a solid line without any gaps in between.
// Subtracting 1 from 2 * i accounts for the fact that we need to leave gaps between the asterisks to create the hollow part of the triangle.
// By using (2 * i - 1) as the upper limit for the loop, we ensure that the correct number of characters (including both asterisks and spaces)
//  is printed in each row of the triangle. The first and last positions are reserved for the asterisks, while the positions in between are
//   filled with spaces.
