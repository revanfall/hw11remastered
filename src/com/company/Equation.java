package com.company;

public class Equation {
    Double[] countEquation(double a, double b, double c) {
        Double[] res = new Double[2];
        double dis = Math.pow(b, 2) - (4 * a * c);
        if (dis > 0) {
            res[0] = (-b + Math.sqrt(dis)) / (2 * a);
            res[1] = (-b - Math.sqrt(dis)) / (2 * a);
            return res;
        } else if (dis == 0) {
            res[0] = -b / (2 * a);
            return res;
        } else if (dis < 0) {
            res[0] = null;
            res[1] = null;
            return res;
        }
        return res;
    }
}

