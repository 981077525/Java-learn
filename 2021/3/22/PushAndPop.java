<<<<<<< HEAD
import java.util.Stack;

//题目描述
//        输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
//        假设压入栈的所有数字均不相等。
//        例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
//        但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

public class PushAndPop {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        // 定义一个栈，用来模拟操作
        Stack<Integer> stack = new Stack<>();

        // 判断两个输入的数组是否相同
        if(pushA.length != popA.length) {
            return false;
        }

        // 定义一个变量，用来操作数组popA
        int n = 0;

        // 将数据开始压栈判断
        for(int a:pushA){
            stack.push(a);
            // 循环判断，栈顶元素是否和popA[n] 想等，如果相等，则弹出栈顶元素，n++，继续判断
            // 直到栈顶元素和当前的popA[n] 不相等
            // 开始下一次压栈判断
            while(!stack.empty()){
                if(stack.peek() == popA[n]){
                    stack.pop();
                    n++;
                }else{
                    break;
                }
            }
        }
        // 直到最后，压完数据，并且判断完毕，栈为空则返回 true ，不为空即 传入序列不是当前的弹出序列
        return stack.empty();


    }
}
=======
import java.util.Stack;

//题目描述
//        输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
//        假设压入栈的所有数字均不相等。
//        例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
//        但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

public class PushAndPop {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        // 定义一个栈，用来模拟操作
        Stack<Integer> stack = new Stack<>();

        // 判断两个输入的数组是否相同
        if(pushA.length != popA.length) {
            return false;
        }

        // 定义一个变量，用来操作数组popA
        int n = 0;

        // 将数据开始压栈判断
        for(int a:pushA){
            stack.push(a);
            // 循环判断，栈顶元素是否和popA[n] 想等，如果相等，则弹出栈顶元素，n++，继续判断
            // 直到栈顶元素和当前的popA[n] 不相等
            // 开始下一次压栈判断
            while(!stack.empty()){
                if(stack.peek() == popA[n]){
                    stack.pop();
                    n++;
                }else{
                    break;
                }
            }
        }
        // 直到最后，压完数据，并且判断完毕，栈为空则返回 true ，不为空即 传入序列不是当前的弹出序列
        return stack.empty();


    }
}
>>>>>>> b4922692bf91806560bb89491b9d22a1267188e5
