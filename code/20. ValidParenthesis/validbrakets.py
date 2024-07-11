from collections import deque

def isvalid(s:str):

    stack = deque()

    for c in s:
        if c == "(" or c == "{" or c == "[" :
            stack.append(c)
        
        if c == ")" or c == "}" or c == "]" :

            if len(stack) == 0:
                return False
            
            top = stack[-1]

            if (top == "(" and c==")") or (top == "{" and c=="}") or (top == "[" and c=="]"):

                stack.pop()
            else:
                return False
        
    if len(stack) == 0: 
        return True
    else: 
        return False
            

            
print(isvalid("(}"))



        





