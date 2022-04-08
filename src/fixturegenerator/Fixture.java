package fixturegenerator;

public class Fixture {
    String name;

    public Fixture(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fixture{" +
                "name='" + name + '\'' +
                '}';
    }
}
