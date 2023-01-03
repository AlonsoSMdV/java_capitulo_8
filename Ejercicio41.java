import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();
        for (int i = altura; i > 0; i--) {
            System.out.println(linea('*', i));
        }
        sc.close();
    }
    public static String linea(char caracter, int repeticiones) {
        String resultado = "";
        for (int i = 0; i < repeticiones; i++) {
            resultado += caracter;
        }
        return resultado;
    }
}