package assignm3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyLittleSorterOptimized{

	static String str="";
	static String[] sorStr={},sorStr2={},arrStr={},myStr=new String[100]; 
	static int n=sorStr.length,i=0,q=0,j=0,del=0;

	public static void main(String[] args) throws IOException {

		try(Scanner scanner=new Scanner(System.in)){

			//Infinite loop
			while(q!=1){
				System.out.println("Enter String");
				str=scanner.nextLine();
				int len=str.length();
				//Selecting the Operation to be performed

				char ch=str.charAt(0);
				switch(ch){
				case '>' :  if(str.equals(">>"))
					print();
				else  if(str.startsWith(">>") && (len>2)) 
					storeFile();
				else
					sorting(true);
				break;
				case '<' :sorting(false);
				break;	
				case '-':	if(len>1)
					anyDelStr(str);
				else
					delStr();
				break;	
				case '^' :return;

				default:addArr(str);
				}
			}
		}	
	}
	//Creating array
	public static String[] arrCreate(String[] arrStr,String[] myStr){
		String[] sorStr=new String[arrStr.length];
		String[] sorStr2=new String[sorStr.length];
		int n=arrStr.length;
		System.arraycopy(myStr,0,sorStr,0,n);
		System.arraycopy(sorStr,0,sorStr2,0,n);
		return sorStr;
	}
	//End of main function

	public static void addArr(String str) {
		arrStr=new String[arrStr.length+1];
		arrStr[i]=str;
		n=arrStr.length;
		myStr[j]=str;
		if(del!=0){
			i--;
			j--;
			del=0;
		}else{
			i++;
			j++;
		}
		sorStr=arrCreate(arrStr,myStr);
	}

	public static void sorting(Boolean b)
	{
		sorStr2=new String[sorStr.length];
		Boolean c=false;
		System.arraycopy(sorStr,0,sorStr2,0,sorStr.length);
		for(int i = 0; i<sorStr.length-1; i++){
			for (int j = i+1; j<sorStr.length; j++){
				if(b==true)
					c=descStr(sorStr2[i],sorStr2[j]);
				else
					c=ascStr(sorStr2[i],sorStr2[j]);
				if(c==true) {
					String temp =sorStr2[i];
					sorStr2[i] = sorStr2[j];
					sorStr2[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(sorStr2));
	}

	//Sorting array elements in Ascending order 
	public static Boolean ascStr(String prev,String next){

		if(prev.compareTo(next)<0)
			return true;
		else
			return false;
	}
	//Sorting array elements in Descending order
	public static Boolean descStr(String prev,String next){

		if(prev.compareTo(next)>0)
			return true;
		else
			return false;
	}
	//Deleting last array element
	public static void delStr(){
		String[] sorStr2=new String[sorStr.length-1];
		System.arraycopy(sorStr,0,sorStr2,0,(sorStr.length-1));
		del++;
		n=sorStr2.length;
		sorStr=new String[n];
		System.arraycopy(sorStr2,0,sorStr,0,n);
		System.out.println(Arrays.toString(sorStr2));
	}
	//Deleting array element '-' followed by word
	public static String anyDelStr(String str){
		String s=str.substring(1);
		n--;
		sorStr2=new String[sorStr.length-1];
		for(int a=0,h=0;a<=sorStr.length-1;a++,h++){
			if(sorStr[a].equals(s)){
				@SuppressWarnings("unused")
				String r=sorStr[a];
				h--;
			}else{
				sorStr2[h]=sorStr[a];
			}
		}
		del++;
		n=sorStr2.length;
		System.arraycopy(sorStr2,0,sorStr,0,n);	
		System.out.println(Arrays.toString(sorStr2));	

		return s ;
	}
	public static void storeFile(){
		String s=str.substring(2);
		n=sorStr.length;
		//For file
		try{
			BufferedWriter outputWriter = null;
			outputWriter = new BufferedWriter(new FileWriter(s));
			for ( i = 0; i < n-1; i++){
				if(del!=0)
					outputWriter.write(Arrays.toString(sorStr2));
				else
					outputWriter.write(Arrays.toString(sorStr));
				outputWriter.flush(); 
				outputWriter.close();  
			}
		}catch (Exception e){
			e.getStackTrace();
		}
	}
	public static void print(){

		System.out.println(Arrays.toString(sorStr)); 
	}
}