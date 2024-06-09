package TaskDZ4;

import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("Foat");
        arrayList.add(true);
        arrayList.add(new Employee("Timur"));
        for (Object o:arrayList) {
            if (o instanceof Employee){
                Employee e = (Employee) o;
                System.out.println(e.getName());
//                System.out.println(((Employee) o).getName()); // второй вариант
            }
        }
        System.out.println(arrayList);


        MyArrayList arrayList1 = new MyArrayList(new Object[5]);
        arrayList1.add(1);
        arrayList1.add("Toma");
        arrayList1.add(true);
        arrayList1.add(false);
        System.out.println(arrayList1);
        System.out.println(arrayList1.size());
    }
}
