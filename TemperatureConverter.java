import java.util.Scanner;

public class TemperatureConverter {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println("Fahrenheit = " + fahrenheit);
        sc.close();
    }
}
