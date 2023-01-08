class Solution {
    public String intToRoman(int num) 
    {
        Map<String, Integer> map=new LinkedHashMap<String, Integer>();
        
        StringBuilder sb = new StringBuilder();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);
        
       for(Map.Entry<String, Integer> entry : map.entrySet()) { 
      
          while(num >= entry.getValue()) {
            num = num - entry.getValue();
            sb.append(entry.getKey());
          }
       }
 
       return sb.toString();
    }
}


//A map entry (key-value pair). The Map. entrySet method returns a collection-view of the map, //whose elements are of this class. 