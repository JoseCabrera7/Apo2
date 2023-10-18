package Apo2;

public class multiplicacion {{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
            int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
            int numero2 = sc.nextInt();
            int resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
}
}
