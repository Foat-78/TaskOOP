package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(4, "FFF", "FFF", "FFF");
        Student student1 = new Student(3, "BBB", "BBB", "BBB");
        Student student2 = new Student(1, "GGG", "GGG", "GGG");
        Student student3 = new Student(2, "AAA", "AAA", "AAA");

        StudyGroup studyGroup = new StudyGroup(new ArrayList<>());
        studyGroup.addStudent(student);
        studyGroup.addStudent(student1);
        studyGroup.addStudent(student2);
        studyGroup.addStudent(student3);



        System.out.println("1. Реализация интерфейса Comparable<Student> ");
        System.out.print(student.compareTo(student1) < 0 ? "Студент 2 больше студента 1\n" : "Студент 1 больше студента 2\n");


        TrainingGroupIterator iterator = new TrainingGroupIterator(studyGroup.getStudentList());
        printStudent1(iterator);

        printStudent(studyGroup);

        System.out.println("\n`````````5. Сортировка студентов по ID - значению```````");
        StudentGroupService service = new StudentGroupService(studyGroup);
        printListStudent(service.getSortedStudentGroup());

        System.out.println("\n`````````6. Сортировка студентов по FIO - значению```````");
        StudentGroupService service1 = new StudentGroupService(studyGroup);
        printListStudent(service1.getSortedStudentGroupByFIO());
    }
    static void printStudent1(TrainingGroupIterator iterator) {
        System.out.println("-------------------------------------------------------------\n``````2. Вариант реализации со стандартным интерфейсом Iterator``````");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
    static void printStudent(StudyGroup studyGroup) {
        // вариант через for i
        System.out.println("-------------------------------------------------------------\n``3. Вариант реализации со стандартным интерфейсом Iterable через for i``");
        for (int i = 0; i < studyGroup.getStudentList().size(); i++) {
            System.out.println(studyGroup.getStudentList().get(i));
        }
        // реализация цикла через foreche
        System.out.println("-------------------------------------------------------------\n``4. Вариант реализации со стандартным интерфейсом Iterable через foreche``");
        for (Student student : studyGroup) {
            System.out.println(student);
        }
    }


    static void printListStudent(List<Student> students){
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
