import java.math.BigInteger;

public class Student extends Human{

    int id; //(номер зачетки)
    String groupName; // (название группы где он учится)

    public Student() {
    }

    public Student(String name, String lastName, Sex sex) {
        super(name, lastName, sex);
    }

    public Student(String name, String lastName, Sex sex, int id, String groupName) {
        super(name, lastName, sex);
        this.id = id;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Student{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                '}';
    }

}
