package liziang;

public class student {
    private String name;
    private double socre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSocre() {
        return socre;
    }

    public void setSocre(double socre) {
        this.socre = socre;
    }

    public student(String name, double socre) {
        this.name = name;
        this.socre = socre;
    }

    public student() {
    }
}
