package SeminarD3_2;

import java.util.Arrays;
public class Program {
    public static void main(String[] args) {
        System.out.println("\n***************ОТСОРТИРОВАННЫЙ СПИСОК по НАЗВАНИЮ ПОТОКА*******************\n");
        Flow[]flows = StudentFabric.generateStudent(15);
        for (Flow flow: flows) {
            System.out.println(flow);
        }
        System.out.println("\n***************ОТСОРТИРОВАННЫЙ СПИСОК по НАЗВАНИЮ ПОТОКА*******************\n");

        Arrays.sort(flows); // Сортировка по названию потока

        for (Flow flow: flows) {
            System.out.println(flow);
        }

        System.out.println("\n***************ОТСОРТИРОВАННЫЙ СПИСОК по ID*******************\n");
        Arrays.sort(flows, new StreamComparator()); // Сортировка по ID
        for (Flow flow: flows) {
            System.out.println(flow);
        }

    }

}
