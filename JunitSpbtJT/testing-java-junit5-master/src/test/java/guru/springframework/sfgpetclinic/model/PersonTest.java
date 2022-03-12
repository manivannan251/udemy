package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("object")
class PersonTest {

	@Test
	void testGroupedAssertions() {
		Person person = new Person(1l, "Joe", "Campbell");
		assertAll("Test All Properties",
				()->assertEquals("Joe", person.getFirstName()),
				()->assertEquals("Campbell", person.getLastName())
				);
	}
	
	
	@Test
	void testGroupedAssertionsMsgs() {
		Person person = new Person(1l, "Joe", "Campbell");
		assertAll("Test All Properties",
				()->assertEquals("Joe", person.getFirstName(),"First Name failed"),
				()->assertEquals("Campbell", person.getLastName(),"Last Name failed")
				);
	}
	
	
	@RepeatedTest(value = 10,name = "{displayName}:{currentRepetition}-{totalRepetitions}")
	@DisplayName("My repeated tests")
	void testmyRepeatedTests() {
		
	}
	
	
	@RepeatedTest(5)
	void testMyRepeatedTestsWithDi(TestInfo testInfo,RepetitionInfo repetetionInfo) {
		System.out.println(testInfo.getDisplayName()+" : "+repetetionInfo.getCurrentRepetition());
	}
	
	
	

}
