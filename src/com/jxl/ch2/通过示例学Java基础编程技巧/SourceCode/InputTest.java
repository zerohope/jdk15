/**
   @version 1.10 2004-02-10
   @author Cay Horstmann
*/

import java.util.*;

public class InputTest
{  
   public static void main(String[] args)
   {
      //System.in代表系统标准输出流，通常这个就是指键盘
      Scanner in = new Scanner(System.in);

      //获取第一个输入
      System.out.print("你的姓名？ ");
      //将用户输入视为字符串
      String name = in.nextLine();

      // 获取第二个输入
      System.out.print("你多大了？ ");
      //将用户输入视为整数
      int age = in.nextInt();

      //输出结果
      System.out.println( name + "你好！明年，你就 "
              + (age + 1) + "岁了。");
      
      
    /* int i;
     String value="100";
     i=Integer.parseInt(value);
     i=200;
     String s=String.valueOf(i);*/

  
      
   }
}
