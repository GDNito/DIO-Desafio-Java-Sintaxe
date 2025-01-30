import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o numero da agencia");
        int agencia = scanner.nextInt();

        System.out.println("Insira o numero da Conta");
        String conta = scanner.next();

        System.out.println("Insira o seu nome completo");
        String nome = scanner.next();

        System.out.println("Insira o saldo da conta (Marque os centavos com ,'Virgula')");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}