package Task4;

import java.util.ArrayList;

public class Prime {

    public int[] values;

    public Prime(int[] values) { this.values = values;}

    public boolean isPrime(int value){
        if(value>=2) {
            for (int i = 2; i <= Math.sqrt(value); i++) {
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int[] primeSearch(){
        ArrayList<Integer> primeInd = new ArrayList<>();
        for(int i=0; i<values.length; i++){
            if(isPrime(values[i])){
                primeInd.add(i);
            }
        }
        int[] result = new int[primeInd.size()];
        for(int i=0; i<result.length; i++){
            result[i] = primeInd.get(i);
        }
        return result;
    }

}
