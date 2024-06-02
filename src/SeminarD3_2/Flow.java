package SeminarD3_2;


public class Flow implements Comparable<Flow>{
    /**
     * Сравнение по surName
     * @param o the object to be compared.
     * @return
     */
//    @Override
//    public int compareTo(Student o) {
//        int surNameRes = surName.compareTo(o.surName);
//        if (surNameRes == 0){
//            return name.compareTo(o.name);
//        }
//        return surNameRes;
//    }

    /**
     * Сравнение по nameFlow
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Flow o) {
        return nameFlow.compareTo(o.nameFlow);

    }
    protected String nameFlow;
    /**
     * ID студента
     */
    protected  int studentId;
    /**
     * Имя студента
     */
    protected String name;
    /**
     * Фамилия студента
     */
    protected String surName;

    public Flow(String nameFlow, int studentId, String surName, String name) {
        this.studentId = studentId;
        this.name = name;
        this.surName = surName;
        this.nameFlow = nameFlow;
    }
    public int countID() {
        return studentId;
    }
    @Override
    public String toString() {
        return String.format("Поток: %s -> ID:%d -> %s %s", nameFlow, studentId, surName,name);
    }
}
