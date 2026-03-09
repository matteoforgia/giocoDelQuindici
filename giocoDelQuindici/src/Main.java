public class Main {
    public static void stampaGriglia(Casella[][] griglia) {
        for (int i = 0; i < griglia.length; i++) {
            for (int j = 0; j < griglia[i].length; j++) {
                System.out.print(griglia[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GiocoDelQuindici gioco = new GiocoDelQuindici();
        gioco.griglia[3][3] = new CasellaVuota();
        stampaGriglia(gioco.griglia);
    }
}
