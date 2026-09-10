class Solution {
    int i=0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        
        while(i<s.length() && s.charAt(i)!=']'){
            if(!Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
                i++;
            }

            else{
                int count=0;
                if(Character.isDigit(s.charAt(i))){
                    while(i<s.length() && s.charAt(i)!='['){
                        count=count*10 + s.charAt(i)-'0';
                        i++;
                    }
                }
                i++;
                String r = decodeString(s);
                i++;
                sb.append(r.repeat(count));
            }
        }
        return sb.toString();
    }
}