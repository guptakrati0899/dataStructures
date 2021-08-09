package linkedlist;

public class MyLinkedList<K> {
	
	
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
		
		
		public void insert(INode myNode , INode newNode) {
			
			INode tempNode = myNode.getNext();
			myNode.setNext(newNode);
			newNode.setNext(tempNode);
	}

		public INode pop() {
			
			INode tempNode = this.head;
			this.head = head.getNext();
			return tempNode;
		}
		
		public INode popLast() {
			
			INode tempNode = head;
			while(!tempNode.getNext().equals(tail)) {
				tempNode = tempNode.getNext();
			}
			this.tail = tempNode;
			tempNode = tempNode.getNext();
			return tempNode;
		}
		
		   class Node{  
		        int data;  
		        Node next;  
		          
		        public Node(int data) {  
		            this.data = data;  
		            this.next = null;  
		        }  
		    }  
		   
		   public  INode search(K key) { 
		        int i = 1;  
		        boolean flag = false;  
		      
			INode tempNode = head;
			while(tempNode != null && tempNode.getNext()  != null) {
				
				if(tempNode.getKey().equals(key)) {  
		                flag = true;  
		                break;  
		        }  
		        i++;  
		        tempNode = tempNode.getNext();  
		    }   
		    if(flag) {
		    	System.out.println("Element is present in the list at the position : " + i);
		    	return tempNode;
			}
		    return null;
			}
		
		
		

		public void popEle(K key) {
			INode<K> tempNode = this.head;
			INode<K> temp;
			while(tempNode!=null) {
				temp = tempNode;
				if(tempNode.getNext().getKey() == key) {
					temp.setNext(tempNode.getNext().getNext());
					tempNode.getNext().setNext(null);
					System.out.println("Element deleted: " + key);
					break;
				}
				tempNode=tempNode.getNext();
				if(tempNode.getNext()==null && tempNode.getKey()!= key)
				{
					System.out.println("Element "+key+" not found");
					break;
				}
			}	
		}
		
		public void delete(K key) {
			INode<K> tempNode = this.head;
			INode<K> tempNode1 = this.head;
			int i=1,length=0;
			while(tempNode!=null) {
				if(tempNode.getKey() == key) {
					break;
				}
				i++;
				tempNode=tempNode.getNext();
				if(tempNode.getNext()==null && tempNode.getKey()!= key)
				{
					System.out.println("Element "+key+" not found");
					break;
				}
			}
			while(tempNode1!=null) {
				length++;
				tempNode1=tempNode1.getNext();
			}
			if(i==1){
				pop();
			}
			else if(i==length) {
				popLast();
			}
			else {
				popEle(key);
			}
		}

		@Override
		public String toString() {
			 return "MyLinkedListNodes{" + head + '}';
		}

		
		


		
			
}
		

			
	
		

