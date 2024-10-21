public class Ball{
    private double radius;
    private double x, y;

    public Ball(double r, double x, double y){
        this.radius = r;
        this.x = x;
        this.y = y;
    }

    public double calcDistance(Ball b){
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2))
    }

    public boolean overlap(Ball b){
        //do this

    }

}