public class Point {

    public static void main(String[] args) {


    }


   //instance variables, sadece class içinden erişilebiliyor.
   private int x;
   private int y;

   public Point(int x, int y){
       setX(x);
       setY(y);

   }
   //voidler değer döndürmez, voidlerle değer atanır.
   public void setX(int x){
       this.x = x;
   }

    public void setY(int y) {
        this.y = y;
    }
   //************************************************
    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }


    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distance(){
      return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double distance(Point p){
       int xDistance = this.x - p.getX();
       int yDistance = this.y - p.getY();
       return Math.sqrt(Math.pow(xDistance,2)+Math.pow(yDistance,2));
    }
    public double distance(int a, int b){
       int xDistance = this.x - a;
       int yDistance = this.y - b;
       return Math.sqrt(Math.pow(xDistance,2)+Math.pow(yDistance,2));
    }
}
