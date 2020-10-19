

import singleton.M01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        M01 m01 = M01.getINSTANCE();
        M01 m02 = M01.getINSTANCE();
        System.out.println(m01);
        System.out.println(m02);
        System.out.println(m01 == m02);


        /*
        * 5的源码：0000 0000 0000 0101，5在计算机中保存的补码：0000 0000 0000 0101；

            经过（~）运算以后，也就是逐个取反

            5（~）运算后得到的：1111 1111 1111 1010，那么这个二进制在计算机中保存的形式是这样子的，既补码的形式保存的，当然第一位是符号位。

            那么由补码推算回原码，就是我们需要的，首先转反码，然后转原码。补码需要减去1（1111 1111 1111 1001），然后再逐个取反（1000 0000 0000 0110）。

            5（~）的原码：1000 0000 0000 0110
        * */
        int a=5;
        System.out.println(Integer.toBinaryString(~a));
        System.out.println("a 非的结果是："+(~a));


        Date date = new Date();
        DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dataFormat.format(date));

        String str = new String("str");
        StringBuffer sb = new StringBuffer().append(str).append("1");
        System.out.println(sb);

        ArrayList al=new ArrayList();
        al.add("java1");//添加元素
        al.add(11);
        al.add("java3");
        //遍历
        Iterator it=al.iterator();
        while(it.hasNext()){
            Object obj=it.next();
//            if (obj.equals("java2")) {
//                al.add("java9");
//
//            }
            System.out.println("obj="+obj);
        }

        System.out.println(3<<4);
        System.out.println(2>>1);

        HashSet hs=new HashSet();//创建HashSet对象
        hs.add(new Person("张三",21));
        hs.add(new Person("李四",22));
        hs.add(new Person("王五",23));
        hs.add(new Person("李四",22));


        String str1 = "123";

        try {

            int a1 = Integer.parseInt(str);
            System.out.println(a1);
            return;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException 异常");
            e.printStackTrace();
            System.exit(0);
        }catch (Exception e){
            System.out.println("Exception 异常");
            e.printStackTrace();
        } finally{
            System.out.println(str1);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


