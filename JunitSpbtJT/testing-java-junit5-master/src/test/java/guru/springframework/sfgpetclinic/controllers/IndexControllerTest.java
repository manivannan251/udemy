package guru.springframework.sfgpetclinic.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import guru.springframework.sfgpetclinic.ControllerTests;


class IndexControllerTest implements ControllerTests {
	
	IndexController indexController;

	@BeforeEach
	void setUp() throws Exception {
		indexController = new IndexController();
	}

	@Test
	@DisplayName("test return value")
	void testIndex() {
		assertEquals("index", indexController.index());
		assertEquals("index", indexController.index(),"The value not equal");
		
		assertThat(indexController.index()).isEqualTo("index");
	}

	@Test
	@DisplayName("Display expensive message")
	void testOupsHandler() {
		assertTrue("notimplemented".equals(indexController.oupsHandler()),()->"This is some expensive message to build for test");
	}
	
	@Test
	void testGetValue() {
		assertThrows(ValueNotFoundException.class, ()->{
			indexController.getValue(0);
		});
	}
	
	@Disabled
	@Test
	void testTimeout() {
		assertTimeout(Duration.ofMillis(100), ()->{
			Thread.sleep(2000);
			System.out.println("Testing Completed");
		});
	}
	
	
	@Disabled
	@Test
	void testTimeoutPreemp() {
		assertTimeoutPreemptively(Duration.ofMillis(100), ()->{
			Thread.sleep(2000);
			System.out.println("Testing Completed");
		});
	}
	
	@Test
    void testAssumptionTrue() {

        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionTrueAssumptionIsTrue() {

        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }
    
    
    @EnabledOnOs(OS.MAC)
    @Test
    void testonMacOs() {
    	
    }
    
    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testonWindowsOs() {
    	
    }
    
    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testonJre11() {
    	
    }
    
    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testonJre8() {
    	
    }

}
