class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        // In ASCII table 97 is 'a' character and 122 is 'z' character
	    for (int i = 97; i <= 122; i++) 
        {
		    if (!sentence.contains(String.valueOf((char)i))) 
            {
                return false;
            }
	    }
        return true;    
    }
}