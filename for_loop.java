public class for_loop {
    public static void main(String[] args) {
        for(int i=1;i <=4;i++){
            for(int j= 4;j>i;j--){
                System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
           if((j+1)%2==0)
              System.out.print("1 ");
            else  
            System.out.print("0 ");
           }
           System.out.println();

        }
    }
}
