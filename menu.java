import java.util.Scanner;

public class menu {
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