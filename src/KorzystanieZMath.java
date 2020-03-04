public class KorzystanieZMath {
    public static void main(String[] args) {
        System.out.println("Liczba PI wynois: " + Math.PI);
        System.out.println("Liczba E wynosi: " + Math.E);
        System.out.println("Sinus 90 stopni wynosi: " + Math.sin(90));
        System.out.println("Zaokrąglona liczba PI wynosi: " + Math.round(Math.PI));
        System.out.println("Pierwiastek liczby 100 wynosi: " + Math.sqrt(100));
        System.out.println("Pierwiastek liczby 5 wynosi:  " + Math.sqrt(5));
        System.out.println("Pierwiastek liczby 10 + liczba PI wynosi:" + Math.sqrt(10)+ ", " + Math.PI);

        double z = 10;
        double a = 45;

        double x = Math.PI + a + Math.sqrt(z);

        System.out.println(x);

    }
}
