package Seminar4;
public class Student extends User implements Comparable<Student>{
    private  int studentId;
    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                " studentId = " + studentId +
//                super.toString() +
                " firstName = " + super.getFirstName() +
                " lastName = " + super.getLastName() +
                " secondName =" + super.getSecondName() +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        /**
         * Первый вариант
         */
//        return Integer.compare(studentId, o.getStudentId());
        /**
         * Второй вариант
         */
        if(studentId > o.getStudentId())
            return 1;
        if (studentId < o.getStudentId())
            return -1;
        return 0;
    }
}
