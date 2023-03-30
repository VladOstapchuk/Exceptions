import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Group implements Comparator<Student> {

    String groupName; // (название)
    List<Student> students = new ArrayList<Student>(10);

    public Group(String groupName, List<Student> students) {
        this.groupName = groupName;
        this.students = students;
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    //(метод добавления студента в группу. В случае
    //добавления 11 студента должно быть возбужденно пользовательское исключение)
    public void addStudent(Student student) throws GroupOverflowException {


        if (students.size() < 10) {
            students.add(student);
        } else {
                throw new GroupOverflowException();
            }

    }

//    метод поиска студента в группе.
    //  Если студент не найден должно быть возбужденно пользовательское исключение

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {

        for (Student student_i: students)
            { if (student_i.getLastName().contains(lastName)) {
                return student_i;
                }
            }
        return null;
    }


    //(метод удаления студента по номеру зачетки, вернуть true если такой студент был и он
    //    был удален и false в противном случае)
    public boolean removeStudentByID(int id) {
        for (Student student_i: students)
            {
                if (student_i.id == id) {
                    students.remove(student_i);
                    return true;
                }

        }
        return false;
    }






    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + students +
                '}';
    }
}
