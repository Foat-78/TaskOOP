package Seminar4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StudentGroupService {
    private StudyGroup studyGroup;

    public StudentGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(studyGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studyGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }
}
