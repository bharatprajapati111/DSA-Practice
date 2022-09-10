class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int maxWords = 1;
        for(int i=0;i<sentences.length;i++)
        {
            int words=1;
            for(int j=0;j<sentences[i].length();j++)
            {
                if(sentences[i].charAt(j)==' ')
                {
                    words++;
                    maxWords = Math.max(words,maxWords);
                }
            }
        }
        return maxWords;
    }
}