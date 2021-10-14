public class Student implements Comparable<Student>{
    private String firstName, lastName;
    private int studentNum;

    public Student(String firstName, String lastName, int studentNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNum = studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(studentNum, otherStudent.studentNum);
//        return firstName.compareTo(otherStudent.firstName);
    }

    public String toString()
    {
        return String.format("%d-%s %s", studentNum, firstName,lastName);
    }
}
