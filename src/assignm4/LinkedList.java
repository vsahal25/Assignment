package assignm4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LinkedList{

	static LinkedNode head;
	static int i=0;

	public static String getFirst(){
		System.out.println("The Head is :"+head.getData());
		return head.getData();
	}

	public static String getLast(){
		LinkedNode tail=head;
		while(tail.next!=null)
			tail=tail.next;
		System.out.println("The Tail is :"+tail.getData());
		return tail.getData();
	}

	public LinkedNode add(String data){
		LinkedNode node=new LinkedNode();
		node.data=data;
		node.next=null;
		if(head==null) 
			head=node;
		else{
			LinkedNode n=head;
			while(n.next!=null){
				n=n.next;
			}n.next=node;
		}return node; 
	}

	public  void print(){
		LinkedNode node=head;
		while(node.next!=null){
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	} 

	public  void sort(Boolean ascending){
		LinkedNode before=head;
		LinkedNode after=head.next;
		LinkedNode current=head;
		String x,y;
		int index=1;
		if(ascending==true){ 
			while(before!=null){
				after=before.next;
				while(after!=null){
					x=before.data;
					y=after.data;
					if(x.compareTo(y)<0){
						String temp=after.data;
						after.data = before.data;
						before.data = temp;
					}after=after.next;
				}before=before.next;
			}
		}else{
			while(before!=null){
				after=before.next;
				while(after!=null){
					x=before.data;
					y=after.data;
					if(x.compareTo(y)>0){
						String temp=after.data;
						after.data = before.data;
						before.data = temp;
					}after=after.next;
				}before=before.next;
			}
		}LinkedList l=new LinkedList();
		l.print();
	}
	public void deleteAt(int index){
		if(index==0){
			head = head.next;
		}else{
			LinkedNode n = head;
			LinkedNode n1 = null;
			for(int i=0;i<index-1;i++){
				n = n.next;
			}n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}print();
	}

	public int find(String x){
		LinkedNode node=head;
		int k=0,index=0;
		while(node.next!=null){
			if(node.data.equals(x)) 
				k=index;
			node=node.next;
			index++;
		}
//		System.out.println(k);
		return k;
	}

	public void delete(String data){
		int index=find(data);
		deleteAt(index);
	}

	public void reverse(){
		LinkedNode prev=null,current=head,next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}head=prev;
		print();
	}

	public void fileShow(String str){
		String s=str.substring(2);
		//For file
		LinkedNode node=head;
		try{
			BufferedWriter outputWriter = null;
			outputWriter = new BufferedWriter(new FileWriter(s));
			while(node!=null){
				while(node!=null){
					outputWriter.write(node.data);
					node=node.next;
				}outputWriter.flush(); 
				outputWriter.close(); 
			}
		}catch (Exception e){
			e.getStackTrace();
		}
	}

	public void clear(){
		head=null;
	}
}