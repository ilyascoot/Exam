package bilet29;

public class MyStack<E> {
    Object[] elements;
    int initialSize = 10;
    int currentElement;

    public MyStack(){
        elements = new Object[initialSize];
    }

    public void put(Object object){
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

    public E pop(){
        E toPop = (E) elements[currentElement - 1];
        currentElement--;
        return toPop;
    }

    private void refillArray(Object[] temp){
        for (int i = 0; i < temp.length; i++){
            elements[i] = temp[i];
        }
    }

}
