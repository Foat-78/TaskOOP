package Seminar4;

import java.util.Iterator;
import java.util.List;
public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudyGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    // как мы можем перебирать класс StudentGroup
    @Override
    public Iterator<Student> iterator() {
        return new TrainingGroupIterator(studentList);
    }
}
