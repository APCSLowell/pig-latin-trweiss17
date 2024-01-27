

public class Main {
	
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


public String pigLatin(String word){
  if(findFirstVowel(word)==0){
    return word + "way";
  }
  if(findFirstVowel(word) == 2){
    return word.substring(2, word.length()) + word.substring(0,2) + "ay";
  }
  if(word.substring(0,2).equals("qu")){
    return word.substring(2, word.length()) + word.substring(0,2) + "ay";
  }
  if(findFirstVowel(word) == 3){
    return word.substring(3, word.length()) + word.substring(0,3) + "ay";
  }
  if(findFirstVowel(word) == 1){
    return word.substring(1, word.length()) + word.substring(0,1) + "ay";
  }

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

