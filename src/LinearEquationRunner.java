import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //Create x and y variabkles for the object and for storing the coordinates the user inputs.
        String coordinate1;
        String coordinate2;
        int x1;
        int x2;
        int y1;
        int y2;

        //Ask user for two coordinates and stores them
        System.out.print("Enter coordinate 1: ");
        coordinate1 = input.nextLine();
        System.out.print("Enter coordinate 2: ");
        coordinate2 = input.nextLine();

        //Gets rid of the () in the coordinates
        int length1 = coordinate1.length();
        int length2 = coordinate2.length();
        coordinate1 = coordinate1.substring(1, length1 - 1);
        coordinate2 = coordinate2.substring(1, length2 - 1);

        //Find index of the "," and store them
        int commas1 = coordinate1.indexOf(",");
        int commas2 = coordinate2.indexOf(",");

        //Using the index of the commas, I use substring to extract the numbers
        x1 = Integer.parseInt(coordinate1.substring(0, commas1));
        x2 = Integer.parseInt(coordinate2.substring(0, commas2));
        y1 = Integer.parseInt(coordinate1.substring(commas1 + 2));
        y2 = Integer.parseInt(coordinate2.substring(commas2 + 2));

        //Checking whether I can run the program or just say the coordinates make a vertical line.
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
        }
       //Prints the info and asks the user to input a x value that we can give the y value of.
        else {
            LinearEquation equation1 = new LinearEquation(x1, y1, x2, y2);
            System.out.println(equation1.lineInfo());
            System.out.print("\nEnter a value for x: ");
            double x = input.nextDouble();
            System.out.println(equation1.coordinateForX(x));
        }
    }
}
