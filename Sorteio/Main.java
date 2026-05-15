import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        // sorteia número de 1 a 6
        int numero = aleatorio.nextInt(6) + 1;

        System.out.println("Número sorteado: " + numero);

        switch (numero) {

            case 1:
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   *   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;
            
            case 2:
                System.out.println("+-------+");
                System.out.println("| *     |");
                System.out.println("|       |");
                System.out.println("|     * |");
                System.out.println("+-------+");
                break;

            case 3:
                System.out.println("+-------+");
                System.out.println("| *     |");
                System.out.println("|   *   |");
                System.out.println("|     * |");
                System.out.println("+-------+");
                break;
                
            case 4:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("|       |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;

            case 5:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("|   *   |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;

            case 6:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
        }
    }
}