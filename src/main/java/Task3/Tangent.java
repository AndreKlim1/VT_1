package Task3;

import java.util.Hashtable;

public class Tangent {
    public double A, B, H;

    public Tangent(double a, double b, double h){
        if(b<a){
            B = a;
            A = b;
        }
        else{
            A = a;
            B = b;
        }
        H = h;
    }

    public Hashtable makeTable(){
        Hashtable tangentValues = new Hashtable();
        for(double i=A; i<=B; i+=H){
            tangentValues.put(i, Math.ceil(calcTangent(i)*100)/100);
        }
        return tangentValues;
    }

    public double calcTangent(double arg){
        return Math.tan(arg);
    }
}
