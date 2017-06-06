package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class FirstTest {

	@Test
	@DisplayName("My 1st JUnit 5 test!")
	void myFirstTest(TestInfo testInfo) {
		Greeter greeter = new Greeter();
		assertEquals("Hello world!", greeter.sayHello(), "ERROR!!!");
		assertEquals("My 1st JUnit 5 test!", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
	}

}
