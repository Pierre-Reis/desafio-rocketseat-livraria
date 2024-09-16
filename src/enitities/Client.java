package enitities;

public class Client {

    private static int idCounter = 0;

    private Integer id;
    private String name;

    public Client(String name) {
        this.name = name;
        this.id = idCounter++;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}