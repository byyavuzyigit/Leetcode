import java.util.Stack;

class Problem20 {
    public boolean isValid(String s) {
        Stack<String> open = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                open.push(s.charAt(i) + "");
            }
            else{
                if(open.empty())
                    return false;
                if(s.charAt(i) == ')'){
                    if(!open.pop().equals("("))
                        return false;
                }
                else if(s.charAt(i) == '}'){
                    if(!open.pop().equals("{"))
                        return false;
                }
                else if(s.charAt(i) == ']'){
                    if(!open.pop().equals("["))
                        return false;
                }
            }
        }

        return open.empty();


    }
}
