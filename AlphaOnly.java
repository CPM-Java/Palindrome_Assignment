
/**
 * Demo removing non-alphabetic substrings
 * 
 * @author gk CPM 2017
 * @version 11/23, 10/23/17
 */
public class AlphaOnly
{

    //the instance identifier is assigned a default value
    private String myWord = "Hello, World!";
    
   /**
     * Constructor for objects of class AlphaOnly
     * 
     * @param  str   set the instance String to str
     */
    public AlphaOnly(String str)
    {
        myWord = str;
    }
    
   /**
     * A mutator method for the instance String
     * 
     * @param  str   set the instance String to str
     */
    public void setWord(String str)
    {
        myWord = str;
    }
    
    /**
     * Removes all non-alphabetical substrings from the instance String
     * and updates the instance String.
     */    
    public void removeNonAlpha()
    {
       String onlyAlphaStr = "";

       //x will represent the index of each 'character' substring in myWord
       for(int x = 0; x < myWord.length(); x++)
       {
             //Considers each substring in the String
             String temp = myWord.substring(x,x+1);      
             
             //Determines if a substring is a letter
             if((temp.compareTo("A") >= 0 && temp.compareTo("Z") <= 0 ) || (temp.compareTo("a") >= 0 && temp.compareTo("z") <= 0 )) 
                
                //if the substring is a letter it is added to onlyAlphaStr
                onlyAlphaStr += myWord.substring(x,x+1);
       }
       
       //instance String is updated
       myWord = onlyAlphaStr;
    }
    
   /**
     * toString
     * 
     * @return    the instance String 
     */
    public String toString()
    {
        return myWord;
    }
   

}