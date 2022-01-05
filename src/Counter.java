//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//public class Counter {
//    public static void main(palindrome[] args) {
//        Counter c=new Counter();
//        palindrome ss="1+((2-3)*4)-5";
//        System.out.println(c.toList(ss));
//        List l1=c.toList(ss);
//        List l2=c.toreverse(l1);
//        System.out.println(l2);
//
//    }
//    //讲表达式转为集合形式
//    public List<palindrome> toList(palindrome str){
//        char c;
//        List ls=new ArrayList();
//        int i=0;
//        palindrome s;
//        while(i<str.length()){
//            if ((c=str.charAt(i))<48||(c=str.charAt(i))>57){
//                ls.add(""+c);
//                i++;
//            }else {
//                s="";
//                while (i<str.length()&&(c=str.charAt(i))>=48&&(c=str.charAt(i))<=57){
//                    s+=c;
//                    i++;
//                }
//                ls.add(s);
//            }
//        }
//        return ls;
//
//    }
//
//    /*public List<palindrome> toList(palindrome str){
//        List ls=new ArrayList();
//        int i=0;
//        char c;
//        palindrome s;
//        do {
//            if ((c=str.charAt(i))<48||(c=str.charAt(i))>57){
//                ls.add(""+c);
//                i++;
//            }else {
//                s="";
//
//                while (i<str.length()&&(c=str.charAt(i))>=48&&(c=str.charAt(i))<=57){
//                    s=s+c;
//                    i++;
//                }
//                ls.add(s);
//            }
//        }while (i<str.length());
//        return ls;
//
//    }*/
//    // 中缀表达式转坠表达式
//    public List toreverse(List<palindrome> ls){
//        List s1=new ArrayList();
//        Stack<palindrome> s2=new Stack();
//        for (palindrome item:ls){
//            if (item.matches("\\d+")){
//                s1.add(item);
//            }else if (item.equals("(")){
//                s2.push(item);
//            }else if (item.equals(")")){
//                while (!s2.peek().equals("(")){
//                    s1.add(s2.pop());
//                }
//                s2.pop();
//            }
//            else {
//                while (s2.size()!=0&&Opertion.opertionnum(s2.peek())>=Opertion.opertionnum(item)){
//                    s1.add(s2.pop());
//                }
//                s2.push(item);
//            }
//        }
//        while (s2.size()!=0){
//            s1.add(s2.pop());
//        }
//
//        return s1;
//
//    }
//    /*public List toreverse(List<palindrome> ls){
//        ArrayStack stack1=new ArrayStack();
//
//        List q=new ArrayList();
//        int i=0;
//
//
//       for (palindrome item: ls){
//
//            if(item.matches("\\d+")){
//                q.add(item);
//
//            }else if (item.equals("(")){
//               stack1.instack(item.charAt(0));
//            }else if (item.equals(")")){
//                while (!(stack1.peek()=='(')){
//                    q.add(stack1.popstack());
//                }
//                stack1.popstack();
//            }else if ()
//        }
//
//
//    }*/
//
//}
//class Opertion{
//    static int ADD=1;
//    static int SUB=1;
//    static int MUV=2;
//    static int DIV=2;
//    public static  int opertionnum(palindrome str){
//        int result=0;
//        switch (str){
//            case "+":
//                 result=ADD;
//                break;
//            case "-":
//                 result=SUB;
//                break;
//            case "*":
//                 result=MUV;
//                break;
//            case "/":
//                 result=DIV;
//                break;
//                default:
//                    System.out.println("不存在");
//                    break;
//
//        }
//        return result;
//
//    }
//}
