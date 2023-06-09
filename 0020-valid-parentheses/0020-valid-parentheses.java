class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
         for(char ch:s.toCharArray()){
             if(bracketOpen(ch)){
                 stack.push(ch);
             }else{
                 if(stack.isEmpty()){
                     return false;
                 }else{
                     if(pair(stack.peek(),ch)){
                         stack.pop();
                     }else{
                         return false;
                     }
                 }
             }
         }
             return stack.size()==0;
         }
    public boolean bracketOpen(char ch){
        switch(ch){
            case '(':
            case '{':
            case '[':
                return true;
            default:
                return false;
        }
    }
    public boolean pair(char ch1,char ch2){
        if(ch1=='(' && ch2==')'){
            return true;
        }else if(ch1=='[' && ch2==']'){
            return true;
        }else if(ch1=='{' && ch2=='}'){
            return true;
        }else{
            return false;
        }
    }
}