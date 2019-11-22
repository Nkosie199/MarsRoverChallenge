import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoverTest {
	
	@Test
    public void testNorthRotatations() {
		//North...
		//rotate left
		Rover rover = new Rover(1,1,"N");
		String expectedResult = "W";
        String actualResult = rover.rotate(rover.direction, "L");
        assertEquals(expectedResult, actualResult);
        //rotate right
  		Rover rover2 = new Rover(1,1,"N");
  		String expectedResult2 = "E";
	    String actualResult2 = rover2.rotate(rover2.direction, "R");
	    assertEquals(expectedResult2, actualResult2);
    }
	
	@Test
    public void testEastRotatations() {
		//East...
		//rotate left
	    Rover rover = new Rover(1,1,"E");
		String expectedResult = "N";
        String actualResult = rover.rotate(rover.direction, "L");
        assertEquals(expectedResult, actualResult);
        //rotate right
  		Rover rover2 = new Rover(1,1,"E");
  		String expectedResult2 = "S";
	    String actualResult2 = rover2.rotate(rover2.direction, "R");
	    assertEquals(expectedResult2, actualResult2);
	}
	
	@Test
    public void testSouthRotatations() {
		//South..,
		//rotate left
	    Rover rover = new Rover(1,1,"S");
		String expectedResult = "E";
        String actualResult = rover.rotate(rover.direction, "L");
        assertEquals(expectedResult, actualResult);
        //rotate right
  		Rover rover2 = new Rover(1,1,"S");
  		String expectedResult2 = "W";
	    String actualResult2 = rover2.rotate(rover2.direction, "R");
	    assertEquals(expectedResult2, actualResult2);
	}
	
	@Test
    public void testWestRotatations() {
		//West...
		//rotate left
	    Rover rover = new Rover(1,1,"W");
		String expectedResult = "S";
        String actualResult = rover.rotate(rover.direction, "L");
        assertEquals(expectedResult, actualResult);
        //rotate right
  		Rover rover2 = new Rover(1,1,"W");
  		String expectedResult2 = "N";
	    String actualResult2 = rover2.rotate(rover2.direction, "R");
	    assertEquals(expectedResult2, actualResult2);
	}

}