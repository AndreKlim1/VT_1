package Task7;

public class SortArr {

    public double[] values;

    public SortArr(double[] values) {this.values = values;}

    public double[] swap(double[] array, int indA, int indB){
        double temp = array[indA];
        array[indA] =  array[indB];
        array[indB] = temp;
        return array;
    }

    public double[] sort(){
        int i = 0;
        while(i<values.length-1){
            if(values[i]<=values[i+1]){
                i++;
            } else if (values[i]>values[i+1]) {
                values = swap(values, i, i+1);
                if(i!=0){
                    i--;
                }
            }
        }
        return values;
    }
}
