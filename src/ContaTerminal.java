import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite a Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
