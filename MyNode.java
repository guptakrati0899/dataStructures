package linkedlist;

public class MyNode<K> implements INode<K> {
	
	private K key=null;
	private INode next=null;
	
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}
	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}
	
	public INode<K> getNext() {
		return next;
	}
	
	public void setNext(INode next) {
		this.next = (MyNode<K>)next;
	}

	
}



