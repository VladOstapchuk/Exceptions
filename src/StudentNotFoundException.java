public class StudentNotFoundException extends Exception{

    public String getMessage() {
        return "Student is not found in this group";
    }
}
