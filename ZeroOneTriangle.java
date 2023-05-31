class ZeroOneTriangle{
    public static void main(String[] args) {
        int n = 5;
        zeroonetriangle(n);
    }

    private static void zeroonetriangle(int n) {
        for(int i =1;i<=n;i++){ //handle number of rows
            for(int j =1;j<=i;j++){ //handle number of columns
                if((i+j)%2 == 0){ // if sum of(i+j) is even then print 1
                    System.out.print(1+" ");
                }
                //otherwise 0
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}