package main;
import linkedlist.*;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		System.out.println("===============================================");
		System.out.println("               Integer LinkedList              ");
		GenericLinkedList<Integer>IntList = new GenericLinkedList<Integer>();
		IntList.getList();
		
		GenericNode<Integer> I1=new GenericNode<Integer>();
		I1.setData(1);
		IntList.addGenericNode(I1);
		I1 = new GenericNode<Integer>();
		I1.setData(2);
		IntList.addGenericNode(I1);
		I1 = new GenericNode<Integer>();
		I1.setData(3);
		IntList.addGenericNode(I1);
		I1 = new GenericNode<Integer>();
		I1.setData(4);
		IntList.addGenericNode(I1);
		I1 = new GenericNode<Integer>();

		GenericNode<Integer> I1GenericNode=IntList.getList();
		do 
		{
			System.out.println(I1GenericNode.getData());
			I1GenericNode=I1GenericNode.getNextNode();
		} while (I1GenericNode!=null);
		
		System.out.println("===============================================");
		System.out.println("               Double LinkedList               ");
		
		GenericLinkedList<Double> DubList = new GenericLinkedList<Double>();
		DubList.getList();
		
		GenericNode<Double> D1=new GenericNode<Double>();
		D1.setData(3.14159);
		DubList.addGenericNode(D1);
		D1 = new GenericNode<Double>();
		D1.setData(2.71828);
		DubList.addGenericNode(D1);
		D1 = new GenericNode<Double>();
		D1.setData(1.6180);
		DubList.addGenericNode(D1);
		D1 = new GenericNode<Double>();
		D1.setData(6.0221515);
		DubList.addGenericNode(D1);
		
		GenericNode<Double> D1GenericNode=DubList.getList();
		do 
		{
			System.out.println(D1GenericNode.getData());
			D1GenericNode=D1GenericNode.getNextNode();
		} while (D1GenericNode!=null);
		
		System.out.println("===============================================");
		System.out.println("               String LinkedList               ");
		
		GenericLinkedList<String> StringList = new GenericLinkedList<String>();
		StringList.getList();
		
		GenericNode<String> S1=new GenericNode<String>();
		S1.setData("Zac");
		StringList.addGenericNode(S1);
		S1 = new GenericNode<String>();
		S1.setData("Taylor");
		StringList.addGenericNode(S1);
		S1 = new GenericNode<String>();
		S1.setData("Hank");
		StringList.addGenericNode(S1);
		S1 = new GenericNode<String>();
		S1.setData("Reba");
		StringList.addGenericNode(S1);
		
		GenericNode<?> S1GenericNode=StringList.getList();
		do 
		{
			System.out.println(S1GenericNode.getData());
			S1GenericNode=S1GenericNode.getNextNode();
		} while (S1GenericNode!=null);

	}//end main

}//end class
