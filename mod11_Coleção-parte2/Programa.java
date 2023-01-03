import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        ArrayList<Pessoa> masculinos = new ArrayList<Pessoa>();
        ArrayList<Pessoa> femininos = new ArrayList<Pessoa>();

        Scanner scanner = new Scanner(System.in);
        boolean avance = true;


        while (avance) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M ou F):");
            String sexo = scanner.next().toUpperCase();
            Pessoa pessoa = new Pessoa(nome, sexo);

            if (sexo.equalsIgnoreCase("M") || nome.isEmpty()) {
                masculinos.add(pessoa);
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos.add(pessoa);
            } else {
                System.out.println("Genero Invalido, tente novamente!");
            }
            System.out.print("Deseja incluir mais pessoas? (s) sim (n) não ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                avance = false;
            }
        }
        scanner.close();

        System.out.println("Pessoas do genero feminino: " + femininos);
        System.out.println("Pessoas do genero Masculino: " + masculinos);


        }

    }











