class Solution {
    public String minRemoveToMakeValid(String s) {
        
        char [] chars = s.toCharArray();
        int l=chars.length;
        int c=0;
        for(int i=0;i<l;i++){
            char ch = chars[i];
            if(ch=='('){
                c++;
            }else if(ch==')'){
                if(c==0){
                    chars[i]='*';
                }else{
                    c--;
                }
            }
        }

        for(int i=l-1;i>=0&& c>0;i--){
            if(chars[i]=='('){
                chars[i] ='*';
                c--;
            }
        }
        
        StringBuilder re= new StringBuilder();
        for(char ch: chars){
            if(ch!= '*'){
                re.append(ch);
            }
        }
        return re.toString();


    }
}