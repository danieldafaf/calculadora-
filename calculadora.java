package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in);
	
	int opcion;
	
	double numero1;
	double numero2;
	

	do {
		System.out.println("----Calculadora----");
		System.out.println("1.sumar");
		System.out.println("2.restar");
		System.out.println("3.multiplicar");
		System.out.println("4.dividir");
		System.out.println("5.salir");
		System.out.println("Seleccione una opcion: ");
		
		opcion = entrada.nextInt();
		switch(opcion) {

			//suma
		case 1:
			System.out.println("Primer numero");
			numero1= entrada.nextDouble();
			
			System.out.println("Segundo numero");
			numero2= entrada.nextDouble();
			
			System.out.println("----------------------------");
			System.out.println("Resultado" + (numero1 + numero2));
			System.out.println("----------------------------");
		break;

				//resta 
				
			case 2:	
		    System.out.println("Primer numero");
			numero1= entrada.nextDouble();
			
			System.out.println("Segundo numero");
			numero2= entrada.nextDouble();
			
			System.out.println("----------------------------");
			System.out.println("Resultado" + (numero1 - numero2));
			System.out.println("----------------------------");
		break;

				//multiplicacion
			case 3:		

			System.out.println("Primer numero");
			numero1= entrada.nextDouble();
			
			System.out.println("Segundo numero");
			numero2= entrada.nextDouble();
			
			System.out.println("----------------------------");
			System.out.println("Resultado" + (numero1 * numero2));
			System.out.println("----------------------------");
		break;
			
		case 5:
			System.out.println("salio de la calculadora");
			break;
	}	
		
	}while (opcion !=5);
	
	}

}
