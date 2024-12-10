public class prisma {
    public static double calcularPrisma(double altura, double lado){
        double volume = 0.0;

        volume = (3 * Math.sqrt(3) * lado * lado * altura) / 2.0;

        return volume;
    }
}
