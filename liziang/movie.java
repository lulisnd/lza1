package liziang;

public class movie {
    private int id;
    private String name;
    private double price;
    private double score;
    private String actor;

    public movie() {
    }

    public movie(int id, String name, double price, double score, String actor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
