package assignm4recur;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LinkedListRecur<T extends Comparable<T>> {

	LinkedNodeRecur<T> head=new LinkedNodeRecur<T>();
	LinkedNodeRecur<T> node=new LinkedNodeRecur<T>();
	LinkedNodeRecur<T> tail=node;
	Boolean order;
	LinkedNodeRecur<T> n = node;
	LinkedNodeRecur<T> n1 = null;
	static int i=0,index=0,k=0;
	//LinkedNodeRecur<T> after=node.next,before=node,curr=null;

	//	public static LinkedNodeRecur<T> getFirst(){
	//		System.out.println("The Head is :"+T head.getData());
	//		return head;
	//	}

	public  void getLast(){


		if(tail.next!=null) {
			tail=tail.next;
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


	void sort(Boolean ascending)
	{
		LinkedNodeRecur<T> before=node;
		LinkedNodeRecur<T> after=node.next;
		sortTech(ascending,before,after);
	}

	public void sortTech(Boolean order,LinkedNodeRecur<T> before,LinkedNodeRecur<T> after)
	{
		if(order==true) 
		{
			if(before.next==null)
			{
				return;
			}
			T x=before.data;
			T y=after.data;
			Boolean check=comLink(order,x,y);
			if(check==true) {
				T temp = before.data;
				before.data = after.data;
				after.data = temp;
			}
			if(after.next==null)
				sortTech(true,before.next,before.next.next);
			else
				sortTech(true,before,after.next);


		}
		else 
		{
			if(before.next==null)
			{
				return;
			}
			T x1=before.data,y1=after.data;
			Boolean check1=comLink(order,x1,y1);
			if(check1==true){
				T temp = before.data;
				before.data = after.data;
				after.data = temp;
			}
			if(after.next==null)
				sortTech(false,before.next,before.next.next);
			else
				sortTech(false,before,after.next);

		}
	}




	@SuppressWarnings("hiding")
	public  Boolean comLink(Boolean order,T x1,T y1)
	{
		if((x1.compareTo(y1)>0) && (order==false))
			return true;
		else if((x1.compareTo(y1)<0) && (order==true))
			return true;
		else
			return false;

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

	public int find(T x,LinkedNodeRecur<T> n){


		if(n.next!=null){
			if(n.data.equals(x)) { 
				k= index;	
			}
			else {
				index++;
				int i=find(x,n.next);

			}

		}

		return k;	

	}

	public void delete(T data,LinkedNodeRecur<T> node){
		if(node.next!=null) {
			if((node.data).equals(data)) {
				LinkedNodeRecur<T> k=node;
				node.setNext(node.getNext());
			}
			node=node.next;
			delete(data,node);
		}
	}

	public LinkedNodeRecur<T> reverse(LinkedNodeRecur<T> n){
		if(n == null) {
			return n;
		}
		if(n.next == null) {
			return n;
		}
		// change references for middle chain
		n.next.next = n;
		n.next = null;
//		reverse(n.next);
		// send back new head node in every recursion
		return reverse(n.next);
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

	public void fileRecur(BufferedWriter outputWriter,LinkedNodeRecur<T> node) throws Exception 
	{

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
