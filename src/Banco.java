import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco{

    private List<Conta> contasList;

    public Banco() {
        this.contasList = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
       contasList.add(conta);
    }

    public void exibirContas() {
        if (!contasList.isEmpty()) {
            for (Conta conta : contasList) {
                System.out.println(conta.toString());
                System.out.println("----------------------------");
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public int menu(){
        System.out.println("1 -  Criar Conta");
        System.out.println("2 -  Depositar");
        System.out.println("3 -  Sacar");
        System.out.println("4 -  Trasferir");
        System.out.println("5 -  Extrato");
        System.out.println("6 -  Sair");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }



}
