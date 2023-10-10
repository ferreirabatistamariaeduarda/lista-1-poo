import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o salário do colaborador: R$ ");
        double salario = input.nextDouble();
        
        double taxaAumento;
        if (salario <= 280.00) {
            taxaAumento = 0.20;
        } else if (salario <= 700.00) {
            taxaAumento = 0.15;
        } else if (salario <= 1500.00) {
            taxaAumento = 0.10;
        } else {
            taxaAumento = 0.05;
        }
        
        double aumento = salario * taxaAumento;
        double novoSalario = salario + aumento;
        
        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + (taxaAumento * 100) + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);
        
        input.close();
    }
}
