README

The Mars Rover Challenge can be run via the driver class – MarsRoverChallenge.java. You can either run this program from an IDE of your choice or via the terminal using the follwing commands from the src directory:
‘make’ – to compile the driver class
‘make run’ - to run the driver class
‘make clean’ - to delete the .class files resulting from the compilation process

Upon running the program promts you to enter each one of the Rover’s parameters (please see the example below for the appropraite format). Once the program has received an appropriate set of parameters, the Rover begins to execute the instructions supplied as input. After executing each instruction, the program prints the zone as well as the position of the Rover to the console. I have used the following characters to represent the Rover within the grid (zone boundaries).
^ - to indicate the Rover is facing north
> - to indicate the Rover is facing east
V - to indicate the Rover is facing south
< - to indicate the Rover is facing west

Additionally, I have included a RoverTest.java JUnit 5 test class to test whether the Rover is facing in correct direction after rotating each time. I selected this testing strategy as I believe that ensuring that the Rover is facing the right direction is the most error-prone section of the program. It is most likely the yield results which deviate from those expected.

Enjoy!


Example:

***** Welcome *****
Please enter the zone's boundary: 
88
Please enter the Rover's starting location and orientation: 
12 E
Please enter the Rover's instructions: 
MMLMMRMM
M: Move forward
Moving east to position 2,2
********
********
**R*****
********
********
********
********
********
M: Move forward
Moving east to position 3,2
********
********
***R****
********
********
********
********
********
L: Rotate 90 degrees to the left
Rotating L from E to N
********
********
***^****
********
********
********
********
********
M: Move forward
Moving north to position 3,1
********
***^****
********
********
********
********
********
********
M: Move forward
Moving north to position 3,0
***^****
********
********
********
********
********
********
********
R: Rotate 90 degrees to the right
Rotating R from N to E
***>****
********
********
********
********
********
********
********
M: Move forward
Moving east to position 4,0
****>***
********
********
********
********
********
********
********
M: Move forward
Moving east to position 5,0
*****>**
********
********
********
********
********
********
********
