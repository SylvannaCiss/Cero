import java.util.Scanner;
import javax.swing.JOptionPane;
public class Cero{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String numero = JOptionPane.showInputDialog("Ingresa un numero: ");
        int numero1 = Integer.parseInt(numero);

        while(numero1 == 0){
            System.out.println("El numero no puede ser 0");
            numero = JOptionPane.showInputDialog("Ingresa un numero");
            numero1 = Integer.parseInt(numero);
        }
    }
}
    