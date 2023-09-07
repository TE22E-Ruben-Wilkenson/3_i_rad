import java.util.Scanner;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        
        int turn = 1; 
        boolean win = false;
        String input_x;
        String input_y;

        char[] row_1 = {'0','0','0'};
        char[] row_2 = {'0','0','0'};
        char[] row_3 = {'0','0','0'};
        
while (win == false){   // 9 
    
        System.out.println("    1 2 3");

        System.out.println("A " + Arrays.toString(row_1));
        System.out.println("B " + Arrays.toString(row_2));
        System.out.println("C " + Arrays.toString(row_3));

        Scanner tan = new Scanner(System.in);


        System.out.print("Enter y coordinate:  ");
        input_y = tan.nextLine();
        
        System.out.print("Enter x Coordinate:     ");
        input_x = tan.nextLine();
        
        
        //  O
        if (turn % 2 == 0){
        if (input_y.equals("A")){
            row_1[Integer.parseInt(input_x)-1] = 'O';

        }

        else if (input_y.equals("B")){
            row_2[Integer.parseInt(input_x)-1] = 'O';

        }

        else if (input_y.equals("C")){
            row_3[Integer.parseInt(input_x)-1] = 'O';

        }
        }

        // X
        else if (turn % 2 != 0){
        
        if (input_y.equals("A")){
            row_1[Integer.parseInt(input_x)-1] = 'X';

        }

        else if (input_y.equals("B")){
            row_2[Integer.parseInt(input_x)-1] = 'X';

        }

        else if (input_y.equals("C")){
            row_3[Integer.parseInt(input_x)-1] = 'X';

        }
        }

    //win conditions

    // columner
        if ((row_1[0] == 'O' && row_2[0] == 'O' && row_3[0] == 'O') || 
        (row_1[0] == 'X' && row_2[0] == 'X' && row_3[0] == 'X'))
        {
            win = true;
        }

        else if ((row_1[1] == 'O' && row_2[1] == 'O' && row_3[1] == 'O') || 
        (row_1[1] == 'X' && row_2[1] == 'X' && row_3[1] == 'X'))
        {
            win = true;
        }

        else if ((row_1[2] == 'O' && row_2[2] == 'O' && row_3[2] == 'O') || 
        (row_1[2] == 'X' && row_2[2] == 'X' && row_3[2] == 'X'))
        {
            win = true;
        }

    // rader
        if ((row_1[0] == 'O' && row_1[1] == 'O' && row_1[2] == 'O') || 
        (row_1[0] == 'X' && row_1[1] == 'X' && row_1[2] == 'X'))
        {
            win = true;
        }
        
        else if ((row_2[0] == 'O' && row_2[1] == 'O' && row_2[2] == 'O') || 
        (row_2[0] == 'X' && row_2[1] == 'X' && row_2[2] == 'X'))
        {
            win = true;
        }

        else if ((row_3[0] == 'O' && row_3[1] == 'O' && row_3[2] == 'O') || 
        (row_3[0] == 'X' && row_3[1] == 'X' && row_3[2] == 'X'))
        {
            win = true;
        }

    // diagonala
        if ((row_1[0] == 'O' && row_2[1] == 'O' && row_3[2] == 'O') || 
        (row_1[0] == 'X' && row_2[1] == 'X' && row_3[2] == 'X'))
        {
            win = true;
        }

        else if ((row_3[0] == 'O' && row_2[1] == 'O' && row_1[2] == 'O') || 
        (row_3[0] == 'X' && row_2[1] == 'X' && row_1[2] == 'X'))
        {
            win = true;
        }

    turn ++;

    }



if (win = true){

    System.out.println(Arrays.toString(row_1));
    System.out.println(Arrays.toString(row_2));
    System.out.println(Arrays.toString(row_3));    
    System.out.println("Game over!");
}

}
}
