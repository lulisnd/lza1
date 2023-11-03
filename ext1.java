package exten;

public class ext1 extends Object {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public ext1() {
    }

    public ext1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    public String toString (){
    return "you{name=" + name + ",age=" + age + "}";
    }
}
