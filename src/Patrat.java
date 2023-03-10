public class Patrat {
    private int latura;

    public Patrat() {
        this.latura = 10;
    }

    public Patrat(int latura) {
        this.latura = latura;
    }

    public int getArie() {
        return latura * latura;
    }

    public void afisare() {
        System.out.println("Patrat " + latura + " Aria " + getArie());
    }

    public static void main(String[] args) {
        Patrat patrat1 = new Patrat();
        Patrat patrat2 = new Patrat(5);

        patrat1.afisare();
        patrat2.afisare();
    }
}
