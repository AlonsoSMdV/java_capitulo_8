import matematicas.Varias;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long decimal = 0;
        System.out.print("Introduzca un número binario: ");
        long binario = sc.nextLong();
        int bits = (int)matematicas.Varias.digitos(binario);
        for(int i = 0; i < bits; i++) {
            decimal += matematicas.Varias.digitoN(binario, bits - i - 1) * matematicas.Varias.potencia(2, i);
        }
        System.out.println(binario + " en binario es " + decimal + " en decimal.");
        sc.close();
    }
}
