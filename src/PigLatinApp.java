import java.util.Scanner;
/*                         Pig Latine program 
 * The consonants are flippled to the ends of words and -ay added to each word
 * Hello world would be ellohay 
 * The words staring with vowel, just add -way to the ending
 * exit would be exitway 
 */
public class PigLatinApp // class for Pig Latin game
{
 
	public static void main(String[] args)
	{
		char c='y';// declaration and initialization of variable for continue? check
		System.out.println("Welcome to the Pig Latin Translator!");
		do
		{
		System.out.println("Enter a line to be translated: ");
		
		Scanner scr = new Scanner(System.in);
	
		String line = scr.next();//the word entered by user for translation
	
		translator(line);//method call for word translation
		
		
		 System.out.println("Do you want to continue? y/n");
		 Scanner scr1 = new Scanner(System.in);
			
		 c = scr.next().charAt(0);
			
		}while(c=='y');//condition check for continuation
		
	}
	public static void translator(String words)//method to convert word to lowercase
	{
		String lowerCase=words.toLowerCase();
		vowelCheck(lowerCase);//method call for vowel check
				
	}
	public static void vowelCheck(String name)//method to check vowel and consonants and make changes to word accordingly 
	{
		if(name.charAt(0)=='a'|| name.charAt(0)=='e'|| name.charAt(0)=='i'|| name.charAt(0)=='o'||name.charAt(0)=='u')
		{
			System.out.println(name+"way");//check if the first letter of the word is vowel or not?
		}
      String s="";
	   char []d= {'a','e','i','o','u'};
	   String r="yes";
	   for (int i=0;i< name.length() && r=="yes";i++)//check for each letter of word with vowel array
	   {
		   for(int j=0;j<5;j++)
		   {
			   if (name.charAt(i)==d[j])
			   {
				   s=name.substring(i) + name.substring(0,i)+"ay";
				   r="no";//to break the outer for loop
				   break;//to break inner for loop 
				   
			   }
			   
		   }
	   }
	   System.out.println(s);
	  
	}
	
}
