public class Piramida {
    private int n;

    public Piramida(int n) {
        this.n = n;
    }

    public void afisare() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Piramida piramida1 = new Piramida(4);
        Piramida piramida2 = new Piramida(7);

        piramida1.afisare();
        System.out.println();
        piramida2.afisare();
    }
}
