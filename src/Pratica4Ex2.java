import java.util.Scanner;

public class Pratica4Ex2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    audiencia();
    }

    public static void audiencia(){
        double[][] value = new double[5][2];
        //Esquerda canal, direita audiencia

        System.out.println("Escreva o primeiro canal e em seguida sua audiencia.");

        value[0][0] = scanner.nextDouble();
        scanner.nextLine();
        if(value[0][0] <= 0){
            System.err.println("Valor Igual ou menor a 0");
            System.exit(1);
        }
        value[0][1] = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escreva o segundo canal e em seguida sua audiencia.");

        value[1][0] = scanner.nextDouble();
        scanner.nextLine();
        if(value[1][0] <= 0){
            System.err.println("Valor Igual ou menor a 0");
            System.exit(1);
        }

        value[1][1] = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escreva o terceiro canal e em seguida sua audiencia.");

        value[2][0] = scanner.nextDouble();
        scanner.nextLine();
        if(value[2][0] <= 0){
            System.err.println("Valor Igual ou menor a 0");
            System.exit(1);
        }

        value[2][1] = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escreva o quarto canal e em seguida sua audiencia.");

        value[3][0] = scanner.nextDouble();
        scanner.nextLine();
        if(value[3][0] <= 0){
            System.err.println("Valor Igual ou menor a 0");
            System.exit(1);
        }

        value[3][1] = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escreva o quinto canal e em seguida sua audiencia.");

        value[4][0] = scanner.nextDouble();
        scanner.nextLine();
        if(value[4][0] <= 0){
            System.err.println("Valor Igual ou menor a 0");
            System.exit(1);
        }

        value[4][1] = scanner.nextDouble();
        scanner.nextLine();

        double percent = value[0][1] + value[1][1] + value[2][1] + value[3][1] + value[4][1];
        double percentx = 0;

        for(int i = 0; i < 5; i++){
            percentx = (value[i][1]*100)/percent;
            System.out.printf("\nO percentual do canal " + i);
            System.out.printf(" e de %.2f por cento", percentx);
        }



    }
}
