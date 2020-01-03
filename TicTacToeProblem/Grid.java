public class Grid {
    static String[][] box;
    Grid() {
        box = new String[3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++)
                box[i][j] = Integer.toString(3*i+j+1);
        }
    }
    boolean fillBox(int x, String sign) {
        if(x<1 || x>9) {
            System.out.println("location is out of box");
            return false;
        } else {
            int j = (x-1)%3;
            int i = (x-1-j)/3;
            if(isEmpty(i,j)) {
                box[i][j] = sign;
                return true;
            } else {
                System.out.println("location is already occupied");
                return false;
            }
        }
    }
    boolean isEmpty(int i, int j) {
        if(box[i][j].equals(Integer.toString(3*i+j+1)))
            return true;
        else
            return false;
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
                if(box[i][j].equals(Integer.toString(3*i+j+1)))
                    isfull = false;
            }
        }
        return isfull;
    }
    boolean verticalCheck() {
        if(box[0][0]==box[1][0] && box[1][0]==box[2][0])
            return true;
        else if(box[0][1]==box[1][1] && box[1][1]==box[2][1])
            return true;
        else if(box[0][2]==box[1][2] && box[1][2]==box[2][2])
            return true;
        else
            return false;
    }

    boolean horizontalCheck() {
        if(box[0][0]==box[0][1] && box[0][1]==box[0][2])
            return true;
        else if(box[1][0]==box[1][1] && box[1][1]==box[1][2])
            return true;
        else if(box[2][0]==box[2][1] && box[2][1]==box[2][2])
            return true;
        else
            return false;
    }

    boolean diagonalCheck() {
        if(box[0][0]==box[1][1] && box[1][1]==box[2][2])
            return true;
        else if(box[2][0]==box[1][1] && box[1][1]==box[0][2])
            return true;
        else
            return false;
    }
}