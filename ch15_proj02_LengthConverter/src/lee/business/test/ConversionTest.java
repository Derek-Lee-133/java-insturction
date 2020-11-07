package lee.business.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lee.business.Conversion;

class ConversionTest {

	@Test
	void testMilesToFeet() {
		Conversion conversion = new Conversion("miles", 1.0,"Feet", 5280.0);
		
		assertEquals(5280,conversion.getToValue());
		;
	}

}
