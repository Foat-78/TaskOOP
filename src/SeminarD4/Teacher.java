package SeminarD4;
public class Teacher extends User implements Comparable<Teacher>{
    private  int teacherId;
    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return String.format("Teacher -> teacherId: %s, firstName: %s, lastName: %s, secondName: %s",
                teacherId, super.getFirstName(), super.getLastName(), super.getSecondName());
                }
    @Override
    public int compareTo(Teacher o) {
        /**
         * Первый вариант
         */
//        return Integer.compare(teacherId, o.getTeacherId());
        /**
         * Второй вариант
         */
        if(teacherId > o.getTeacherId())
            return 1;
        if (teacherId < o.getTeacherId())
            return -1;
        return 0;
    }
}
