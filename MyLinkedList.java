package linkedlist;

public class MyLinkedList {
	
	
		public INode head;
		public INode tail;
		
		public MyLinkedList() {
			this.head = null;
			this.tail = null;
			}

		public void add(INode newNode) {
			// TODO Auto-generated method stub
			if(this.tail == null) {
				this.tail = newNode;
			}
			if(this.head == null) {
				this.head = newNode;
			}else {
				INode tempNode = this.head;
				this.head = newNode;
				this.head.setNext(tempNode);
			}
		}
		
		public void printNodes(){
			StringBuffer myNodes = new StringBuffer("My Nodes : ");
			INode tempNode = head;
			while(tempNode.getNext() != null) {
				myNodes.append(tempNode.getKey());
				if(!tempNode.equals(tail)) myNodes.append("->");
				tempNode = tempNode.getNext();
			}
			myNodes.append(tempNode.getKey());
			System.out.println(myNodes);
		}

		public void append(INode newNode) {
			// TODO Auto-generated method stub
			if(this.head == null) {
				this.head = newNode;
			}
			if(this.tail == null) {
				this.tail = newNode;
			}else {
				this.tail.setNext(newNode);
				this.tail = newNode;
			}
		}
		
		
		public void insert(INode mynode , INode newNode) {
			
			INode tempNode = mynode.getNext();
			mynode.setNext(newNode);
			newNode.setNext(tempNode);
	}

		public INode pop() {
			
			INode tempNode = this.head;
			this.head = head.getNext();
			return tempNode;
		}
}

