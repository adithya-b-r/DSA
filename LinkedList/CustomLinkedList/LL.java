public class LL {
  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if (tail == null) {
      tail = head;
    }

    size += 1;

    System.out.println("Node "+node);
    System.out.println("Node Next: "+node.next);
    System.out.println("Head: "+head);
    System.out.println("Head Value: "+head.value);
    System.out.println("Head Next: "+head.next);

    System.out.println("\n-----------------------------------------\n");
  }

  public void display() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}