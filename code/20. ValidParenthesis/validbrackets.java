import java.util.Stack;

public class validbrackets {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            if(current == '(' || current=='{'|| current =='['){

                stack.push(current);
            }

            if(current == ')' || current=='}'|| current ==']'){

                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();

                if((top =='(' && current ==')'||top == '{' && current =='}' || top =='[' && current ==']' )){
                    stack.pop();


                }else{

                    return false;
                }



                
            }
            
        }

        return stack.isEmpty();



        
    }

    public static void main(String[] args) {

        System.out.println(isValid("(){]"));
        
    }
    
}
