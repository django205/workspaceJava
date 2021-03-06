package datastructurres;
import java.util.*;
public class ReverseLinkedList {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void push(int newdata){
		Node newNode=new Node(newdata);
		newNode.next=head;
		head=newNode;
	}
	void insertAfter(Node prev,int data){
		if(prev==null){
			System.out.println("prev node can't be null");
		return;
		}
		
	Node newNode=new Node(data);
	newNode.next=prev.next;
	prev.next=newNode;
	}
	
	void append(int data){
		if(head==null){
			head=new Node(data);
			return;
		}
		
		Node temp=head;
		Node newNode=new Node(data);
		while(temp.next!=null){
			temp=temp.next;
			
		}
		newNode.next=null;
		temp.next=newNode;
	}
	void printList(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	void delete(int key){
		Node temp=head;
		Node prev=null;
		//case 1
		if(temp!=null&&temp.data==key){
			head=temp.next;   //head node itself contains the key to be deleted
			return;
		}
		//case 2
		while(temp!=null&&temp.data!=key){
			prev=temp;  //keep track of previous node
			temp=temp.next;
		}
		//case 3
		if(temp==null) return;   //if key is not present
		prev.next=temp.next;
	}
	
	
	Node reverseLL(Node head){
		if(head==null||head.next==null){
			return head;
		}
		
		Node rest=reverseLL(head.next);
		head.next.next=head;
		head.next=null;
		return rest;
		
	}
	
//	Node mergeList(Node headA,Node headB){
//		Node result=null;
//		if(headA==null) return headB;
//		if(headB==null)  return headA;
//		if(headA.data<=headB.data){
//			result=headA;
//			result.next=mergeList(headA.next,headB);
//		}else{
//			result=headB;
//			result.next=mergeList(headA,headB.next);
//		}
//		return result;
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList ll=new ReverseLinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.printList();
		head=ll.reverseLL(head);
	
		System.out.println("reverse linked list      ");
		ll.printList();

	}

}
