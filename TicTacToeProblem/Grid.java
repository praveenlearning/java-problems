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
        boolean full = true;
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box[i].length;j++){
                if(box[i][j]=="_"){
                    full = full && false;
                }
            }
        }
        return full;
    }
}