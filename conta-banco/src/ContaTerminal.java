import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Importando a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //Declarando as variáveis
        int numeroConta=0;
        String agencia=null;
        String nomeCliente=null;
        Float saldo;

        //Exibindo menssagens para o usuário e recuperando os dados
        System.out.println("Digite o seu nome! ");
        nomeCliente = sc.nextLine();
       
        System.out.println("Digite o número da conta!");
        numeroConta = sc.nextInt();        
       
        System.out.println("Digite o número da agência!");
        agencia = sc.next();
        
        System.out.println("Digite o valor de depósito!");
        saldo = sc.nextFloat();

        //Modo de concatenação normal usando o símbolo de mais (+).
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ numeroConta+" e seu saldo "+ saldo+" já está disponível para saque.");

        //Modo de concatenação usando o método concat.
       System.out.println("Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é "+agencia).concat(", conta "+numeroConta).concat(" e seu saldo "+saldo+" já está disponível para saque."));
    }
}
