import java.util.EmptyStackException;

class DoubleStackChar {
    private char[] array;
    private int leftTop;
    private int rightTop;
    
    public DoubleStackChar() {
        array = new char[5];
        leftTop = -1;
        rightTop = 5;
    }
    
    public void pushLeft(char value) {
        if (leftTop + 1 == rightTop) {
    		throw new StackOverflowError("Left stack overflow");
        }
        array[++leftTop] = value;
    }
    
    public void pushRight(char value) {
        if (rightTop - 1 == leftTop) {
        	throw new StackOverflowError("Right stack overflow");
        }
        array[--rightTop] = value;
    }
    
    public char popLeft() {
        if (leftTop == -1) {
            throw new EmptyStackException();
        }
        return array[leftTop--];
    }
    
    public char popRight() {
        if (rightTop == array.length) {
            throw new EmptyStackException();
        }
        return array[rightTop++];
    }
    
    public boolean isLeftEmpty() {
        return leftTop == -1;
    }
    
    public boolean isRightEmpty() {
        return rightTop == array.length;
    }
    
    public void printStacks() {
        System.out.print("Stack: ");
        for (int i = 0; i < array.length; i++) {
            if (i <= leftTop || i >= rightTop) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    	DoubleStackChar stack = new DoubleStackChar();
        
        stack.pushLeft('A');
        stack.pushLeft('B');
        stack.pushLeft('C');
        stack.printStacks();

        stack.pushRight('D');
        stack.pushRight('E');

        stack.printStacks();
        try {
            stack.pushRight('F'); 
        } catch (StackOverflowError e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        
        
        stack.printStacks();
        
        
        while (!stack.isLeftEmpty()) {
            char x = stack.popLeft();
            stack.pushRight(x);
            stack.printStacks();
        }
        
        while (!stack.isRightEmpty()) {
            char x = stack.popRight();
            System.out.println("Извлечено: " + x);
            stack.printStacks();
        }
        
    }
}
