public class KPattern {
    public static void main(String[] args) {
        int n =5;
        kpattern(n);
    }

    private static void kpattern(int n) {
        //reverse right half pyramid
       for(int i=n;i>=1;i--){
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
 // starting with 2 bcz, 1 star is already printed and we don;t want that again
//  and want to start with 2 * as it will make them like they are palindrome
       for(int i=2;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
