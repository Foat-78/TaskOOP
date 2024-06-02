package Seminar4;
public class Program {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.create("1", "2", "3");
        controller.create("11", "16", "83");
        controller.create("16", "24", "73");
        controller.create("15", "28", "13");
        controller.printStudentList();

    }
}
