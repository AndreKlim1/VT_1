package Task5;

import java.util.Arrays;

public class IncrSeq {

    public int[] values;

    public IncrSeq(int[] values) {this.values = values;}

    public int maxSequence(){
        int[] seqNumbers = new int[values.length];
        int maxNumb = 1, elemMaxSeq = 1;
        Arrays.fill(seqNumbers, 1);
        for(int i=0; i<values.length; i++){
            for(int j=0; j<i; j++){
                if(values[j]<values[i] && seqNumbers[j]>=elemMaxSeq){
                    elemMaxSeq++;
                }
            }
            seqNumbers[i] = elemMaxSeq;
            if(maxNumb<elemMaxSeq)
                maxNumb=elemMaxSeq;
            elemMaxSeq = 1;
        }
        return values.length - maxNumb;
    }

}
