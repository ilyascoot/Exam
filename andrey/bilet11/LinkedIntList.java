package bilet11;

public class LinkedIntList {
    ListNode first;
    ListNode last;
    ListNode previous;

    public void add(int data){
        ListNode temp;
        if (first == null){
            first = new ListNode(data);
            previous = first;
        }
        else{
            temp = new ListNode(data);
            previous.next = temp;
            last = temp;
            previous = temp;
        }
    }

    public int get(int x){
        ListNode result = first;
        for (int i = 0; i < x; i++){
            result = result.next;
        }
        return result.data;
    }

    public void firstLast(){
        ListNode tempFirst = first;
        first = first.next;
        tempFirst.next = null;
        last.next = tempFirst;
        last = tempFirst;
    }

    public String toString(){
        String result = "[";
        ListNode current = first;
        while (true){
            if (current.next == null){
                result += current.data + "]";
                return result;
            }
            result += current.data + ", ";
            current = current.next;
        }
    }


}

class ListNode{
    int data;
    ListNode next;

    public ListNode(int data){
        this.data = data;
    }
}
