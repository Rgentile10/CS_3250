
//TASK: You are writing tests to check against CustomizedHangman.java. Thus, do not modify CustomizedHangman.java; it is your program under test.     
//You may work alone or with another student in this course (max team size = 2).
//
//Consider CustomizedHangman.java.
//Develop at least 4 JUnit tests to evaluate CustomizedHangman class. You should add your JUnit tests to CustomizedHangmanTest.java.
//
//Consider the lostStick() method of CustomizedHangman class.
//
//If it has   if (sticksRemaining < 0)    which is a faulty version instead of    if (sticksRemaining == 0).
//Can the tests you created previously detect this fault? If not, design and automate test(s) that can detect this fault.

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomizedHangmanTest 
{
	
	static CustomizedHangman Name_OverloadConstructor = new CustomizedHangman("RylieWithFiveSticksByDefaultToStart");
	static CustomizedHangman Name_Sticks_OverloadConstructor = new CustomizedHangman("RylieWithXAmountofSticksToStart", 10);
	
	@BeforeAll
	static void constructingHangmen() {
		
	Name_OverloadConstructor = new CustomizedHangman("RylieWithFiveSticksByDefaultToStart");
	Name_Sticks_OverloadConstructor = new CustomizedHangman("RooneyWithXAmountofSticksToStart", 10);
	
	}
	
	@BeforeEach
	void resetEachHangmanRylie5AndRooney10() {
		Name_OverloadConstructor = new CustomizedHangman("RylieWithFiveSticksByDefaultToStart");
		Name_Sticks_OverloadConstructor = new CustomizedHangman("RooneyWithXAmountofSticksToStart", 10);
	}
	
	@Test
	public void changeName_GetName_RylieToTommy() {
		CustomizedHangmanTest.Name_OverloadConstructor.setName("TommyWithFiveSticksByDefaultToStart");
	
		//lets check that the name was changed to Tommy
		
		assertAll("Testing Name change Rylie to Tommy & Rooney to Todd", 
				() -> assertEquals("TommyWithFiveSticksByDefaultToStart", CustomizedHangmanTest.Name_OverloadConstructor.getName()),
				() -> assertEquals("RooneyWithXAmountofSticksToStart", CustomizedHangmanTest.Name_Sticks_OverloadConstructor.getName())
				);
		
	
	}
	@Test
	public void changeName_RooneyToTodd() {
		CustomizedHangmanTest.Name_Sticks_OverloadConstructor.setName("ToddWithFiveSticksByDefaultToStart");
	
		// lets check that the named has been changed to Todd
	
	}
	
	
	// Dependent Tests, 2 * amount of intitial sticks of the hangman Rylie... then when one stick remainign we test if it prints out tehmessage or if there is something wrong at the end of hangmans life
	
	@Test
	void check_getSticksRemaining_THEN_sticks_lost() {
		
		
		for(int i = 5; i>=0;i--) {
			
		int RyliesCurrentAccurateSticksRemaining = i;
		int RyliesAccurateSticksRemainingAfterDecrementingOneStick = i-1;
		
		if(i != 1) {
		assertAll("test dependent assertions",
				() -> {
		
					// first, check sticks remaining method
					assertEquals(CustomizedHangmanTest.Name_OverloadConstructor.getSticksRemaining(), RyliesCurrentAccurateSticksRemaining);
					
					//THEN, if
					// these  the next lines are only executed if the previous assertion was valid (we can rely on using the getsticksremaining method
					//decrement expected and actual, then compmare
					
					CustomizedHangmanTest.Name_OverloadConstructor.lostStick(); // remove one stick from name hangman
					
					assertEquals(RyliesAccurateSticksRemainingAfterDecrementingOneStick, CustomizedHangmanTest.Name_OverloadConstructor.getSticksRemaining());
					
				});
		}
		
		if (i == 1) {
			
			
			CustomizedHangmanTest.Name_OverloadConstructor.lostStick(); // remove one stick from name hangman
			
			assertEquals(0,CustomizedHangmanTest.Name_OverloadConstructor.getSticksRemaining());
			}
		}
	
	}
	
	
	@Test
	void whatHappensIfWeTakemoreSticksThanTheyHave_Zero() {
		
		for(int i = 5; i>=-3;i--) {  // only diference here is we are going out of bounds
			
			int RyliesCurrentAccurateSticksRemaining = i;
			int RyliesAccurateSticksRemainingAfterDecrementingOneStick = i-1;
			
			assertAll("test dependent assertions",
					() -> {
			
						// first, check sticks remaining method
						assertEquals(CustomizedHangmanTest.Name_OverloadConstructor.getSticksRemaining(), RyliesCurrentAccurateSticksRemaining);
						
						//THEN, if
						// these  the next lines are only executed if the previous assertion was valid (we can rely on using the getsticksremaining method
						//decrement expected and actual, then compmare
						
						CustomizedHangmanTest.Name_OverloadConstructor.lostStick(); // remove one stick from name hangman
						
						assertEquals(RyliesAccurateSticksRemainingAfterDecrementingOneStick, CustomizedHangmanTest.Name_OverloadConstructor.getSticksRemaining());
						
					});
	}
		
	}
}



