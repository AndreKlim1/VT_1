package Task1;

import java.lang.Math;

public class ExpCalc {
    public double X, Y;

    public ExpCalc(double x, double y){
        X = x;
        Y = y;
    }

    public double calcNumerator(double x, double y){
        double res;
        res = 1+ Math.pow(Math.sin(x+y), 2);
        return res;
    }

    public double calcDenominator(double x, double y){
        double res;
        res = 2+ Math.abs(x - 2*x / (1+Math.pow(x*y, 2)));
        return res;
    }

    public double completeSolution(){

        return calcNumerator(X, Y) / calcDenominator(X, Y) + X;
    }
}
