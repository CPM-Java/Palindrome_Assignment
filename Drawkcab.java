
/**
 * Reverses Strings
 * 
 * @author GK CPM 2017 
 * @version 10/22/17
 */
public class Drawkcab
{
    // instance variable
    private String myWord;

    /**
     * Constructor for objects of class Drawkcab
     * 
     * @param  str   saved as an instance String
     */
    public Drawkcab(String str)
    {
        // initialise instance variables
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
     * Reverse the order of the instance String
     */
    public void makeBackward()
    {
        //local variables
        String backwardStr = "";
        int letterCount = 0;// letterCount is the sentinel variable and character index
    
        while(letterCount < myWord.length())
        {
            //characters are duplicated sequentially from myWord, back to front, and added to backwardStr
            backwardStr += myWord.substring(myWord.length() - letterCount - 1, myWord.length() - letterCount);
            //sentinel and character index is incremented
            letterCount++;

        }// the above code within the 'while' { } will be repeated 
         //until condition (letterCount < myWord.length()) evaluates to 'false'.
    
         //instance variable is updated
        myWord = backwardStr;
    }
    
    /**
     * toString
     * 
     * @return     the instance String 
     */    
    public String toString()
    {
        return myWord;
    }
}
