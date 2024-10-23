package estruturaderepeticao;

import java.util.Scanner;
public class ExecicioDoisRefatorado {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
           String nomeRecebido = recebeNome();
            if(nomeRecebido.equals("0")){
                break;
            }
            recebeIdade();
        }

        System.out.println("saindo");

    }


    protected static String recebeNome(){
        System.out.println("Digite o nome");
        String nome = sc.nextLine();
        System.out.println("Nome: " + nome);
        return nome;
    }

    protected static void recebeIdade(){
        System.out.println("Digite a idade");
        int idade = sc.nextInt();
        System.out.println("Idade: " + idade);
        sc.nextLine();
    }
}
