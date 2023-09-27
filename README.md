
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

Calcula el promedio de tres notas ingresadas por el usuario utilizando la clase JOptionPane para mostrar los mensajes y obtener los valores. El programa crea un arreglo de tres elementos para almacenar las notas y luego calcula el promedio de las mismas. Finalmente, muestra las notas ingresadas y el promedio calculado en dos mensajes separados utilizando la clase JOptionPane. El programa se ejecuta en un contenedor de Java, como Eclipse, y se puede utilizar para calcular el promedio de notas de un estudiante.

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

Este menu se repite infinitamente hasta darle el numero 5 que sirve para salir del menu.

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

Explicar cómo ejecutar las pruebas automatizadas para este sistema.

### Dividir en pruebas de principio a fin

Este codigo realiza divison, hace que el usuario escriba dos numeros y el programa realice la division

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

Con esto podemos empeazr a codificar un odigo

```
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
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

...
## Construido con

Dropwizard : el marco web utilizado
Maven - Gestión de dependencias
ROMA : se utiliza para generar canales RSS

## Versionado

Usamos Git para el control de versiones. Para conocer las versiones disponibles, consulte las etiquetas en este repositorio .

## Autores

* **Jose Cabrera - Juan Jaramillo - Samuel Betancourt** 


## Licencia

Este proyecto tiene la licencia MIT; consulte el archivo LICENSE.md para obtener más detalles.

## Expresiones de gratitud (Acknowledgments)

* Un consejo para cualquiera cuyo código se haya utilizado
* Inspiración
* etc
