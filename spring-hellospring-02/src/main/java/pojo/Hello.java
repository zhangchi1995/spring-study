package pojo;

public class Hello {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String sayHello(){
        return "hello" + this.name;
    }
}
