import java.util.Scanner;

public class ContaTerminal { 
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da agencia: ");
        int numero = scanner.nextInt();

        scanner.nextLine();
    
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual o saldo em sua conta?: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nome +", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta "+ numero + " e seu saldo "+ saldo + " ja esta disponivel para saque.");


        scanner.close();
    }
}
