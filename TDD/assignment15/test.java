package assignment15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class test {


		   @Test
		    void test() {
		        Item i=new Item(111, "ankush", 133, 155, LocalDate.of(2020, 11, 23), LocalDate.of(2022, 12, 27));
		        assertEquals(true,i.createObject(i));
		    }
	
}
