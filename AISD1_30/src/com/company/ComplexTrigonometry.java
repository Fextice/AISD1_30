package com.company;

public final class ComplexTrigonometry {
    double a; // действительная часть
    double b; // коофициент при мнимой части

    public ComplexTrigonometry(double a, double b) {
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
    public static double arg(ComplexTrigonometry first) {
        if (first.a > 0) {
            return (Math.atan(first.b / first.a)*180/Math.PI);
        } else {
            if (first.a < 0 && first.b > 0) {
                return Math.PI + (Math.atan(first.b / first.a)*180/Math.PI);
            } else {
                return -Math.PI + (Math.atan(first.b / first.a)*180/Math.PI);
            }
        }
    }
    public static ComplexTrigonometry getModule(ComplexTrigonometry first) { // r
        return new ComplexTrigonometry(Math.sqrt(first.a * first.a),Math.sqrt(first.b * first.b));
    }
    public static ComplexTrigonometry sin(ComplexTrigonometry first) {
        return new ComplexTrigonometry(Math.sin(first.a) * Math.cosh(first.b),
                Math.cos(first.a) * Math.sinh(first.b));
    }
    public static ComplexTrigonometry cos(ComplexTrigonometry first) {
        return new ComplexTrigonometry(Math.cos(first.a) * Math.cosh(first.b),
                -Math.sin(first.a) * Math.sinh(first.b));
    }
    public static ComplexTrigonometry tan(ComplexTrigonometry first) {
        return new ComplexTrigonometry((Math.sin(first.a)*Math.cos(first.a))/(Math.pow(Math.cos(first.a),2)+Math.pow(Math.sinh(first.b),2)),
                (Math.sinh(first.b)*Math.cosh(first.b))/(Math.pow(Math.cos(first.a),2)+Math.pow(Math.sinh(first.b),2)));
    }
    public static ComplexTrigonometry cot(ComplexTrigonometry first) {
        return new ComplexTrigonometry((Math.sin(first.a)*Math.cos(first.a))/(Math.pow(Math.cos(first.a),2)+Math.pow(Math.sinh(first.b),2)),
                -(Math.sinh(first.b)*Math.cosh(first.b))/(Math.pow(Math.sin(first.a),2)+Math.pow(Math.sinh(first.b),2)));
    }

}



