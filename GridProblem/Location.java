class Location {
    int x,y;
    Location location;
    Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Location updateLocation(Location location, String command) {
        if(command == "right")
            location.x = location.x+1;
        if(command == "up")
            location.y = location.y+1;
        return location;
    }

    boolean equals(Location location1) {
        if(x == location1.x && y == location1.y)
            return true;
        else
            return false;
    }

    String[] whereToMove(Location location1) {
        String[] commands = new String[2];
        if(x < location1.x) 
            commands[0] = "right";
        if(y < location1.y)
            commands[1] = "up";
        return commands;
    }

    void display() {
        System.out.println("("+x+","+y+")");
    }
}