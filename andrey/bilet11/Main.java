package bilet11;

public class Main {
    public static void main(String[] args) {
        LinkedIntList linkedIntList = new LinkedIntList();
        linkedIntList.add(1);
        linkedIntList.add(2);
        linkedIntList.add(3);
        linkedIntList.add(4);
        linkedIntList.add(5);

        System.out.println(linkedIntList);
        linkedIntList.firstLast();
        System.out.println(linkedIntList);
    }
}
