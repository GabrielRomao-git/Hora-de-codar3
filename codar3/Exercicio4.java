
public class Exercicio4 {
    public static void main(String[] args) {
        double acumula = 0;
        int conta = -1;
        
        for(int i = 15; i <= 100; i++) {
            acumula += i;
            conta++;
        }

        System.out.println("A media e; " + (acumula/conta));

    }
}

