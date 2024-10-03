import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao banco Pagé!");
        System.out.println("Vamos cadasatrar sua conta em nosso App para você poder desfrutar de todos os nossos serviços!");

        System.out.println("Qual o seu nome completo?");
        String nome = sc.nextLine();

        System.out.println("Qual o número de sua conta?");
        int conta = sc.nextInt();

        sc.nextLine();

        System.out.println("Qual o número de sua agência (Digite com o ' - '  Ex: 067-8 )?");
        String agencia = sc.nextLine();

        System.out.println("Quanto você gostaria de depositar inicialmente em sua conta?");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
