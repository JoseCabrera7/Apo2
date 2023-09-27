
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

Una serie de ejemplos paso a paso que le indican cómo ejecutar un entorno de desarrollo.

Di cuál será el paso.

```
Give the example
```

Y repetir

```
until finished
```

Termine con un ejemplo de cómo sacar algunos datos del sistema o usarlos para una pequeña demostración.

## Ejecutando las pruebas

Explicar cómo ejecutar las pruebas automatizadas para este sistema.

### Dividir en pruebas de principio a fin

Explique qué prueban estas pruebas y por qué.

```
Give an example
```

### Y pruebas de estilo de codificación.

Explique qué prueban estas pruebas y por qué.

```
Give an example
```

## Despliegue (Deployment)

Agregue notas adicionales sobre cómo implementar esto en un sistema en vivo


## Construido con

Dropwizard : el marco web utilizado
Maven - Gestión de dependencias
ROMA : se utiliza para generar canales RSS

## Versionado

Usamos Git para el control de versiones. Para conocer las versiones disponibles, consulte las etiquetas en este repositorio .

## Autores

* **Gustavo Sánchez** 


## Licencia

Este proyecto tiene la licencia MIT; consulte el archivo LICENSE.md para obtener más detalles.

## Expresiones de gratitud (Acknowledgments)

* Un consejo para cualquiera cuyo código se haya utilizado
* Inspiración
* etc
