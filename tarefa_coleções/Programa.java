import java.util.*;

public class Programa {
    public static void main(String[] args) {

        /**
         * Tarefa parte 1 - Criando um array com nomes e guardando dentro de um map com chave e valor
         */
        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("******** Tarefa primeira parte *******************");
        System.out.println("==================================================");
        System.out.println("==================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes depessoas separados por ,");

        String resposta = scanner.next();
        String[] ordenados = resposta.split(",");
        Arrays.sort(ordenados, String.CASE_INSENSITIVE_ORDER);

        /**
         * Ordenando em forma de lista normal
         */
        for (String nome : ordenados) {
            System.out.println(nome);
        }

        /**
         * Ordenando em TreeMap com chave e valor
         */
        TreeMap<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < ordenados.length; i++) {
            map.put(i, ordenados[i]);
            System.out.println("Ordenados com chave e valor: "+ map.entrySet());
        }

        /**
         * Tarefa parte 2 - Criando um array com nome e genero e separando por grupos
         */
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("******** Tarefa segunda parte *************");
        System.out.println("===========================================");
        System.out.println("===========================================");

        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        System.out.println("Digite os nome e sexo da pessoa (M ou F), separados por ,");
        String resposta2 = scanner.next();
        String[] nomesGenero = resposta2.split(",");
        Arrays.sort(nomesGenero, new PessoaComparetor());

        for (String pessoa : nomesGenero) {
            String[] nomeGenero = pessoa.split("");
            String nome = nomeGenero[0];
            String genero = nomeGenero[1].replace(" ", "");
            if (genero.equalsIgnoreCase("F")) {
                femininos.add(nome);
            } else if (genero.equalsIgnoreCase("M")) {
                masculinos.add(nome);
            }
        }
        System.out.println("Femininos: " + femininos);
        System.out.println("Masculinos: " + masculinos);
    }
}
