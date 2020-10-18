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
    }
}
