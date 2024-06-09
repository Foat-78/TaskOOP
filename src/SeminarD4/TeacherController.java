package SeminarD4;
import java.util.ArrayList;
public class TeacherController implements UserController<Teacher> {
    TeacherGroup teachers = new TeacherGroup(new ArrayList<>());
    TeacherView<Teacher> teacherView = new TeacherView<>();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        if(!teachers.getTecherList().isEmpty())
            maxId = teachers.getTecherList().get(teachers.getTecherList().size()-1).getTeacherId() +1;
        Teacher teacher = new Teacher(maxId, firstName, secondName, lastName);
        teachers.addTeacher(teacher);
    }
    void printTeacherList(){
        teacherView.sendOnConsole(teachers.getTecherList());
    }
}

