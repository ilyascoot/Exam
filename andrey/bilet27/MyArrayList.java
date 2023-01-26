package bilet27;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyArrayList<T> {
    Object[] elements;
    int initialSize = 4;
    int currentElement = 0;


    public MyArrayList(){
        elements = new Object[initialSize];
    }

    public void add(Object object){
        Object[] temp = elements;
        if (currentElement >= initialSize){
            initialSize += 1;
            elements = new Object[initialSize];
            refillArray(temp);
            elements[currentElement] = object;
        }
        else{
            elements[currentElement] = object;
        }
        currentElement++;
    }

    public Object get(int x){
        return elements[x];
    }

    public String toString(){
        String toReturn = "";
        for (Object elem: elements) {
            toReturn += elem.toString();
        }
        return toReturn;
    }

    private void refillArray(Object[] temp){
        for (int i = 0; i < temp.length; i++){
            elements[i] = temp[i];
        }
    }


}
