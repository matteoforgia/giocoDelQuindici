import java.util.Random;

public class GiocoDelQuindici {
    Random rand = new Random();
    Casella[][] griglia = new Casella[4][4];
    public GiocoDelQuindici() {
        for (int i = 0; i < griglia.length; i++) {
            for (int j = 0; j < griglia[i].length; j++) {
                griglia[i][j] = new Casella(i * 4 + j + 1);
            }
        }
    }
}
