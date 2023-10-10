public class Q5 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        System.out.println("Os primeiros números da série de Fibonacci até passar de 100 são:");

        while (n1 <= 100) {
            System.out.print(n1 + " ");

            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
    }
}







    

