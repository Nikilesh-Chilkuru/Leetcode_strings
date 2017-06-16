public class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuffer rev = new StringBuffer();
        
        for(int i=0; i<words.length; i++){
            
            rev.append( new StringBuffer(words[i]).reverse());
            
            if(i != words.length-1){
                rev.append(" ");
            }
        }
        
        return rev.toString();
    }
}
