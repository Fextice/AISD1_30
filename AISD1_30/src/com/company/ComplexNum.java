package com.company;

public final class ComplexNum {
    double a; // действительная часть
    double b; // коофициент при мнимой части

    public ComplexNum(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        if (b >= 0) {
            return a + "+" + b + "i";
        }
        else {
            return a + "-" + -b + "i";
        }
    }
    public static ComplexNum plus(ComplexNum first, ComplexNum second) { // (СЛОЖЕНИЕ)
        return new ComplexNum(first.a + second.a,
                first.b + second.b);
    }
    public static ComplexNum min(ComplexNum first, ComplexNum second) { // (ВЫЧИТАНИЕ)
        return new ComplexNum(first.a - second.a,
                first.b - second.b);
    }
    public static ComplexNum mul(ComplexNum first, ComplexNum second) { // (УМНОЖЕНИЕ)
        return new ComplexNum(first.a * second.a - first.b * second.b,
                first.a * second.b + first.b * second.a);
    }
    public static ComplexNum div(ComplexNum first, ComplexNum second) { // (ДЕЛЕНИЕ)
        return new ComplexNum((first.a * second.a + first.b*second.b) / ((second.a * second.a) + (second.b * second.b)),
                (second.a * first.b - first.a * second.b) / ((second.a * second.a) + (second.b * second.b)));
    }
}