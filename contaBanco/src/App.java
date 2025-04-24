
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        try (Scanner scanner = new Scanner(System.in)) {
            ContaTerminal conta = new ContaTerminal();
            System.out.print("Digite o número da conta: ");
            conta.setNumeroConta(scanner.nextInt());
            System.out.print("Digite o número da agência: ");
            conta.setAgencia(scanner.next());
            System.out.print("Digite o nome do cliente: ");
            conta.setNomeCliente(scanner.next());
            scanner.nextLine(); // Consumir a nova linha pendente
            System.out.print("Digite o saldo: ");
            conta.setSaldo(scanner.nextDouble());
            System.out.println("Olá " + conta.getNomeCliente()
                    + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + conta.getAgencia() + ", conta: "
                    + conta.getNumeroConta() + " e seu saldo: " + conta.getSaldo() + " já está disponível para saque.");
            
            System.out.println("A conta foi criada com sucesso!");
            
            scanner.nextLine(); // Consumir a nova linha pendente
            
            scanner.nextLine(); // Esperar o usuário pressionar enter
        }
    }
}
