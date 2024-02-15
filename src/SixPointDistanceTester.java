import java.util.Scanner;
public class SixPointDistanceTester {


    private static Scanner input = new Scanner(System.in); //we will retrieve multipoints of x and y coordinates.


    public static void main(String[] args) {
        computeShortestDistance(enterPoint());
    //   enterPoint();

    }



    //create a method named enterPoint()
    //Point[] points  =  {p1, p2, p3, p4, p5, p6}
    //Point[] points = {new Point(1,2), new Point(3,6.6), new Point(5,6)....  };
    public static Point[] enterPoint(){
        Point[] points = new Point[6];
        System.out.println("Enter 6 points of x and y: ");
        for(int i = 0; i < points.length; i++ ){

            points[i] = new Point(input.nextDouble(), input.nextDouble());
        }
        return points;
    }

    public static void computeShortestDistance(Point[] points){

        //we will complete this part on Thursday
        double shortestDistance = Point.distance(points[0], points[1]); //this line has a logic error. figure it out.
        Point p1 = points[0];
        Point p2 = points[1] ;

        for(int i = 0; i < points.length; i++){

            for(int j = i + 1; j < points.length; j++){

               double aDistance =  Point.distance(points[i], points[j]);

               if(aDistance < shortestDistance){
                   shortestDistance = aDistance;
                   p1 = points[i];
                   p2 = points[j];
               }
            }
        }

        System.out.printf("The shortest distance beteween ( %.1f,%.1f ) and (%.1f ,%.1f ) is (%.2f  )", p1.getX(), p1.getY(),p2.getX(), p2.getY(),shortestDistance );

    }
}
