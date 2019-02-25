import java.util.Scanner;
import java.util.StringTokenizer;
public class Coleman_Liau
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the paragraph : ");
       String paragraph = sc.nextLine();

       int words = 0;
       int chars = 0;
       int spaces = 0;
       int nonspaces = 0;
       int sentences = 0;
       int word_letters = 0;
      
       chars += paragraph.length();                   //counting number of characters
       words += new StringTokenizer(paragraph, " ,.-?").countTokens();   //counting number of words
       for(char c : paragraph.toCharArray())
       {
           if(c==' ')  
               spaces++;                   //counting spaces
           if((c>='A' && c<='Z')||(c>='a' && c<='z'))
               word_letters++;                   //counting word letters
       }
       nonspaces = paragraph.length() - spaces;           //counting non spaces
       sentences = paragraph.split("[.]").length;           //counting number of sentences
      
       double L = ((double)word_letters / (double)words) * 100;
       double S = ((double)sentences / (double)words) * 100;
       double CLI = 0.0588 * L - 0.296 * S - 15.8;           //calculting coleman liau index

       System.out.println("Number of Characters : "+chars);
       System.out.println("Number of Whitespaces : "+spaces);
       System.out.println("Number of Non-Whitespaces : "+nonspaces);
       System.out.println("Number of Sentences : "+sentences);
       System.out.println("Number of Words : "+words);
       System.out.println("Number of Word Letters : "+word_letters);      
       System.out.println("Coleman–Liau index : "+CLI);
   }
}