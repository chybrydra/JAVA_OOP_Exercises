package sortingbycomparator;

public class Employee implements Comparable<Employee> {

    private String name;
    private String secondName;
    private int age;
    private double shoeSize;

    public Employee(String name, String secondName, int age, double shoeSize) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.shoeSize = shoeSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }
}
