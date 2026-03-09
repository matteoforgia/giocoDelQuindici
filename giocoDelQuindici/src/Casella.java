import java.util.Random;

public class Casella {
    Random rand = new Random();
    private int numero;
    private int x;
    private int y;
    public Casella(int numero) {
        this.numero = numero;
        this.x = rand.nextInt(4);
        this.y = rand.nextInt(4);
        
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
        @Override
    public String toString() {
        return String.valueOf(numero);
    }

}
