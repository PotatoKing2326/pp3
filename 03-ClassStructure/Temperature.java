public class Temperature {
    
    static double CelciusToFahrenheit(double temp) {
        return 1.8 * temp + 32;
    }

    static double CelciusToKelvin(double temp) {
        return temp + 273;
    }

    static double FahrenheitToCelcius(double temp) {
        return (temp -32) * 5 / 9;
    }

    static double FahrenheitToKelvin(double temp) {
        return FahrenheitToCelcius(temp) + 273;
    }

    static double KalvinToCelcius(double temp) {
        return temp - 273;
    }

    static double KalvinToFahrenheit(double temp) {
        return 1.8 * KalvinToCelcius(temp) + 32;
    }

    public static void main(String[] args) {
        System.out.println(CelciusToFahrenheit(100));
        System.out.println(CelciusToKelvin(100));
        System.out.println(FahrenheitToCelcius(100));
        System.out.println(FahrenheitToKelvin(100));
        System.out.println(KalvinToCelcius(100));
        System.out.println(KalvinToFahrenheit(100));
    }
}
