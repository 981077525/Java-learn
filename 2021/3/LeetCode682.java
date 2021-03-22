//https://leetcode-cn.com/problems/baseball-game/

import java.util.Stack;

/*
* 你现在是一场采用特殊赛制棒球比赛的记录员。这场比赛由若干回合组成，过去几回合的得分可能会影响以后几回合的得分。

比赛开始时，记录是空白的。你会得到一个记录操作的字符串列表 ops，其中 ops[i] 是你需要记录的第 i 项操作，ops 遵循下述规则：

整数 x - 表示本回合新获得分数 x
"+" - 表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数。
"D" - 表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数。
"C" - 表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数。
请你返回记录中所有得分的总和。

* */
public class LeetCode682 {
    public int calPoints(String[] ops) {
        int ret = 0;

        Stack<Integer> stack = new Stack();

        int last1 = 0;
        int last2 = 0;


        for(int i = 0;i<ops.length;i++){

            switch (ops[i]){
                case "+":
                    last1 = stack.pop();
                    last2 = stack.peek();
                    stack.push(last1);
                    stack.push(last1 + last2);
                    break;
                case "D":
                    last1 = stack.peek();
                    stack.push(last1 * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(ops[i]));
            }

//            if(ops[i] == "+"){
//                last1 = stack.pop();
//                last2 = stack.peek();
//                stack.push(last1);
//                stack.push(last1 + last2);
//            }else if(ops[i] == "C"){
//                last1 = stack.peek();
//                stack.push(last1 * 2);
//            }else if(ops[i] == "D"){
//                stack.pop();
//            }else{
//                stack.push(Integer.parseInt(ops[i]));
//            }
        }
        while(!stack.empty()) {
            ret += stack.pop();
        }
        return ret;
    }

    public static void main(String[] args) {
        LeetCode682 a = new LeetCode682();
        String[] str = {"5","2","C","D","+"};
        System.out.println(a.calPoints(str));
    }
}
