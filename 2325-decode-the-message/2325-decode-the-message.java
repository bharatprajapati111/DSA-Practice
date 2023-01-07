class Solution 
{
    public String decodeMessage(String key, String message) 
    {
        HashMap<Character, Character>map=new HashMap<>();
        int index=0;
        for(char c:key.toCharArray())
        {
            if(c==' '|| map.containsKey(c))
            {
                continue;
            }
            map.put(c, (char)('a' + (index++)));
        }
        StringBuilder sb=new StringBuilder();
        for(char c: message.toCharArray())
        {
            sb.append((c==' ')? ' ': map.get(c));
        }
        return sb.toString();
        
    }
}