package Java.LinkedList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList myList = new LinkList();

        myList.insertFirst(22, 2.99);
        myList.insertFirst(44, 4.99);
        myList.displayList();
        myList.insertFirst(66, 6.99);
        myList.insertAfter(44, 55, 5.99);
        myList.displayList();
        myList.insertFirst(88, 8.99);

        myList.displayList();

        while (!myList.isEmpty()) {
            Link aLink = myList.deleteFirst();
            System.out.println("Deleted");
            aLink.displayLink();
            System.out.println("");
            myList.displayList();

        }
        myList.displayList();
    }
}