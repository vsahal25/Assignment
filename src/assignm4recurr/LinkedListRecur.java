package assignm4recurr;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class LinkedListRecur<T extends Comparable<T>> {

	LinkedNodeRecur<T> head=new LinkedNodeRecur<T>();
	LinkedNodeRecur<T> node=new LinkedNodeRecur<T>();
	LinkedNodeRecur<T> tail=node, n = node, n1 = null;
	static int i=0,index=0,k=0;
	Boolean order;

	public LinkedNodeRecur<T> getFirst(){
		System.out.println("The Head is :"+head.data);
		return head;
	}

	public void getLast(){
		if(tail.next!=null) {
			tail=tail.next;
			System.out.println("The Tail is :"+tail.data);
			getLast();
		}

	}

	public LinkedNodeRecur<T> create(T data) {
		LinkedNodeRecur<T> newNode=new LinkedNodeRecur<T>();
		newNode.data=data;
		newNode.next=null;
		return newNode;
	}

	public LinkedNodeRecur<T> add(T data,LinkedNodeRecur<T> n){
		if (i==0){ 
			head=create(data);
			node=head;
			i++;
		}else {
			if(node.next!=null) {
				node=node.next;
				node=add(data,node);
			}else { 
				node.next=create(data);
			}

		}

		return head; 
	}

	public void print(LinkedNodeRecur<T> n) {

		if(n.next!=null){
			System.out.println(n.data);
			n=n.next;
			print(n);
		}else
			System.out.println(n.data);

	} 


	public void sortTech(Boolean order,LinkedNodeRecur<T> before,LinkedNodeRecur<T> after){
		if(before.next==null){
			return;
		}
		T x=before.data;
		T y=after.data;
		Boolean check=false;
		if((order==true) && (x.compareTo(y)<0)) {
			check=true;
		}else if((order==false) && (x.compareTo(y)>0)) {
			check=true;
		}
		if(check==true) {
			T temp = before.data;
			before.data = after.data;
			after.data = temp;
		}
		if(after.next==null)
			sortTech(order,before.next,before.next.next);
		else
			sortTech(order,before,after.next);
	}

	public void deleteAt(int index){
		if(index==0){
			node = node.next;
		}else{

			int i=0;
			if(i<index-1){
				n = n.next;
				deleteAt(i++);
			}n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}

	@SuppressWarnings("unused")
	public int find(T x,LinkedNodeRecur<T> n){


		if(n.next!=null){
			if(n.data.equals(x)) { 
				k= index;	
			}else {
				index++;
				int i=find(x,n.next);

			}

		}

		return k;	

	}

	@SuppressWarnings("unused")
	public void delete(T data,LinkedNodeRecur<T> node,LinkedNodeRecur<T> node1){
		if(node.next!=null) {
			if((node1.data).equals(data)) {
				LinkedNodeRecur<T> k=node;
				node.setNext(node.getNext().getNext());
			}
			delete(data,node.next,node1.next);
		}
	}

	public LinkedNodeRecur<T> reverse(LinkedNodeRecur<T> node) {
		LinkedNodeRecur<T> first, rest;

		if (node == null) {
			return node;
		}

		first = node;              
		rest = first.next;          
		if (rest == null) {
			return node;
		}
		rest = reverse(rest);       
		first.next.next = first;    
		first.next = null;          
		node = rest;               
		return node;

	}

	public void fileShow(String str){
		String s=str.substring(2);
		//For file
		LinkedNodeRecur<T> node=head;
		try{
			BufferedWriter outputWriter = null;
			outputWriter = new BufferedWriter(new FileWriter(s));
			fileRecur(outputWriter,node);
			outputWriter.flush(); 
			outputWriter.close(); 

		}catch (Exception e){
			e.getStackTrace();
		}
	}

	public void fileRecur(BufferedWriter outputWriter,LinkedNodeRecur<T> node) throws Exception {

		if(node!=null) {

			outputWriter.write((String) node.data);
			node=node.next;

			fileRecur(outputWriter,node);

		}else
			return;
	}
	public void clear(){
		head=null;
	}


}
