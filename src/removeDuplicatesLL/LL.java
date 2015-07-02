package removeDuplicatesLL;

public class LL {
	Node head;
	int linksCount;
	
	LL(){
		head = new Node();
		linksCount = 0;
	}

	public int getLinksCount() {
		return linksCount;
	}

	public void setLinksCount(int linksCount) {
		this.linksCount = linksCount;
	}
	// ADD data
	public void addLast(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		Node temp = head;
		while (temp.getNext() != null){
			temp = temp.next;
		}
		temp.next = newNode;
		linksCount++;
		
	}
	public void addFirst(int data){
		add(0,data);
		
	}
	public void addFirst(Node n){
		add(0,n.getData());
		
	}
	public void add(int index, int data){
		Node newNode = new Node(data);
		Node temp = head;
		for(int i=1;i<index && (temp.getNext() != null);i++){
			temp = temp.next;
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		linksCount++;
	}
	//REMOVE DATA
	public int removeLast(){
		Node temp = head;
		while(temp.getNext().getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(null);
		linksCount--;
		return temp.getData();
	}
	
	public int remove(int index){
		Node temp = head;
		for(int i=0; i<=index && (temp.getNext().getNext() != null);i++)	{
			temp = temp.getNext();
		}
		temp.setNext(null);
		linksCount--;
		return temp.getData();
	}
	/*
	 * 
	 */
	public boolean remove(Node n){
		if(n == null || n.getNext() == null)
			return false;
		Node temp = n.getNext();
		n.setData(temp.data);
		n.setNext(temp.getNext());
		
		return true;
	}
	//TRAVERSE TO INDEX
	/*
	 * How to find nth element from the end of a singly linked list
	 */
	public Node getNodeAt(int index){
		Node temp= head;
		if(index > linksCount){
			System.out.println("index out of bound !");
			return null;
		}
		for(int i=0;i<index && (temp.getNext() != null);i++){
			temp = temp.getNext();
		}
		return temp;
	}
	//PRINT LIST
    public void printList(){
    	System.out.print("\nLinked List:");
    	Node temp = head;
    	
    	int i =0;
    	while(temp.getNext() !=null){
    		temp = temp.getNext();
    		System.out.print("|  "+i+"  | "+temp.toString()+"  |-->");
    		i++;
    	}
    	System.out.print("null");
    } 
}
class Node{
	Node next;
	int data;
	
	public Node() {
		this.next =  null;
		this.data = 0;
	}
	
	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}
	public Node(int data) {
		this.next = null;
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
    @Override
    public String toString(){
    	return data+"";
    }
}
