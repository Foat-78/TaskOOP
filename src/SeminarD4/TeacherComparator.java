package SeminarD4;
import java.util.Comparator;
public class TeacherComparator <T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
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