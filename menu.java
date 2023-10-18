package Apo2;
import javax.swing.JOptionPane;
public class menu {
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
            int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoge una opcion\n 1: SUMA\n 2: RESTA\n 3: MULTIPLICACION\n 5: SALIR DEL MENU",  "BIENVENIDO AL MENU", 3));
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
                        JOptionPane.showMessageDialog(null, "SALISTE DEL MENU ", "MENU", 2);
                            break;
    
                default:
                        JOptionPane.showMessageDialog(null, "NO VALIDO", "ERROR", 0);
                            break;
                }
           }
     }
}

