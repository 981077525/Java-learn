import java.util.Stack;
class MinStack {

    Stack<Integer> normelStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int val) {
        normelStack.push(val);
        if(minStack.empty() || val < getMin()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        normelStack.pop();
        minStack.pop();
    }

    public int top() {
        return normelStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
<<<<<<< HEAD
}
=======
}
 
>>>>>>> b4922692bf91806560bb89491b9d22a1267188e5
