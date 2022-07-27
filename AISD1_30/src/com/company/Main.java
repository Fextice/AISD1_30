package com.company;
public class Main {

    public static void main(String[] args) {
        ComplexNum t1 = new ComplexNum(4,3);
        ComplexNum t2 = new ComplexNum(6,2);
        System.out.printf("tested complex numbers is t1 = %s, t2 = %s\n", t1, t2);
        System.out.printf("t1 + t2 = %s\n", ComplexNum.plus(t1,t2) );
        System.out.printf("t1 - t2 = %s\n", ComplexNum.min(t1,t2) );
        System.out.printf("t1 * t2 = %s\n", ComplexNum.mul(t1,t2) );
        System.out.printf("t1 / t2 = %s\n", ComplexNum.div(t1,t2) );

        ComplexTrigonometry t3 = new ComplexTrigonometry(14,3);
        System.out.printf("tested complex number is %s\n", t3);
        System.out.printf("Argument = %s\n", ComplexTrigonometry.arg(t3));
        System.out.printf("Module = %s\n", ComplexTrigonometry.getModule(t3));
        System.out.printf("sin = %s\n", ComplexTrigonometry.sin(t3));
        System.out.printf("cos = %s\n", ComplexTrigonometry.cos(t3));
        System.out.printf("tan = %s\n", ComplexTrigonometry.tan(t3));
        System.out.printf("cot = %s\n", ComplexTrigonometry.cot(t3));
    }
}
