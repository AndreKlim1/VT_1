package Task6;

public class RepeatMatrix {

    public double[] values;

    public RepeatMatrix(double[] values) {this.values = values;}

    public double[] shiftArray(double[] values){
        double temp;
        temp = values[0];
        for(int j= 0; j<values.length-1; j++){
            values[j] = values[j+1];
        }
        values[values.length-1] = temp;
        return values;
    }

    public double[][] makeMatrix(){
        double[][] res = new double[values.length][values.length];
        for(int i=0; i<values.length; i++){
            res[i] = values.clone();
            values = shiftArray(values);
        }
        return res;
    }

}
