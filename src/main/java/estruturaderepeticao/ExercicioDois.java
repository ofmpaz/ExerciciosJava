package estruturaderepeticao;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Digite nome");
            nome = sc.nextLine();
            if (nome.equals("0")) {
                break;
            }else {
                System.out.println("Digite idade");
            }
            idade = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Saindo...");
    }
}
