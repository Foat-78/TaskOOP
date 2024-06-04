package SeminarD4;


import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComporing = o1.getSecondName().compareTo(o2.getSecondName());
        if(resultOfComporing == 0){
            resultOfComporing = o1.getFirstName().compareTo(o2.getSecondName());
            if (resultOfComporing == 0){
                return o1.getLastName().compareTo(o2.getLastName());
            }else {
                return resultOfComporing;
            }
        }else {
            return resultOfComporing;
        }
    }
}
