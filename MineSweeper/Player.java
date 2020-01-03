import java.util.Scanner;

class Player {

    void  choose(MineField mineField) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter option : ");
        String option = in.next();
        String[] values = option.substring(2,option.length()-1).split(",");

        int x = Integer.parseInt(values[0]);
        int y = Integer.parseInt(values[1]);
        char mode = option.charAt(0);

        if(mineField.isValid(x,y)) {
            if (mode == 'o')
                mineField.open(x, y);
            else if (mode == 'f')
                mineField.flag(x, y);
        }
        else {
            System.out.println("Invalid option");
        }
    }
}