package assignm4recur;
import java.util.Scanner;

public class LinkedListDriverRecur {

	 static String Str="";
	String b=">>";
	static int q=0,del=0;
	@SuppressWarnings("unused")
	public static void main(String[] args){  


		try (Scanner sc = new Scanner(System.in)){
			LinkedNodeRecur node=new LinkedNodeRecur();
			LinkedListRecur list=new LinkedListRecur();
			while(q!=1){
				System.out.println("Enter String");
				Str=sc.nextLine();
				int len=Str.length();
				char x=Str.charAt(0);


				switch(x){
				//case '%':LinkedListRecur.getFirst();
				//break;
				case '$':list.getLast();
				//System.out.println("The Tail is :"+tail.getData());
				break;
				case '>':if(Str.equals(">>") && len==2)
					list.print(node);
				else if(Str.startsWith(">>") && len>2)
					list.fileShow(Str);
				else { 
					list.sort(false);
					list.print(node);
				}

				break;

				case '<':if(Str.equals("<<") ) {
					node=list.reverse(node);
					list.print(node);
				}
				else { 
				list.sort(true);
				list.print(node);
				}

				break;
				case '-':String s=Str.substring(1);
				if(Character.isDigit(s.charAt(0))){
					int del=Integer.parseInt(s);
					list.deleteAt(del);
					list.print(node);
				}else { 
					list.delete(s,node);
					list.print(node);
				}

				break;

				case '*':list.clear();
				break;

				case '#':System.out.println("Enter String to be find :");
				String s2=sc.nextLine();
				int index=list.find(s2,node);
				if(index!=0)
					System.out.println("Element is found at :"+index+" !");
				else
					System.out.println("Element is not found!");
				break;

				case '^':return;

				default:node=list.add(Str,node);
				
				}
			}
		} 
	}	
}

