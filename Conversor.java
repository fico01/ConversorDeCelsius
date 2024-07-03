import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double C, K, Re, Ra, F;

        System.out.println("Digite o valor de temperatura Cº: ");
        C = scan.nextDouble();

        //F = C * 1.8 + 32;
        //K = C + 273.15;
        //Re = C * 0.8;
        //Ra = C * 1.8 + 32 + 459.67
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("O valor digitado equivale a: \nFahrenheit(F): " + F + "\nKelvin(K): " + K + "\nRéaumur(Re): " + Re + "\nRankine(Ra): " + Ra);
    }
}
