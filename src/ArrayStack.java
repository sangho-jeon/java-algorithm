public class ArrayStack {

    public int tp;
    public int Size;
    public char stackArr[];

    public ArrayStack(int size) {
        tp = -1;
        this.Size = size;
        stackArr = new char[this.Size];
    }

    public int size() {
        return tp+1;
    }

    public boolean isEmpty() {
        if(tp == -1) {
            return true;
        }
        else
            return false;
    }


    public char top() {
        if(isEmpty()) {
            System.out.println("EmptyStackException");
            return '0';
        } else {
            System.out.print(stackArr[tp]);
            return stackArr[tp];
        }
    }


    public char push(char item) {
        if(tp == this.Size-1) {
            System.out.println("FullStackException");
            return '0';
        }
        else {
            tp++;
            stackArr[tp] = item;
            return item;
        }
    }

    public char pop() {
        if(isEmpty()) {
            System.out.println("EmptyStackException");
            return '0';
        } else {
            System.out.print(stackArr[tp]);
            if(tp!=0) {
                tp--;
            }
            return stackArr[tp];
        }
    }

}