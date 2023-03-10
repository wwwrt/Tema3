public class Carte {
    private int nrPagini;

    public Carte(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public boolean equals(Carte carte) {
        return this.nrPagini == carte.nrPagini;
    }

    public static void main(String[] args) {
        Carte carte1 = new Carte(100);
        Carte carte2 = new Carte(200);

        System.out.println("Cartea 1 are acelasi numar de pagini cu Cartea 2? " + carte1.equals(carte2));
        System.out.println("Cartea 1 are acelasi numar de pagini cu o alta carte cu 100 pagini? " + carte1.equals(new Carte(100)));
    }
}
