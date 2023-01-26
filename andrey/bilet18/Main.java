package bilet18;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        /*myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(9);
        myArrayList.add(7);
        myArrayList.add(-3);
        myArrayList.add(0);
        myArrayList.add(42);
        myArrayList.add(308);
        myArrayList.add(17);*/
        System.out.println(myArrayList.longestSortedSequence());
    }
}
