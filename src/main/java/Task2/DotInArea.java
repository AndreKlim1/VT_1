package Task2;

public class DotInArea {

    public double X, Y;
    public double[][] shapeDots = {{-4, 5}, {4, 0}, {-6, 0}, {6, -3}};

    public DotInArea(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public boolean checkDotsPosition(){
        boolean res = false;
        for(int i = 0; i<shapeDots.length && !res; i+=2){
            res = checkArea(X,Y,shapeDots[i], shapeDots[i+1]);
        }
        return res;
    }

    public boolean checkArea(double x, double y, double[] squareLeftUp, double[] squareRightDown){

            if((x >= squareLeftUp[0] && y<= squareLeftUp[1]) && ((x <= squareRightDown[0] && y>= squareRightDown[1]))) {
                return true;
            }
        return false;
    }
}
