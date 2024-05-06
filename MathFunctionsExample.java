public class MathFunctionsExample {
    public static void main(String[] args) {
        double angle = Math.PI / 4; // 45 degrees in radians

        System.out.println("Sin(" + angle + "): " + Math.sin(angle));
        System.out.println("Cos(" + angle + "): " + Math.cos(angle));
        System.out.println("Tan(" + angle + "): " + Math.tan(angle));

        System.out.println("Exp(2): " + Math.exp(2));
        System.out.println("Log(10): " + Math.log(10));
        System.out.println("Sqrt(25): " + Math.sqrt(25));

        System.out.println("Ceil(4.3): " + Math.ceil(4.3));
        System.out.println("Floor(4.8): " + Math.floor(4.8));
        System.out.println("Round(4.5): " + Math.round(4.5));

        System.out.println("Random: " + Math.random());
    }
}
