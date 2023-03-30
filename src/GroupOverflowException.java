public class GroupOverflowException extends Exception{

    public String getMessage() {
        return "Group is full. Can't add new student.";
    }

}
