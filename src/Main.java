import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
        Cliente cliente = new Cliente();
        cliente.setNome("Rodrigo");


        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(cliente);
        cc.transferir(50,poupanca);
        poupanca.transferir(20,cc);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

       */
        Scanner scan = new Scanner(System.in);
        Banco banco = new Banco();
        Cliente cliente =new Cliente();


        int opcao = banco.menu();
        while(opcao >0 && opcao < 6){
            Conta cc = new ContaCorrente(cliente);
            if(opcao == 1){
                System.out.println("Informe o nome do Cliente ");
                String nome = scan.nextLine();
                cliente.setNome(nome);

                banco.adicionarConta(cc);
                nome = "";
            }
            else if (opcao == 2) {
               // cc.depositar(scan.nextDouble());
            } else if (opcao ==5 ) {
               banco.exibirContas();
            }

            opcao = banco.menu();

        }// while
        System.out.println(" Programa Finalizado");




       /*
        System.out.println(" Digite o nome do Cliente  ");
        cliente.setNome(scanner.next());
        cc.depositar(100);
        banco.adicionarConta(cc);

        Cliente cf =new Cliente();
        Conta dd = new ContaCorrente(cf);
        cf.setNome("Joao");
        dd.depositar(70);
        banco.adicionarConta(dd);

        banco.exibirContas();

        */
    }
}
