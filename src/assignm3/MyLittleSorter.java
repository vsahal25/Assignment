package assignm3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MyLittleSorter {
	public static void main(String[] args) {
		String x="",b=">>";
		String[] sorStr={},sorStr2={},sorStr3={},arrStr={},myStr=new String[100]; 
		int n=sorStr.length,i=0,q=0,len,j=0,del=0;
		try(Scanner sc=new Scanner(System.in)){

			//	               Infinite loop
			while(q!=1){
				System.out.println("Enter String");
				x=sc.nextLine();
				len=x.length();

				//	                Selecting the Operation to be performed
				if(x.equals(">")|| x.equals("<") || x.equals("-") || x.equals("^"))
				{

					switch(x)
					{
					case ">" :ascStr(sorStr);
					break;

					case "<" :descStr(sorStr);
					break;	
					case "-":sorStr2=delStr(sorStr);
					del++;
					n=sorStr2.length;
					sorStr=new String[n];
					System.arraycopy(sorStr2,0,sorStr,0,n);
					break;

					case "^" :return;
					}
				}

				else if(x.startsWith("-")){
					String s=x.substring(1);
					n--;
					sorStr3=anyDelStr(sorStr,sorStr3,x);
					del++;
					n=sorStr3.length;
					System.arraycopy(sorStr3,0,sorStr,0,n);	
					sorStr2=new String[n];
					System.arraycopy(sorStr,0,sorStr2,0,n);		
				}

				//	  				Printing the Array Elements
				else if(x.equals(b))
				{ 
					if(del!=0)
						System.out.println(Arrays.toString(sorStr2));
					else
						System.out.println(Arrays.toString(sorStr)); 
				}


				//	                  Printing Array Elements In File
				else if(x.startsWith(">>")){
					String s=x.substring(2);
					n=sorStr.length;
					//for file
					try{
						BufferedWriter outputWriter = null;
						outputWriter = new BufferedWriter(new FileWriter(s));
						for ( i = 0; i < n-1; i++) {
							if(del!=0)
								outputWriter.write(Arrays.toString(sorStr2));
							else
								outputWriter.write(Arrays.toString(sorStr));
							outputWriter.flush(); 
							outputWriter.close();  
						}
					}
					catch (Exception e) {
						e.getStackTrace();
					}
				}
				//	           Storing Elements In a Array
				else {

					arrStr=new String[arrStr.length+1];
					arrStr[i]=x;
					n=arrStr.length;
					myStr[j]=x;
					if(del!=0)
					{
						i--;
						j--;
						del=0;
					}else
					{
						i++;
						j++;
					}
					sorStr=arrCreate(arrStr,myStr);
				}
			}
		}	
	}//end of main function


	//Creating array
	public static String[] arrCreate(String[] arrStr,String[] myStr)
	{
		String[] sorStr=new String[arrStr.length];
		String[] sorStr2=new String[sorStr.length];
		int n=arrStr.length;
		System.arraycopy(myStr,0,sorStr,0,n);
		System.arraycopy(sorStr,0,sorStr2,0,n);
		return sorStr;
	}
	//Sorting array elements in decending order 
	public static void descStr(String[] sorStr){

		int n=sorStr.length;
		String[] desStr=new String[n];
		System.arraycopy(sorStr,0,desStr,0,n);
		for(int i = 0; i<n-1; i++) {
			for (int j = i+1; j<n; j++) {
				if(desStr[i].compareTo(desStr[j])<0) {
					String temp =desStr[i];
					desStr[i] = desStr[j];
					desStr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(desStr));
		return;	  
	}
	//Sorting array elements in ascending order 
	public static void ascStr(String[] sorStr){
		int n=sorStr.length;
		String[] asStr=new String[n];
		System.arraycopy(sorStr,0,asStr,0,n);
		for(int i = 0; i<n-1; i++) {
			for (int j = i+1; j<n; j++) {
				if(asStr[i].compareTo(asStr[j])>0) {
					String temp =asStr[i];
					asStr[i] = asStr[j];
					asStr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(asStr));
		return;	  
	}
	//deleting last array element
	public static String[] delStr(String[] sorStr)
	{
		int n=sorStr.length;
		String item=sorStr[n-1];
		String[] sorStr2=new String[n-1];
		System.arraycopy(sorStr,0,sorStr2,0,(n-1));
		System.out.println(Arrays.toString(sorStr2));
		return sorStr2;
	}
	//deleting array element '-' followed by word
	public static String[] anyDelStr(String[] sorStr,String[] sorStr3,String x)
	{
		String s=x.substring(1);
		int p=0;
		int n=sorStr.length-1;
		sorStr3=new String[n];
		for(int a=0,h=0;a<=n;a++,h++)
		{
			if(sorStr[a].equals(s))
			{
				String r=sorStr[a];
				h--;
			}
			else{
				sorStr3[h]=sorStr[a];
			}
		}

		System.out.println(Arrays.toString(sorStr3));	
		return sorStr3;
	}
}
