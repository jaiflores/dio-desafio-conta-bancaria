import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário e Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência com o '-' !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Sua conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite quanto quer sacar!");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem no conta criada

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +  " seu saldo R$ " + saldo + " já está disponível para saque");
    }
}
