import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha um valor:");
        double um = ler.nextInt();
        System.out.println("Agora o segundo número:");
        double dois = ler.nextInt();
        while(dois <= 0) {
            System.out.println("Nao e valido receber um numero 0 ou negativo, tente novamente:");
            dois += ler.nextInt();
        }

        System.out.println("O resultado e de: " + (um / dois));
    }
}