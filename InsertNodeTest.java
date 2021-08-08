package linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class InsertNodeTest {

	@Test
	public void test() {
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.insert(mySecondNode, myThirdNode);
		myLinkedList.printNodes();
		
		boolean result = myLinkedList.head.equals(myFirstNode) && 
		         myLinkedList.head.getNext().equals(mySecondNode) &&	         
		         myLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
	}

}
