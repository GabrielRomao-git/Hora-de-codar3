import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Primeiro valor;");
        int  um = ler.nextInt();
        System.out.println("Segundo valor:");
        int dois = ler.nextInt();

        int acum = 0;
        int conta = -1;

        for(  ; um <= dois; um++) {
            acum += um;
            conta++;
        }

    System.out.println("A media e; " + (acum/conta));
    
    }
}