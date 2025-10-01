import java.util.Scanner;

class ArrayCreationLab {
    public static void main(String[] args) {
        int arraySize = 5;
        int[] scores = new int[arraySize];
        System.out.println(scores.length);
        System.out.println();
        
        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();
        
        double[] prices = new double[3];
        prices[0] = 99.9;
        prices[1] = 14.50;
        prices[2] = 20.00;
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many favorite foods? ");
        int num = input.nextInt();
        input.nextLine();
        
        String[] foods = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter food " + (i + 1) + ": ");
            foods[i] = input.nextLine(); 
           // String food = input.nextLine();
        }
        System.out.println("Your favorite foods are: " + String.join(", ", foods)); //Join all food names with ", " between them and print them on one line
        }
        
    }
