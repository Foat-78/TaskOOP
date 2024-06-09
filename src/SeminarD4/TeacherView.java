package SeminarD4;

import java.util.List;

public class TeacherView<T extends User> {
    void sendOnConsole(List<T> users){
        for (T user: users) {
            System.out.println(user);
        }
    }
}