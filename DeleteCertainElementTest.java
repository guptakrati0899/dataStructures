package linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DeleteCertainElementTest {

	@Test
	public void test() {
		

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(40);
		MyNode<Integer> myThirdNode = new MyNode<>(30);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.add(myFourthNode);
		myLinkedList.printNodes();
		myLinkedList.delete(40);
		myLinkedList.printNodes();
		
		boolean result = myLinkedList.head.equals(myFourthNode) && 
		         myLinkedList.head.getNext().equals(myThirdNode)  && 
		         myLinkedList.tail.equals(myFirstNode);
Assert.assertTrue(result);
	}

}
