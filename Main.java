package javaapplication3;


import java.util.Scanner;


public class Main {
	static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select = -1; //opción elegida del usuario
	static int num1 = 0, num2 = 0; //Variables
    private static double numero;
	
	public static void main(String[] args) {
		
		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("""
                                                   Elige opci\u00f3n:
                                                   1- Sumar
                                                   2- Restar
                                                   3- Multiplicar
                                                   4- Dividir
                                                   5- Potencia 
                                                   6- Raiz""");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1 -> {
                                    ingresar();
                                    System.out.println(num1+" + "+num2+" = "+(num1+num2));
                                }
				case 2 -> {
                                    ingresar();
                                    System.out.println(num1+" - "+num2+" = "+(num1-num2));
                                }
				case 3 -> {
                                    ingresar();
                                    System.out.println(num1+" * "+num2+" = "+(num1*num2));
                                }
				case 4 -> {
                                    ingresar();
                                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                                }
                                case 5 -> {
                                    ingresar();
                                     double resultado;
                                        resultado = Math.pow(num1,num2);
                                     System.out.println("La raíz cuadrada de " + num1 + " es " + resultado);
                                }

                                case 6 -> {
                                    ingresar();
                                     double resultado = Math.sqrt(num1);
                                     System.out.println("La raíz cuadrada de " + num1 + " es " + resultado);
                                }
				
				}
				
				System.out.println("\n");
				
			}catch(NumberFormatException e){
				System.out.println("Error");
			}
		}

	}
	
	//Método para recoger variables por consola
	public static void ingresar(){
		System.out.println("Introduce el Primer digito:");
		num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Introduce el segundo digito :");
		num2 = Integer.parseInt(scanner.nextLine());

		//Mostrar un salto de línea en Java
		System.out.println("\n"); 
	}

    private static void pideNumeros() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}