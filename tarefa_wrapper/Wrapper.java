import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {


        long valorPrimitivo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequencia de numerico seis numeros: ");
        valorPrimitivo = scanner.nextLong();
        System.out.println("Valor apresentado no modelo primitivo: " + valorPrimitivo);

        //Conversão para Wapper
        Short valorWrapper = (short) valorPrimitivo;

        System.out.println("Valor primitivo convertido para wapper: " + valorWrapper);





    }
}