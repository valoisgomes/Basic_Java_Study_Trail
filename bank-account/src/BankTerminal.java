import java.util.Locale;
import java.util.Scanner;

public class BankTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o nome do Cliente: ");
            String clientName = scanner.next();

            System.out.println("Digite o numero da agência: ");
            String agencyNumber = scanner.next();

            System.out.println("Digite o numero da conta: ");
            int accountNumber = scanner.nextInt();

            System.out.println("Digite o Saldo da Conta: ");
            double balance = scanner.nextDouble();

            System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + 
            " - conta: " + accountNumber + " - e seu saldo: " + balance + " - já está disponível para saque");
        }

    }
}
