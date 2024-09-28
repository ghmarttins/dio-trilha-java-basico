import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner
        //Exebir as mensagens para o nosso usuario
        //Obter pela scanner os valores digitados pelo usuario
        //Exibir a mensagem conta criada

        Scanner entrada = new Scanner(System.in);

        int numConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Digite o número da conta: ");
        numConta = entrada.nextInt(); //Ler num real
        System.out.println("Digite o numero da sua agência: ");
        agencia = entrada.next(); // Ler String

        System.out.println("Digite o seu nome: ");
        nomeCliente = entrada.next();// ler string

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta "+ numConta + " e seu saldo de " + saldo + " já está disponivel para saque.");


        
    }
}
