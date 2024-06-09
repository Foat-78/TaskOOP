package SeminarD4;

public class Program {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        controller.create("1", "2", "3");
        controller.create("11", "16", "83");
        controller.create("16", "24", "73");
        controller.create("15", "28", "13");
        controller.printTeacherList();
    }
}
