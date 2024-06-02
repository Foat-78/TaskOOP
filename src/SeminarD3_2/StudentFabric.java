package SeminarD3_2;
import java.util.Random;
public class StudentFabric {
    private static Random random = new Random();
    public static Flow generateFlow(){
        String[] names =
                new String[]{"Анатолий", "Петр", "Сергей", "Василий", "Михаил", "Дмитрий"};
        String[] surNames =
                new String[]{"Анатольев", "Петрович", "Сергеев", "Васильев", "Соловьёв", "Бабич"};
        String[] nameFlow =
                new String[]{"Инженер", "Программист", "Экономист", "Финансист", "Лётчик", "Космонавт"};
        int studentId = random.nextInt(1, 5);
        return new Flow(nameFlow[random.nextInt(nameFlow.length)],
                studentId,
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)]
        );
    }
    public static Flow[] generateStudent(int count){
        Flow[] flow = new Flow[count];
        for (int i = 0; i < count; i++) {
            flow[i] = generateFlow();
        }
        return flow;
    }
}
