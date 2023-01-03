import java.util.Comparator;

public class PessoaComparetor implements Comparator<String> {

    @Override
    public int compare(String pessoa1, String pessoa2) {
        String[] nomeGenero1 = pessoa1.split(",");
        String[] nomeGenero2 = pessoa2.split(",");
        int resultado = nomeGenero1[0].compareToIgnoreCase(nomeGenero2[0]);
        if (resultado == 0) {
            resultado = nomeGenero1[1].compareToIgnoreCase(nomeGenero2[1]);
        }
        return resultado;
    }
}
