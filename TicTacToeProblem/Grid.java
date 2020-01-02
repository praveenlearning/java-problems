public class Grid {
    static String[][] box;
    Grid() {
        box = new String[][] {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
    }
    boolean fillBox(int x, int y, String sign) {
        if(x<0 || x>2 || y<0 || y>2) {
            System.out.println("location is out of box");
            return false;
        }
        else {
            if (box[x][y] == "_") {
                box[x][y] = sign;
                return true;
            } else {
                System.out.println("location is already occupied");
                return false;
            }
        }
    }
    void showBox() {
        for(int i=0;i<box.length;i++) {
            for(int j=0;j<box[i].length;j++)
                System.out.print(box[i][j]+"  ");
            System.out.println("\n");
        }
    }
    boolean isFull(){
        boolean isfull = true;
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box[i].length;j++){
                if(box[i][j]=="_")
                    isfull = false;
            }
        }
        return full;
    }
    boolean verticalCheck(int column, String sign) {
        String check = "";
        for(int i=0;i<box.length;i++)
            check += box[i][column];
        return check.equals(sign+sign+sign);
    }

    boolean horizontalCheck(int row, String sign) {
        String check = "";
        for(int i=0;i<box.length;i++)
            check += box[row][i];
        return check.equals(sign+sign+sign);
    }

    boolean diagonalCheck(String sign) {
        String check = "";
        boolean flag;
        for(int i=0;i<box.length;i++)
            check += box[i][i];
        flag = check.equals(sign+sign+sign);
        for(int i=0;i<box.length;i++)
            check += box[i][box.length-i-1];
        flag = flag || check.equals(sign+sign+sign);
        return flag;
    }
}