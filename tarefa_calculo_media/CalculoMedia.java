import java.util.Scanner;

public class CalculoMedia {
   
	public static void main(String[] args) {
		
		int mediaFinal;
		int somaNotas; 
    	
		System.out.print("=========================================================\n");
		System.out.print("==========================================================\n");
    	System.out.print("************* Tarefa de calculo de media ***************** \n");
    	System.out.print("============================================================\n");
    	System.out.print("=============================================================\n\n");
    	
    	int primeiraNota;
    	Scanner scannerPrimeiraNota = new Scanner(System.in);
    	System.out.print("Digite o valor da primeira nota: \n");
    	primeiraNota = scannerPrimeiraNota.nextInt();
      
    	int segundaNota;
    	Scanner scannerSegundaNota= new Scanner(System.in);
    	System.out.print("Digite o valor da segunda nota: \n");
    	segundaNota = scannerPrimeiraNota.nextInt();
    	
    	int terceiraNota;
    	Scanner scannerTerceiraNota = new Scanner(System.in);
    	System.out.print("Digite o valor da terceira nota: \n");
    	terceiraNota = scannerTerceiraNota.nextInt();
      
    	int quartaNota;
    	Scanner scannerQuartaNota= new Scanner(System.in);
    	System.out.print("Digite o valor da quarta nota: \n");
    	quartaNota =scannerQuartaNota.nextInt();
    	
    	somaNotas = primeiraNota + segundaNota + terceiraNota + quartaNota;
    	mediaFinal = somaNotas / 4; 
    	
		//Calculo de media final das notas
    	if (mediaFinal >= 6) {
			System.out.print("Parabens você foi aprovado na materia, sua nota final foi " + mediaFinal);
		} else if (mediaFinal <= 5 && mediaFinal > 2 ) {
		   System.out.print("Você está de recuperação na materia, sua nota foi " + mediaFinal);
		} else if (mediaFinal <= 2){
		  System.out.print("Você está reprovado na disciplina, sua nota final foi " + mediaFinal);
		}
    	
	}
}
