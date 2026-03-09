public class CasellaVuota extends Casella {
    private int x;
    private int y;
     public CasellaVuota() {
        super(0);
        this.x = 3;
        this.y = 3;
    }
    @Override
    public int getX() {
        return x;
    }
    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public int getY() {
        return y;
    }
    @Override
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "#";
    }
    public void sposta(Casella c){
        if(c.getX() - this.x > 1 || c.getX() - this.x < -1 || c.getY() - this.y > 1 || c.getY() - this.y < -1){
            System.out.println("Mossa non valida");
            return;
        }
        int tempX = c.getX();
        int tempY = c.getY();
        c.setX(this.x);
        c.setY(this.y);
        this.x = tempX;
        this.y = tempY;
    }
}
