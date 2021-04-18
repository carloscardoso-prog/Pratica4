import java.util.Scanner;

public class Pratica4Ex3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }

    public static void prefeitura(){

        int[][] popmedia = new int[5][2];

        //direita salario, esquerda filhos
        System.out.println("Digite os filhos da primeira familia e em seguida o salario");
        popmedia [0][0] = scanner.nextInt();
        scanner.nextLine();
        popmedia [0][1] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite os filhos da segunda familia e em seguida o salario");
        popmedia [1][0] = scanner.nextInt();
        scanner.nextLine();
        popmedia [1][1] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite os filhos da terceira familia e em seguida o salario");
        popmedia [2][0] = scanner.nextInt();
        scanner.nextLine();
        popmedia [2][1] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite os filhos da quarta familia e em seguida o salario");
        popmedia [3][0] = scanner.nextInt();
        scanner.nextLine();
        popmedia [3][1] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite os filhos da quinta familia e em seguida o salario");
        popmedia [4][0] = scanner.nextInt();
        scanner.nextLine();
        popmedia [4][1] = scanner.nextInt();
        scanner.nextLine();

        int mediasal=0, mediafil=0;

            for (int i = 0; i < 2; i++) {
                mediafil =+ popmedia[i][1];
                mediasal =+ popmedia[i][0];
            }

            mediafil = (mediafil)/popmedia.length;
            //nao usei length antes por que esqueci e como ja fiz os codigos trocar vai demorar, desculpa professor nao tira minha nota porfavor

            mediasal = (mediasal)/popmedia.length;

        System.out.println("A media de filhos e " + mediafil);
        System.out.println("E a media de salario e " + mediasal);
    }

}
