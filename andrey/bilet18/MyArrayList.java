package bilet18;

public class MyArrayList {
    Object[] elements;
    int initialSize = 0;
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

    public int longestSortedSequence(){
        if (elements[0] == null){
            return 0;
        }

        int last = (int) elements[0];
        int maxLength = 1;
        int currentSequence = 0;
        for (int i = 1; i < elements.length; i++){

            if (last <= (int) elements[i]){
                currentSequence += 1;
            }
            else {
                if (maxLength < currentSequence){
                    maxLength = currentSequence;
                    currentSequence = 0;
                }
            }

            last = (int) elements[i];
        }
        return maxLength;
    }

    private void refillArray(Object[] temp){
        for (int i = 0; i < temp.length; i++){
            elements[i] = temp[i];
        }
    }


}
