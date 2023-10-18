
# Algoritmos y Programacion 2

Los algoritmos son secuencias de pasos lógicos que permiten solucionar un problema, y pueden ser expresados de muchas maneras, incluyendo lenguaje natural, pseudocódigo, diagramas de flujo y lenguajes de programación. La programación es el proceso de escribir código para crear programas informáticos, y los algoritmos son el paso previo a la programación. 

### Eclipse

![Logo Eclipse](https://i.ytimg.com/vi/tqzwoJ_eZAk/hqdefault.jpg)


```
package apoII;
import javax.swing.JOptionPane;
public class MENUTALLER {
	
	public static void main(String[] args) {
	    int numero;
	    while (true) {
	        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero:", "FACTORIAL", 3));
	        if (numero < 0) {
	            JOptionPane.showMessageDialog(null, "ERROR el numero de ser positivo", "ERROR", 0);
	            continue;
	        }
	        else if (numero == 0) {
	            break;
	        }
	        
	        int factorial = calcularFactorial(numero);
	        JOptionPane.showMessageDialog(null, "El factorial de " + numero + "es: " + factorial, "FACTORIAL", 1);
	        JOptionPane.showMessageDialog(null, "¿Desea calcular el factorial de otro número? ", "FACTORIAL", 2);
	    }
	}
		public static int calcularFactorial(int n) {
			int factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial *= i;
	    }
			return factorial;
	}
}
```

### Instalación

Encuentra el promedio de tres calificaciones proporcionadas por el usuario utilizando la clase JOptionPane para mostrar mensajes y recopilar los valores. El programa utiliza un arreglo de tres elementos para almacenar las calificaciones y realiza el cálculo del promedio. Luego, presenta las calificaciones ingresadas y el promedio calculado en dos mensajes distintos a través de la clase JOptionPane. Este programa se ejecuta en un entorno Java como Eclipse y es útil para calcular el promedio de calificaciones de un estudiante.

```
package apoII;
import javax.swing.JOptionPane;
public class CONTENEDOR {
	
	public static void main(String[] args) {	
		
		double notas[] = new double [3];
		double promedio;
			notas[0]=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese una nota ", "SUMA", 1));
			notas[1]=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese una nota ", "SUMA", 1 ));
			notas[2]=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese una nota ", "SUMA", 1));
		
				promedio=(notas[0]+notas[1]+notas[2])/3;
		
				JOptionPane.showMessageDialog(null, "Las notas " + notas[0] + "  " + notas[1]+ "  " + notas[2]);
				JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
}
}
```

Este menu se repite infinitamente hasta colocar el numero 5 que sirve para salir del menu.

```
package apoII;
import javax.swing.JOptionPane;
public class MENU3 {
	
	public static int suma(int a, int b) {
		return a+b;
}
public static int resta(int c, int d) {
		return c-d;
}
public static int multiplicacion(int e, int f) {
		return e*f;
}
public static int division(int g, int p) {		
		return g/p;
}
public static void main(String[] args) {
	int opcion = 0;
	while (opcion!=5) {
		int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoge una opcion\n 1: SUMA\n 2: RESTA\n 3: MULTIPLICACION\n 4: DIVISION\n 5: SALIR DEL MENU",  "BIENVENIDO AL MENU", 3));
		switch(opcion1) {
			case 1:
				int x = 15;
				int y = 20;
				int z = suma(x,y);
				System.out.println(z);
					JOptionPane.showMessageDialog(null, "SUMA: "+z, "MENU", 1);
						break;

			case 2:
			
				int r = 15;
				int t = 20;
				int u = resta(r,t);
				System.out.println(u);
					JOptionPane.showMessageDialog(null, "RESTA: "+u,"MENU", 1);
						break;
			case 3:
				
				int l = 15;
				int s = 20;
				int w = multiplicacion(l,s);
				System.out.println(w);
					JOptionPane.showMessageDialog(null, "MULTIPLICACION : "+w ,"MENU", 1);
						break;
			case 4:
				
				int m = 30;
				int k = 10;
				float q = division(m,k);
				System.out.println(q);
					JOptionPane.showMessageDialog(null, "DIVISION: "+q, "MENU", 1);
						break;
			case 5:
					JOptionPane.showMessageDialog(null, "SALISTE DEL MENU ", "MENU", 2);
						break;

			default:
					JOptionPane.showMessageDialog(null, "NO VALIDO", "ERROR", 0);
						break;
			}
		}
	}
}

```
## Ejecutando las pruebas

Este codigo realiza una divison, hace que el usuario escriba dos numeros y el programa realice la division

```
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		 System.out.print("Ingrese el primer número: ");
      		  double num1 = scanner.nextDouble();
		System.out.print("Ingrese el segundo número: ");
		double num2 = scanner.nextDouble();
        if (num2 == 0) {
           	 System.out.println("No se puede dividir por cero.");
        } else {
		double divide = num1 / num2;
           	 System.out.println(num1 + " / " + num2 + " = " + divide);
        }
        scanner.close();
    }
}

```

### Codificación.

Con este codigo podemos empezar a codificar un codigo

```
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}

```
En este codigo el usuario digita tres numeros y el programa los suma y los divide
```
package Calculo;
import java.util. Scanner;
public class Promedio
{
	public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
		System.out.print ("Ingrese Calificaciones");|
		float n1 = sc. nextFloat ();
		float n2 = sc. nextFloat ();
		float n3 = sc.nextFloat();
		float prom = (n1 + n2 + n3)/3;
	System. out. print (prom);
}
}
```
En este codigo el usuario digita el valor que quiere que el programa convierta de pesos a dolar
```
import java. util. Scanner;
public class Conversor (
	public static void
	main (String [] args)
		Scanner S-new Scanner (System. 1n);
			System. out.print ("Ingrese Valor Pesos Colombianos");
			double valor = sc.nextDouble ();
				double dolar = valor/19.5;
			System.out print ("Valor Dolares:
			System. out.print (dolar);
}
}
```
En este codigo el usuario digita los partidos ganados, perdidos y empatados y el programa calcula cuantos puntos tendria
```
import java.util.Scanner;

public class Partidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.print("Ingrese el número de partidos ganados: ");
        int ganados = sc.nextInt();
       		 System.out.print("Ingrese el número de partidos empatados: ");
        int empatados = sc.nextInt();
       		 System.out.print("Ingrese el número de partidos perdidos: ");
        int perdidos = sc.nextInt();
        int total = ganados + empatados + perdidos;
        	System.out.println("El equipo ha jugado un total de " + total + " partidos.");
        	System.out.println("Ha ganado " + ganados + " partidos, empatado " + empatados + " partidos y perdido " + perdidos + " partidos.");
    }
}

```
En este codigo el usuario digita los numeros y el programa realiza la suma y resta
```
import java.util.Scanner;

public class SumaResta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
       		 System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        	System.out.println("La suma de los números es: " + suma);
		System.out.println("La resta de los números es: " + resta);
    }
}

```
## Menu

Se utiliza para proporcionar una interfaz gráfica de usuario, para que los usuarios puedan interactuar con el programa.
```
package apoII;
import javax.swing.JOptionPane;
public class MENU2 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, " 1: Conversor de moneda\n 2: Promedio de notas\n 3: Partidos\n 4: Pares e impares\n 5: Salida", "BIENVENIDO AL MENU",-1);
		int opcion=0;
		while (opcion!=5) {
		int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoge una opcion\n 1: Conversor de moneda\n 2: Promedio de notas\n 3: Puntaje de partidos\n 4: Pares e impares\n 5: Salida", "BIENVENIDO AL MENU", 3));
		int resultado;
			switch(opcion1) {
				case 1:
						int pesos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los pesos a calcular", "MENU", 2));
						int dolar = 5000;
						resultado=(pesos/dolar);
						JOptionPane.showMessageDialog(null, "El resultado en dolar es: "+resultado, "MENU", 1);
							break;
			
			
				case 2:
						int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese nota 1", "MENU", 2));
						int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese nota 2", "MENU", 2));
						int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese nota 3", "MENU", 2));
						int promedio1 = (nota1+nota2+nota3)/3;
						JOptionPane.showMessageDialog(null, "El promedio de notas es:"+promedio1, "MENU", 2);
							break;
		
				case 3:
						int pg = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de partidos ganados", "MENU", 2));
						int pp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de partidos perdidos", "MENU", 2));
						int pe = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de partidos empatados", "MENU", 2));
						int resultado1=(pg*3)+(pe*1)+(pp*0);
						JOptionPane.showMessageDialog(null, "El puntaje del Real Madrid es: "+resultado1, "MENU", 1);
							break;
			
				case 4:
						int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "MENU", 2));
						if(numero%2==0) {
						JOptionPane.showMessageDialog(null, "El numero es par ", "MENU", 1);
						}
						else if(numero%2==1){
							JOptionPane.showMessageDialog(null, "El numero es impar ", "MENU", 1);
						}
							break;

				case 5:
						JOptionPane.showMessageDialog(null, "Saliste del menu ", "MENU", 1);
							break;
		
				default:
						JOptionPane.showMessageDialog(null, "NO VALIDO", "ERROR", 0);
							break;
			}
		}
	}
}
```

## Construido con

Dropwizard : el marco web utilizado
Maven - Gestión de dependencias
ROMA : se utiliza para generar canales RSS

## Versionado

Eclipse (Version 2022-12)

## Autores

* **Jose Cabrera - Juan Jaramillo - Samuel Betancourt** 

## Licencia

Este proyecto tiene la licencia MIT; consulte el archivo LICENSE.md para obtener más detalles.

## Expresiones de gratitud (Acknowledgments)

* Un consejo para cualquiera cuyo código se haya utilizado
* Inspiración
* etc

