import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String coordinate1;
            String coordinate2;
            int x1;
            int x2;
            int y1;
            int y2;
                System.out.println("Welcome!!");
                System.out.print("Enter coordinate 1: ");
                coordinate1 = input.nextLine();
                System.out.print("Enter coordinate 2: ");
                coordinate2 = input.nextLine();

                int length1 = coordinate1.length();
                int length2 = coordinate2.length();
                coordinate1 = coordinate1.substring(1, length1 - 1);
                coordinate2 = coordinate2.substring(1, length2 - 1);

                int commas1 = coordinate1.indexOf(",");
                int commas2 = coordinate2.indexOf(",");

                x1 = Integer.parseInt(coordinate1.substring(0, commas1));
                x2 = Integer.parseInt(coordinate2.substring(0, commas2));
                y1 = Integer.parseInt(coordinate1.substring(commas1 + 2));
                y2 = Integer.parseInt(coordinate2.substring(commas2 + 2));

                if (x1 == x2) {
                    System.out.println("These points are on a vertical line: x = " + x1);
                } else {
                    LinearEquation equation1 = new LinearEquation(x1, y1, x2, y2);
                    System.out.println(equation1.lineInfo());
                    System.out.print("\nEnter a value for x: ");
                    double x = input.nextDouble();
                    System.out.println(equation1.coordinateForX(x));
                }
    }
    //    Once you begin working on the LinearEquation class, you will quickly discover that the most challenging part of this task is the equation() method, which returns the equation as a String in the format y = mx + b with various constraints on how the printing looks; you might consider getting all other methods working (and tested!) before tackling the equation() method.
//
//    You might do the lineInfo() method last, since that requires all other methods to be completed.
}
