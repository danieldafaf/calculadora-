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
		System.out.println("1. Sumar: ");
		System.out.println("2. Restar: ");
		System.out.println("3. Multiplicar: ");
		System.out.println("4. Dividir: ");
		System.out.println("5. Salir: ");
		System.out.println("Seleccione una opción: ");
		
		opcion = entrada.nextInt();
		switch(opcion) {

			//suma
		case 1:
				
			System.out.println("Primer número");
			numero1= entrada.nextDouble();
			
			System.out.println("Segundo número");
			numero2= entrada.nextDouble();
			
			System.out.println("----------------------------");
			System.out.println("Resultado" + (numero1 + numero2));
			System.out.println("----------------------------");
		break;

				//resta 
				
		case 2:	
				
		    System.out.println("Primer número");
			numero1= entrada.nextDouble();
			
			System.out.println("Segundo número");
			numero2= entrada.nextDouble();
			
			System.out.println("----------------------------");
			System.out.println("Resultado" + (numero1 - numero2));
			System.out.println("----------------------------");
		break;

				//multiplicacion
			case 3:		

			System.out.println("Primer numero");
			numero1= entrada.nextDouble();
			
			System.out.println("Segundo número");
			numero2= entrada.nextDouble();
			
			System.out.println("----------------------------");
			System.out.println("Resultado" + (numero1 * numero2));
			System.out.println("----------------------------");
		break;

				//division
		case 4:
	
       System.out.println("Primer número");
			numero1= entrada.nextDouble();
			
			System.out.println("Segundo número");
			numero2= entrada.nextDouble();
			
			if (numero2 ==0) {
			System.out.println("No se puede dividir entre cero");
			} else {
			System.out.println("----------------------------");
			System.out.println("Resultado" + (numero1 / numero2));
			System.out.println("----------------------------");
			}
			System.out.println();
			break;   
				
		case 5:
			System.out.println("salió de la calculadora");
			break;

			default:
				System.out.println("Opcion no valida: Intentalo de nuevo:");
				System.out.println();
				break;
	}	
		
	}while (opcion !=5);
	
	}

}