class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int count = 0;
        boolean firstLetter = false;

        //checking whether the first letter is capital
        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
        { 
            firstLetter = true;
        }

        //iterating over word and counting capital letters
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
            {
                count++;
            } 
        }

        //checking constraints
        if((count == 1 && firstLetter) || count == word.length() || count == 0)
        {
             return true;
        }

        else
        { 
            return false;
        }
    }
}


/*Approach
>The Constraints for correct useage of capitals are:
    All letters in this word are capitals.
    All letters in this word are not capitals.
    Only the first letter in this word is capital
>Have a count variable to check the number of capital letters in word.
>Have a boolean variable firstLetter to check whether the first letter is capital. If yes then it takes the value as true.
>Now Iterate over the string and check the number of capital letters in word.
>We return true if -
    count == word.length() or
    count == 0 or
    count == 1 && firstLetter == true
>In all other cases we return false.*/