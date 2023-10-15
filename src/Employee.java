public class Employee {

    private int id;
    private String name;
    private String city;
    private int age;
    private Position position;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String city, int age, Position position) {
        if (position == null) throw new NullPointerException("Position is null");
        this.name = name;
        this.city = city;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return name + ", " + city + ", " + age + ", " + position.getName();
    }
}
