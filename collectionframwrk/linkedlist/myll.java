package linkedlist;

public class myll<E> {
    
    public static class Node<E> {
		public E data;
		public Node<E> next;

		public Node(E data) {

			this.data = data;
			next = null;
		}
	}

    Node<E> head;

	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);

		if (isEmpty()) {
			head = toAdd;
			return;
		}

		Node<E> temp = head;

		while (temp.next != null) {

			temp = temp.next;
		}
    
		temp.next = toAdd;
	}

    public void addFirst(E data){
        Node<E> toAdd = new Node<E>(data);

		if (isEmpty()) {
			head = toAdd;
			return;
		}

        toAdd.next = head;
        head = toAdd;

    }

	void print() {
		Node<E> temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
        System.out.print(temp.data);
        System.out.println();
	}

	public boolean isEmpty() {
		return head == null;
	}

	public E removeLast() throws Exception {
		Node<E> temp = head;

		if (temp == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}

		if (temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}

		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null; 
        return toRemove.data;
	}

    public E removeFrist() throws Exception{

		if (head == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}

		Node<E> temp = head;
		head = temp.next;
		temp.next = null;

		return temp.data;

    }

	public E getLast() throws Exception {
		Node<E> temp = head;

		if (temp == null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}



}
