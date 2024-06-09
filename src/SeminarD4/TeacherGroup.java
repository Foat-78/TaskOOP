package SeminarD4;
import java.util.Iterator;
import java.util.List;
public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teacherList;
    public TeacherGroup(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    public List<Teacher> getTecherList() {
        return teacherList;
    }
    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }
    // как мы можем перебирать класс TeacherGroup
    @Override
    public Iterator<Teacher> iterator() {
        return new TrainingGroupIterator(teacherList);
    }
}
