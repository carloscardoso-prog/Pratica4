import java.util.Scanner;

public class Pratica4 {
    static Scanner scanner = new Scanner(System.in);

    static int aprov=0;
    static int reprov=0;

    public static void main(String[] args) {

        nota();
    }

    public static void nota(){
        double n1,n2,n3,n4,n5,m, mn;
        int f1,f2,f3,f4,f5;

        System.out.println("Favor escrever as notas dos cinco alunos");
        n1 = scanner.nextDouble();
        scanner.nextLine();
        m = n1;
        mn = n1;

        if(n1 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        n2 = scanner.nextDouble();
        scanner.nextLine();
        if(m<n2){
            m=n2;
        }else if(mn > n2){
            mn = n2;
        }

        if(n2 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        n3 = scanner.nextDouble();
        scanner.nextLine();
        if(m<n3){
            m=n3;
        }else if(mn > n3){
            mn = n3;
        }

        if(n3 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        n4 = scanner.nextDouble();
        scanner.nextLine();
        if(m<n4){
            m=n4;
        }else if(mn > n4){
            mn = n4;
        }

        if(n4 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        n5 = scanner.nextDouble();
        scanner.nextLine();
        if(m<n5){
            m=n5;
        }else if(mn > n5){
            mn = n5;
        }

        if(n5 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        System.out.println("Favor escrever as faltas dos cinco alunos");
        f1 = scanner.nextInt();
        scanner.nextLine();
        notaApvRep(n1,f1);

        if(f1 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        f2 = scanner.nextInt();
        scanner.nextLine();
        notaApvRep(n2,f2);

        if(f2 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        f3 = scanner.nextInt();
        scanner.nextLine();
        notaApvRep(n3,f3);

        if(f3 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        f4 = scanner.nextInt();
        scanner.nextLine();
        notaApvRep(f4,f4);

        if(f4 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        f5 = scanner.nextInt();
        scanner.nextLine();
        notaApvRep(n5,f5);

        if(f5 <0){
            System.err.println("Valor Negativo");
            System.exit(1);
        }

        System.out.println("Alunos aprovados: " + aprov);
        System.out.println("Alunos reprovados (nota/falta): " + reprov);
        System.out.println("Maior nota: " + m);
        System.out.println("Menor nota: " + mn);
        System.out.println("Media: " + ((n1+n2+n3+n4+n5)/5));

    }

    public static void notaApvRep(double n, int fal) {

            if (n > 89) {
                if (fal >= 20) {
                    reprov++;
                }
                aprov++;

            } else if (n < 70) {
                reprov++;
            }

    }


}
