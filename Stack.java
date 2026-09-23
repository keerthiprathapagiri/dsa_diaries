import java.util.*;

public class Main {
    public static void main(String[] args) {
      Stack <String> s1=new Stack <String>();
      s1.push("c lang");
      s1.push("java");
      s1.push("c++");
      s1.push("js");
      System.out.print("stack values are:"+s1);
      String leftover=s1.pop();
      System.out.println("left value="+leftover);

      String topvalue=s1.peek();
      System.out.println("top value="+topvalue);
      Boolean stackvalue=s1.empty();
      System.out.println("contains value="+stackvalue);
    }
}