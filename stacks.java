public class stacks {

    int top;
    int size;
    int stackArray[];

    public stacks(int maxSize){
        size = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isStackFull(){
        return top + 1 == size;
    }
    public boolean isStackmpty(){
        return top == -1;
    }

    public void push(int number){
        if(isStackFull()){
            System.out.println("Stack is full");
        }
        else{
            System.out.println("Inserting :" + number);
            stackArray[++top] = number;
        }
    }
    public void pop(){
        if(isStackmpty()){
            System.out.println("Stack is empty !");
        }
        else{
            System.out.println("POP :" + stackArray[top--]);
        }
    }
    public void printStack(){
        if(isStackmpty()){
            System.out.println("Stack is empty !");
        }
        else{
            System.out.println("Printing Stack !");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }

    }
