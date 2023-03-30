import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Student Alex1 = new Student("Alex1", "ZZZ", Human.Sex.male, 1, "vi42");
        Student AlexSt = new Student("Misha9", "YYY", Human.Sex.male, 2, "vi42");
        Student AlexSt2 = new Student("Misha8", "PPP", Human.Sex.male, 3, "vi42");
        Student AlexSt3 = new Student("Misha7", "LLL", Human.Sex.male, 4, "vi42");
        Student AlexSt4 = new Student("Misha6", "AAA", Human.Sex.male, 5, "vi42");
        Student AlexSt5 = new Student("Misha5", "CCC", Human.Sex.male, 6, "vi42");
        Student AlexSt6 = new Student("Misha4", "BBB", Human.Sex.male, 7, "vi42");
        Student AlexSt7 = new Student("Misha3", "OOO", Human.Sex.male, 8, "vi42");
        Student AlexSt9 = new Student("Misha2", "RRR", Human.Sex.male, 9, "vi42");
        Student AlexSt10 = new Student("Misha1", "EEE", Human.Sex.male, 10, "vi42");
        Student AlexSt11 = new Student("Misha", "DDD", Human.Sex.male, 10, "vi42");


        Group vi42 = new Group("vi42");

        try {
            vi42.addStudent(Alex1);
            vi42.addStudent(AlexSt);
            vi42.addStudent(AlexSt2);
            vi42.addStudent(AlexSt3);
            vi42.addStudent(AlexSt4);
            vi42.addStudent(AlexSt5);
            vi42.addStudent(AlexSt6);
            vi42.addStudent(AlexSt7);
            vi42.addStudent(AlexSt9);
            vi42.addStudent(AlexSt10);
            //vi42.addStudent(AlexSt11);


            System.out.println(vi42);

        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (vi42.searchStudentByLastName("FamilyTest") != null){
                System.out.println(vi42.searchStudentByLastName("FamilyTest"));
            } else {
                System.out.println(new StudentNotFoundException());
            }

        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        vi42.removeStudentByID(8);

        System.out.println(vi42);

       Collections.sort(vi42.students, new SortByName());
        System.out.println(vi42);



    }
}