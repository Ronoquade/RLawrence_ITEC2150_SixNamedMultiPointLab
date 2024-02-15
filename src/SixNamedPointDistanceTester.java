import java.util.Scanner;
public class SixNamedPointDistanceTester {


    private static Scanner input = new Scanner(System.in); //we will retrieve multipoints of x and y coordinates.


    public static void main(String[] args) {
        computeShortestDistance(enterPoint());
    //   enterPoint();

    }



    //create a method named enterPoint()
    //Point[] points  =  {p1, p2, p3, p4, p5, p6}
    //Point[] points = {new Point(1,2), new Point(3,6.6), new Point(5,6)....  };
    public static NamedPoint[] enterPoint(){
        NamedPoint[] points = new NamedPoint[6];
        String[] names = {"a","b","c","d","e","f"};
        System.out.println("Enter 6 points of x and y coordinates: ");
        for(int i = 0; i < points.length; i++ ){
            System.out.print("Point " + names[i] + ": ");
            points[i] = new NamedPoint(input.nextDouble(), input.nextDouble(), names[i]);
        }
        return points;
    }

    public static void computeShortestDistance(NamedPoint[] points){

        //we will complete this part on Thursday
        double shortestDistance = NamedPoint.distance(points[0], points[1]); //this line has a logic error. figure it out.
        NamedPoint p1 = points[0];
        NamedPoint p2 = points[1] ;

        for(int i = 0; i < points.length; i++){

            for(int j = i + 1; j < points.length; j++){

               double aDistance =  NamedPoint.distance(points[i], points[j]);

               if(aDistance < shortestDistance){
                   shortestDistance = aDistance;
                   p1 = points[i];
                   p2 = points[j];
               }
            }
        }

        System.out.printf("The shortest distance of two points are %s(%.1f,%.1f) and %s(%.1f,%.1f) and their distance is (%.2f)",p1.getName(),  p1.getX(), p1.getY(), p2.getName(), p2.getX(), p2.getY(),shortestDistance );

    }
}
