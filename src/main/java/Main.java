

public class Main {
	
	public static void main(final String[] args) {
		PigLatin sim = new PigLatin();
        	//sim.tester();
	}
	public void setup() 
{
  String[] lines = {"beast","dough","happy","question","star","three","eagle","try"};
  System.out.println("there are " + lines.length + " lines");
  for (int i = 0 ; i < lines.length; i++) 
  {
    System.out.println(pigLatin(lines[i]));
  }
}
public void draw()
{
        //not used
}
public int findFirstVowel(String word){
  int fail= -1;
    for(int i = 0; i < word.length(); i++)
       if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || 
          word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
      return i;
      return fail;
}


public String pigLatin(String word)
//precondition: sWord is a valid String of length greater than 0
//postcondition: returns the pig latin equivalent of sWord
{
  if(findFirstVowel(word) == -1)
  {
    return word + "ay";
  }
  else
  {
    return "ERROR!";
  }
}


}

