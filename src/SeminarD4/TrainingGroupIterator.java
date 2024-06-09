package SeminarD4;
import java.util.Iterator;
import java.util.List;
public class TrainingGroupIterator implements Iterator<Teacher> {
    private List<Teacher> teacherList;
    private int counter = 0;

    public TrainingGroupIterator(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    @Override
    public boolean hasNext() {
        return counter < teacherList.size();
    }
    @Override
    public Teacher next() {
        if(hasNext())
            return teacherList.get(counter++);
        return null;
    }
    @Override
    public void remove() {
        if(hasNext()){
            teacherList.remove(counter);
        }
    }
}