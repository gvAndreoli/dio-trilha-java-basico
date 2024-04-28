import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        scanner.useLocale(Locale.US);

        String nomeCliente;
        String agencia;
        int numeroDaConta;
        double saldo;

        System.out.print("Por gentileza, informe seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Por favor, informe sua agência: ");
        agencia = scanner.nextLine();
        System.out.print("Informe o número da conta: ");
        numeroDaConta = scanner.nextInt();
        System.out.print("Informe o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo %.2f" +
                " já está disponível para saque"
                , nomeCliente, agencia, numeroDaConta, saldo);

        scanner.close();
    }
}
