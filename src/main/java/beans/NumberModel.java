package beans;

public class NumberModel {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x >= 1 && x < 230){
            this.x = x;
        }else {
            this.x = 0;
        }
    }
}
