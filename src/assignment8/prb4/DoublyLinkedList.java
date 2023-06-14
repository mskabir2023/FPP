package assignment8.prb4;

public class DoublyLinkedList {
	Node header;
	DoublyLinkedList(){
		header = new Node();
	}
	public void addLast(String item){
		Node presentNode = header;
		while (presentNode.next != null) {
			presentNode = presentNode.next;
		}

		Node node = new Node();
		node.value = item;
		node.previous = presentNode;
		presentNode.next = node;

	}
	public boolean remove(String item){
		Node prevNode = header;
		Node currentNode = header.next;

		while (currentNode.next!=null && currentNode.value!=null){
			if (currentNode.value.equals(item)){
				prevNode.next = currentNode.next;
				currentNode = currentNode.next;
				currentNode.previous = prevNode;
				return true;
			}else {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		return false;
	}
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}
	private void toString(StringBuilder sb, Node n) {
		if(n==null) return;
		if(n.value != null) sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;


		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Bill");
		list.addLast("Tom");
		list.addLast("Carol");
		System.out.println("After Adding The output is:"+list);

		list.remove("Tom");
		System.out.println("After removing Tom the output is:"+list);
	}
}

