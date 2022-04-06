import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/* IMPLEMENTACION DEL PROGRAMA DEL HOSPITAL CON VECTORHEAP
 * 
 * LA CALSE VECTOR HEAP SE OBTUVO DEL LIBRO DEL CURSO 'JAVA STRUCTURES' DEL AUTOR DUANE A. BAILEY,
 * AL IGUAL QUE LA INTERFAZ PRIORITYQUEUE. AMBAS IMPLEMENTACIONES TAMBIEN ESTABAN DISPONIBLES EN EL MODULO
 * SOBRE PRIORITYQUEUE EN CANVAS
 * 
 * JUAN LORTHIOIS
 * NIKOLAS BADANI
 * 
 */



public class Main {

	
	public static VectorHeap<Paciente> cola_pacientes = new VectorHeap<Paciente>();
	
	
	public static void lector() {
		
		
			
			Scanner in2 = new Scanner(System.in);
			System.out.println(" ");
			System.out.println("	----------------------- INICIALIZACION DE LA COLA DE PACIENTES -----------------------");
			System.out.println(" ");
			System.out.println("	INGRESE LA DIRECCION URL DEL ARCHIVO DE TEXTO (Ej: C:\\\\Users\\\\fulanito\\\\pacientes.txt)");
			System.out.println(" ");
			System.out.print("	DIRECCION -> ");
			
			
			String dic;
			
				try {
					
					dic = in2.nextLine();
					
					BufferedReader reader = new BufferedReader(new FileReader(dic));
					
					String linea;
					
					while((linea = reader.readLine()) != null) {
						
						String[] datos = linea.split(",");
						
						cola_pacientes.add(new Paciente(datos[0], datos[1], datos[2]));
						
						
					}
					
					reader.close();
					
				} catch(IOException e) {
					
					System.out.println("HAY UN ERROR CON LA DIRECCCION DEL ARCHIVO O NO FUE POSIBLE LEERLO");
					lector();
			}
				
			
		
		
	}
	
	
	public static void prompt() {
		
		
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println(" ");		
		System.out.println("	------------------------------ HOSPITAL CON VECTOR HEAP -----------------------------");
		System.out.println(" ");		
		System.out.println("		1. PARA LLAMAR AL SIGUIENTE PACIENTE (EN ORDEN DE PRIORIDAD)");
		System.out.println("		2. PARA SALIR");
		System.out.println(" ");		
		System.out.println("	-------------------------------------------------------------------------------------");
		System.out.println(" ");		
		System.out.print("		SELECCION -> ");
		
		int seleccion; 
		
		try {
			
			seleccion = in.nextInt();
			
			if (seleccion < 1 || seleccion > 2 ) { 
				
				System.out.println("LA SELECCION INGRESADA ES INVALIDA ");
				prompt();
				
			} else if (seleccion == 1) {
				try {
					
				Paciente paciente = cola_pacientes.remove();
				
				System.out.println(" ");
				System.out.println("           " + paciente.nombre + ", "+ paciente.sintoma + ", " +paciente.codigo);
				prompt();
				
				}catch(Exception ArrayIndexOutOfBoundsException) {
					System.out.println(" ");
					System.out.println("          	¡ YA NO HAY PACIENTES!");
					System.out.println(" ");
					System.out.println(" 		  	¡HASTA PRONTO!");
					System.exit(0);
				}
			}
			
			if (seleccion == 2) {
				System.out.println(" ");
				System.out.println(" 		  	¡HASTA PRONTO!");
				System.exit(0);
			}
			
			
			
		} catch (java.util.InputMismatchException e) {
			
			System.out.println(" ");
			System.out.println("LA SELECCION INGRESADA ES INVALIDA - VOLVIENDO AL MENU");
			
			prompt();
		}
		
		
	}
	
	
	
	
	
	public static void main(String args[]) {
		
		lector();
		prompt();
		
	}
	
	
	
	
	
	
}
