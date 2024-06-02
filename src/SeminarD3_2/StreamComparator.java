package SeminarD3_2;

import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {
    @Override
    public int compare(Flow o1, Flow o2) {
       return  Integer.compare(o1.countID(), o2.countID());
//        return Integer.compare(o2.countID(), o1.countID()); // Перевёрнутый список

    }
}
