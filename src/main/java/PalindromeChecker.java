import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  return (word.equals(reverse(word)));
}
public String reverse(String str)
{
    String sNew = "";
  for (int i = 0; i<str.length();i++){
    char ch =str.charAt(i);
    sNew = ch+sNew;
  }
    return sNew;
}
  public String onlyLetters(String sString){
  String str = "";
  for (int i = 0; i <sString.length();i++){
    char ch = sString.charAt(i);
    if (Character.isLetter(ch)){str+=ch;}
  }
return str;
}

}
