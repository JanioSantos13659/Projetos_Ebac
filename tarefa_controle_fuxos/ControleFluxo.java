import java.util.Scanner;

public class ControleFluxo {

    public static void main(String[] args) {

        int primeiraNota;
        int segundaNota;
        int terceiraNota;
        int quartaNota;
        int medialFinal = 4;
        int somaDasNotas;

        Scanner scannerPrimeiraNota = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        primeiraNota = scannerPrimeiraNota.nextInt();

        Scanner scannerSegundaNota = new Scanner(System.in);
        System.out.println("Digite o valor da primeira not:a ");
        segundaNota = scannerSegundaNota.nextInt();

        Scanner scannerTerceiraNota = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        terceiraNota =scannerTerceiraNota.nextInt();

        Scanner scannerQuartaNota = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        quartaNota =scannerQuartaNota.nextInt();


        somaDasNotas = primeiraNota + segundaNota + terceiraNota + quartaNota ;
        medialFinal = somaDasNotas / medialFinal;

        ///Condicional para verificar a media das notas;
        if (medialFinal >= 7 && medialFinal > 10) {
            System.out.println("Parabêns, você foi aprovado, sua nota final foi: "+ medialFinal);
        } else if (medialFinal >= 5 ) {
            System.out.println("Você está de Recuperação, sua nota final foi: "+ medialFinal);
        } else {
            System.out.println("Você está de Reprovado,sua nota final foi: " + medialFinal);

        }

    }

}
