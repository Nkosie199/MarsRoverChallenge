
public class Rover {
    int xcoord;
    int ycoord;
    String direction;
    
    public Rover(int x, int y, String dir){
        this.xcoord = x;
        this.ycoord = y;
        this.direction = dir;
    }
    
    void move(int x, int y, String dir){
        switch (dir){
            case "N":
                System.out.println("Moving north to position "+x+","+(y-1));
                this.ycoord--;
                break;
            case "E":
                System.out.println("Moving east to position "+(x+1)+","+y);
                this.xcoord++;
                break;
            case "S":
                System.out.println("Moving south to position "+x+","+(y+1));
                this.ycoord++;
                break;
            case "W":
                System.out.println("Moving west to position "+(x-1)+","+y);
                this.xcoord--;
                break;
        }
    }
    
    String rotate(String currentDirection, String rotation){
        String newDirection = currentDirection;
        switch (currentDirection){
            case "N":
                switch (rotation){
                    case "L":
                        System.out.println("Rotating "+rotation+" from "+currentDirection+" to W");
                        newDirection = "W";
                        this.direction = "W";
                        break;
                    case "R":
                        System.out.println("Rotating "+rotation+" from "+currentDirection+" to E");
                        newDirection = "E";
                        this.direction = "E";
                        break;
                }
                break;
            case "E":
                switch (rotation){
                    case "L":
                        System.out.println("Rotating "+rotation+" from "+currentDirection+" to N");
                        newDirection = "N";
                        this.direction = "N";
                        break;
                    case "R":
                        System.out.println("Rotating "+rotation+" from "+currentDirection+" to S");
                        newDirection = "S";
                        this.direction = "S";
                        break;
                }
                break;
            case "S":
                switch (rotation){
                    case "L":
                        System.out.println("Rotating "+rotation+" from "+currentDirection+" to E");
                        newDirection = "E";
                        this.direction = "E";
                        break;
                    case "R":
                        System.out.println("Rotating "+rotation+" from "+currentDirection+" to W");
                        newDirection = "W";
                        this.direction = "W";
                        break;
                }
                break;
            case "W":
                switch (rotation){
                    case "L":
                        System.out.println("Rotating "+rotation+" from "+currentDirection+" to S");
                        newDirection = "S";
                        this.direction = "S";
                        break;
                    case "R":
                        System.out.println("Rotating "+rotation+" from "+currentDirection+" to N");
                        newDirection = "N";
                        this.direction = "N";
                        break;
                }
                break;
        }
        return newDirection;
    }
}
