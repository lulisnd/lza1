package jishi;

public class tuzi implements CanMove{

    private String name = "兔子";
    private int x = 2;
    private int y = 0;

    public tuzi() {
    }

    public tuzi(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void MoveHorizontal() {
        for (int i = 0; i < 4; i++) {
            y ++;
            x ++;
            System.out.println("(" + x + "," + y +")");
            if (y == 4 & x == 4){
                System.out.println("到达(4,4)");
                for (int j = 0; j < 4; j++) {
                    y --;
                    x--;
                    System.out.println("(" + x + "," + y +")");
                    if (y == 0 & x == 0){
                        System.out.println("到达(0,0)");
                    }
                }
            }
        }
    }

    @Override
    public void MoveVertical() {

    }
}

