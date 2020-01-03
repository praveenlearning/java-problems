import java.util.*;
class MineField {
    private String[][] mines;
    String[][] minefield;
    boolean openedMine;
    int size;
    MineField(int size) {
        Scanner in = new Scanner(System.in);
        this.size = size;
        mines = new String[size][size];
        minefield = new String[size][size];
        System.out.println("Enter the minefield layout ");
        String []layout = in.nextLine().split(",");

        for(int i=0;i<layout.length;i++) {
            int fromIndex = 0;
            int index = layout[i].indexOf("m", fromIndex);
            while(index > -1) {
                mines[i][index] = "m";
                fromIndex = index + 1;
                index = layout[i].indexOf("m", fromIndex);
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) {
                minefield[i][j] = "x";
            }
        }
    }

    void open(int x, int y) {
        if (mines[x][y] == "m") {
            minefield[x][y] = "m";
            showMineField();
            System.out.println("Oops, you stepped on a mine ! Game over !");
            openedMine = true;
        } else if (minefield[x][y] == "o") {
            System.out.println("Already opened");
        } else {
            minefield[x][y] = "o";
        }

    }

    void flag(int x, int y) {
        if (minefield[x][y] == "o")
            System.out.println("Already opened");
        else
            minefield[x][y] = "f";
    }
    void showMineField() {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) {
                System.out.print(minefield[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    boolean check() {
        boolean hasWinner = true;
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++) {
                if(minefield[i][j]=="f") {
                    if(mines[i][j]!="m")
                        hasWinner = false;
                }
                else if(minefield[i][j]!="o")
                    hasWinner = false;
            }
        }

        return hasWinner;
    }

    boolean isValid(int x, int y) {
        if(x>=0 && x<size && y>=0 && y<size)
            return true;
        else {
            System.out.println("Invalid location");
            return false;
        }
    }
}