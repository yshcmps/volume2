import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = 0.0, altura = 0.0, lado = 0.0, comprimento = 0.0, largura = 0.0;
        double volume = 0.0;
        int opcao = 0;

        do{
            System.out.println("\n--------------------------------------------------------");
            System.out.println("   Programa para calcular volume de figura geometrica   ");
            System.out.println("--------------------------------------------------------");
            System.out.println("   1 - Volume do Cilindro");
            System.out.println("   2 - Volume do Cone");
            System.out.println("   3 - Volume do Prisma");
            System.out.println("   4 - Volume do Esfera");
            System.out.println("   5 - Volume do Cubo");
            System.out.println("   6 - Volume do Pirâmide Quadrangular");
            System.out.println("   7 - Volume do Paralelepído");
            System.out.println("   0 - Sair");
            System.out.println("\n\n\n");
            System.out.println("   Escolha a sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cilindro.calcularCilindro(raio, altura);
                    System.out.printf("\nO volume do cilindro é: %.2f",volume);
                    break;

                case 2:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = cone.calcularVolume(raio, altura);
                    System.out.printf("\nO volume do cone é: %.2f",volume);
                    break;

                case 3:
                    System.out.println("Digite o valor lado: ");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = prisma.calcularPrisma(raio, altura);
                    System.out.printf("\nO volume do Prisma é: %.2f",volume);
                    break;

                case 4:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();

                    volume = esfera.calcularEsfera(raio);
                    System.out.printf("\nO volume da esfera é: %.2f",volume);
                    break;

                case 5:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();

                    volume = esfera.calcularEsfera(raio);
                    System.out.printf("\nO volume do cubo é: %.2f",volume);
                    break;

                case 6:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = piramide.PiramideQuadrangular(lado, altura);
                    System.out.printf("\nO volume da pirâmide quadrangular é: %.2f",volume);
                    break;

                case 7:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = paralelepipedo.calcularParalelepíedo(comprimento, largura, altura);
                    System.out.printf("\nO volume do paralelepído é: %.2f",volume);
                    break;

                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        }while (opcao != 0);

        sc.close();
    }
}
