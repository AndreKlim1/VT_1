package Task9;

public class Busket {
    private Ball[] balls;

    public Busket(Ball[] balls){
        this.balls = balls;
    }

    public double wholeWeight(){
        double result = 0;
        for(int i=0; i<balls.length; i++){
            result+=balls[i].getWeight();
        }
        return result;
    }

    public int blueAmount(){
        int result = 0;
        for(int i=0; i<balls.length; i++){
            if(balls[i].getColor().equals("Blue")){
                result++;
            }
        }
        return result;
    }

}

