public class StackQueue {
    ArrayStack inStack = new ArrayStack(20);
    ArrayStack outStack = new ArrayStack(20);

    public int size()
    {
        return inStack.Size;
    }

    public boolean isEmpty()
    {
        if(outStack.isEmpty() == true) {
            return true;
        } else
            return false;
    }

    public char front() {
        if(inStack.isEmpty()) {
            System.out.println("EmptyQueueException");
            return '0';
        } else {
            while(inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
            System.out.println(outStack.top());
            return outStack.top();
        }
    }

    public void enqueue(char item) {
        if(outStack.tp == outStack.Size-1) {
            System.out.println("FullQueueException");
        }else if(outStack.isEmpty()) {
            inStack.push(item);
        }else{
            while(outStack.isEmpty()) {
                inStack.push(outStack.pop());
            }
            inStack.push(item);
        }
    }
    public char dequeue() {
        if(inStack.isEmpty()) {
            System.out.println("EmptyQueueException");
            return '0';
        } else {
            while(inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
            System.out.println(outStack.pop());
            return outStack.pop();
        }
    }



}
