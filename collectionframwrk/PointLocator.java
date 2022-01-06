import java.util.Scanner;

public class PointLocator {
  private static Scanner scan= new Scanner(System.in);

  public static void main(String[] args) {
    Triangle triangle = getTriangle(args);
    System.out.println("coordinates of point: ");
    Point point = new Point(scan.nextInt(), scan.nextInt());    

    boolean isInTriangle = isInTriangle(triangle, point);
    System.out.println();
    System.out.println(isInTriangle ?
                       "Point A("+ point.getX() + ", " + point.getY() +") Lies inside triangle " :
                       "Point A("+ point.getX() + ", " + point.getY() +") lies outside of triangle " );
  }

  private static Triangle getTriangle(String[] args){
    System.out.println("coordinates of first vertex: ");
    Point firstVertex  = new Point(scan.nextInt(), scan.nextInt());
    System.out.println("coordinates of second vertex: ");
    Point secondVertex = new Point(scan.nextInt(), scan.nextInt());
    System.out.println("coordinates of third vertex: ");
    Point thirdVertex  = new Point(scan.nextInt(), scan.nextInt());

    return new Triangle(firstVertex, secondVertex, thirdVertex);
  }

  private static boolean isInTriangle(Triangle triangle, Point point) {
    Triangle firstTriangle    = new Triangle(point, triangle.getSecondVertex(), triangle.getThirdVertex());
    Triangle secondTriangle   = new Triangle(triangle.getFirstVertex(), point, triangle.getThirdVertex());
    Triangle thirdTriangle    = new Triangle(triangle.getFirstVertex(), triangle.getSecondVertex(), point);

    double totalArea          = triangle.getArea();
    double firstTriangleArea  = firstTriangle.getArea();
    double secondTriangleArea = secondTriangle.getArea();
    double thirdTriangleArea  = thirdTriangle.getArea();
    
    return (totalArea == firstTriangleArea  + secondTriangleArea + thirdTriangleArea);
  }

  private static class Point {
    private int x;
    private int y;

    public Point(int x, int y){
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
  }

  private static class Triangle {
    private Point  firstVertex;
    private Point  secondVertex;
    private Point  thirdVertex;

    public Triangle(Point firstVertex, Point secondVertex, Point thirdVertex){
      this.firstVertex  = firstVertex;
      this.secondVertex = secondVertex;
      this.thirdVertex  = thirdVertex;
    }

    public Point getFirstVertex() {
      return firstVertex;
    }

    public Point getSecondVertex() {
      return secondVertex;
    }

    public Point getThirdVertex() {
      return thirdVertex;
    }

    public double getArea() {
      return Math.abs( (firstVertex.getX() * (secondVertex.getY() - thirdVertex.getY() ) +
                        secondVertex.getX() * (thirdVertex.getY() - firstVertex.getY() ) +
                        thirdVertex.getX() * (firstVertex.getY() - secondVertex.getY() ) )
                        / 2.0);
    }
  }

}