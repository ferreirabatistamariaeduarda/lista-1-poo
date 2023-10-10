import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        scan.close();
        
        System.out.println("Digite um número: ");
        for(int i = 1;i<=num;i++) {
            
            boolean primo = true;
            
            for(int j = 2;j<i;j++) {
                
                if(i%j == 0) {
                    primo = false;
                }
                
                if(primo) {
                    System.out.println(i);
                }
            }
            
}
    }}