package homework_week3;

public class P16_Point {
    private int x;
    private int y;

    public point(){

    }
    public point(int x,int y){
        this.x=x;
        this.y=y;

    }
    public double distance(){
        return distance(0,0);
    }
    public double distance(Point another){
        return distance(another.get x(),another.get y());
    }
    public double distance(int x, int y){
        return Math.sqrt(((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y)));
    }
    public int getx(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int gety(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
