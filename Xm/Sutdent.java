package Xm;

public class Sutdent {
    private String name;

    public Sutdent() {
    }

    public Sutdent(String name, char sex, double socre) {
        this.name = name;
        this.sex = sex;
        this.socre = socre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSocre() {
        return socre;
    }

    public void setSocre(double socre) {
        this.socre = socre;
    }

    private char sex;
    private double socre;
}
