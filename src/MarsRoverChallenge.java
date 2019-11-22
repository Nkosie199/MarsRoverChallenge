import java.util.Scanner;

public class MarsRoverChallenge {
    private static Scanner sc;
    private static int length;
    private static int breadth;
    
    public static void main(String[] args){
        System.out.println("***** Welcome *****");
        sc = new Scanner(System.in);
        System.out.println("Please enter the zone's boundary: ");
        String zoneSize = sc.nextLine();
        String[] coordinates = zoneSize.split("");
        length = Integer.parseInt(coordinates[0]);
        breadth = Integer.parseInt(coordinates[1]);
        
        System.out.println("Please enter the Rover's starting location and orientation: ");
        String startingPos = sc.nextLine();
        String[] params = startingPos.split(" ");
        String[] coordinates2 = params[0].split("");
        int x = Integer.parseInt(coordinates2[0]);
        int y = Integer.parseInt(coordinates2[1]);
        String direction = params[1];
        
        System.out.println("Please enter the Rover's instructions: ");
        String instructions = sc.nextLine();
        String[] instructions2 = instructions.split("");
        navigate(x, y, direction, instructions2);
    }
    
    static void navigate(int xcoord, int ycoord, String direction, String[] instr){
        Rover rover = new Rover(xcoord, ycoord, direction);
        for (int i = 0; i < instr.length; i++){
            String instruction = instr[i];
            System.out.print(instruction+": ");
            switch (instruction){
                case "M":
                    System.out.println("Move forward");
                    rover.move(rover.xcoord, rover.ycoord, rover.direction);
                    break;
                case "R":
                    System.out.println("Rotate 90 degrees to the right");
                    rover.rotate(rover.direction, "R");
                    break;
                case "L":
                    System.out.println("Rotate 90 degrees to the left");
                    rover.rotate(rover.direction, "L");
                    break;
            }
            printGrid(length, breadth, rover);
        }
    }
    
    static void printGrid(int length, int breadth, Rover rover){  
        for (int i = 0; i < length; i++){
            for (int j = 0; j < breadth; j++){
                if ((rover.xcoord==j) && (rover.ycoord==i)){
                	if (rover.direction == "N") {
                		System.out.print("^");
                	}else if (rover.direction == "E") {
                		System.out.print(">");
                	}else if (rover.direction == "S") {
                		System.out.print("V");
                	}else if (rover.direction == "W") {
                		System.out.print("<");
                	}else {
                		System.out.print("R");
                	}
                    
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
