public class Human {

    private String name;
    private String lastName;
    private Sex gender;

    enum Sex{
        male,
        female
    }

    public Human() {
    }

    public Human(String name, String lastName, Sex sex) {
        gender = sex;
        this.name = name;
        this.lastName = lastName;

    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
