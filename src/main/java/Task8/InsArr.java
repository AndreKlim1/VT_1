package Task8;

import java.util.ArrayList;

public class InsArr {

    public double[] arrA, arrB;

    public InsArr(double[] arrA, double[] arrB){
        this.arrA = arrA;
        this.arrB = arrB;
    }

    public double[] combineLists(){
        double[] result = new double[arrA.length+arrB.length];
        int j=0, k=0, i=0;
        for(i=0; i<arrB.length && j<arrA.length; i++, j++){
            if(arrB[i]<=arrA[j]){
                result[k]=arrB[i];
                j--;
            }
            else{
                result[k]=arrA[j];
                i--;
            }
            k++;
        }
        if(i<arrB.length){
            while(i<arrB.length) {
                result[k] = arrB[i];
                i++;
                k++;
            }
        }
        else{
            while(j<arrA.length) {
                result[k] = arrA[j];
                j++;
                k++;
            }
        }
        return result;
    }
}
