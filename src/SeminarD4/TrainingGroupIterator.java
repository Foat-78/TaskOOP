package SeminarD4;


import java.util.Iterator;
import java.util.List;
public class TrainingGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int counter = 0;

    public TrainingGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if(hasNext())
            return studentList.get(counter++);
        return null;
    }

    @Override
    public void remove() {
        if(hasNext()){
            studentList.remove(counter);
        }
    }
}
