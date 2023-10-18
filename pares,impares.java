package Apo2;

public class pares {
    import java.util.Scanner;
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int n=sc.nextInt();
		if (n==0) {
			System.out.print("0");
		}
		else if (n%2==0) {
			System.out.print("par");
		}
		
		else if (n/2!=0){
			System.out.print("impar");
		}
	}
	}
}

    
