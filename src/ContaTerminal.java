import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome completo:");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência:");
        String agencia = scanner.nextLine(); 

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", a conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");
    }

}
