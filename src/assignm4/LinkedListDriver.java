package assignm4;

import java.util.Scanner;

public class LinkedListDriver{
	static String Str="",b=">>";
	static int q=0,del=0;
	@SuppressWarnings("unused")
	public static void main(String[] args){  

		try (Scanner sc = new Scanner(System.in)){
			LinkedNode node=new LinkedNode();
			LinkedList list=new LinkedList();
			while(q!=1){
				System.out.println("Enter String");
				Str=sc.nextLine();
				int len=Str.length();
				char x=Str.charAt(0);


				switch(x){
				case '%':LinkedList.getFirst();
				break;
				case '$':LinkedList.getLast();
				break;
				case '>':if(Str.equals(">>") && len==2)
					list.print();
				else if(Str.startsWith(">>") && len>2)
					list.fileShow(Str);
				else
					list.sort(false);

				break;

				case '<':if(Str.equals("<<"))
					list.reverse();
				else
					list.sort(true);

				break;
				case '-':String s=Str.substring(1);
				if(Character.isDigit(s.charAt(0))){
					int del=Integer.parseInt(s);
					list.deleteAt(del);
				}else 
					list.delete(s);

				break;

				case '*':list.clear();
				break;

				case '#':System.out.println("Enter String to be find :");
				String s2=sc.nextLine();
				int index=list.find(s2);
				if(index!=0)
					System.out.println("Element is found at :"+index+" !");
				else
					System.out.println("Element is not found!");
				break;

				case '^':return;

				default:node=list.add(Str);
				}
			}
		} 
	}	
}