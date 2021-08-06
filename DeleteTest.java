package linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DeleteTest {

	@Test
	public void test() {
		MyNode <Integer> myFirstNode = new MyNode<>(56);
		MyNode <Integer> mySecondNode = new MyNode<>(30);
		MyNode <Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.pop();
		
		
		boolean result = myLinkedList.head.equals(mySecondNode) && 
		         myLinkedList.head.getNext().equals(myThirdNode)  ;
		        
				Assert.assertTrue(result);
	}

}
