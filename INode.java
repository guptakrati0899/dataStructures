package linkedlist;

public interface INode<K> {
	
	INode next = null;
	INode data = null;
	K getKey();
	void setKey(K key);
	
	INode getNext();
	void setNext(INode next);
	

}
