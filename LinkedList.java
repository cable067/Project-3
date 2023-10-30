public class LinkedList<T extends Comparable<T>> implements List<T>{
    private Node first; //first node of a non-headed list

    public LinkedList(){
        first = new Node<T>(null, null);  //Initializes list to empty list

    }
}
