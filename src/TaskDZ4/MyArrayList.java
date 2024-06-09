package TaskDZ4;


import java.util.Arrays;

public class MyArrayList {
    public Object[] array;
    public int lastIndex = -1;

    public MyArrayList(Object[] array) {
        this.array = array;
    }
    public int size(){
        return lastIndex + 1;
    }
    public int copacity() {
        return array.length;
    }

    public void add(Object item) {
        array[++lastIndex] = item;
    }

    @Override
    public String toString() {
         return Arrays.toString(array) ;
    }
}

