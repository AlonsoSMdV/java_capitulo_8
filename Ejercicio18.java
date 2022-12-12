import matematicas.Varias;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número en base diez para pasarlo a binario: ");
        int decimal = sc.nextInt();
        System.out.println(decimal + " en decimal es " + decimalABinario(decimal) + " en binario.");
        sc.close();
    }
    public static long decimalABinario(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        long binario = 1;
        while (decimal > 1) {
            binario = matematicas.Varias.pegaPorDetras(binario, decimal % 2);
            decimal = decimal / 2;
        }
        binario = matematicas.Varias.pegaPorDetras(binario, 1);
        binario = matematicas.Varias.voltea(binario);
        binario = matematicas.Varias.quitaPorDetras(binario, 1);
        return binario;
    }
}
