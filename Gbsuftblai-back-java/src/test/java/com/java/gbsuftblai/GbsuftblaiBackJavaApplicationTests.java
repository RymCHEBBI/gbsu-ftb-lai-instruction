package com.java.gbsuftblai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.gbsuftblai.services.GbsuFtbLaiService;

@SpringBootTest
class GbsuftblaiBackJavaApplicationTests {

	//Tests about devision only
	
	@Test
	void should_return_SameNbr_When_Integer_DoesNotContain_3_5_7_AndNotDevidedBy_3_5() {	
		assertEquals("1", GbsuFtbLaiService.convertNumber(1)," No Divisible by 3 or 5 => should remain the same");
	}

	@Test
	void should_return_Bbsu_When_Integer_DevidedBy_3_Not_5_And_DoesNotContain_3_5_7() {	
		assertEquals("Gbsu", GbsuFtbLaiService.convertNumber(6)," Only divisible by 3 verified => Gbsu");
	}
	
	@Test
	void should_return_Bbsu_When_Integer_DevidedBy_5_Not_3_And_DoesNotContain_3_5_7() {
		assertEquals("Ftb", GbsuFtbLaiService.convertNumber(10)," Only Divisible by 5  verified => Ftb");
	}

	@Test
	void should_return_Bbsu_When_Integer_DevidedBy_5_3_AndDoesNotContain_3_5_7() {
		assertEquals("GbsuFtb", GbsuFtbLaiService.convertNumber(60)," Only Divisible by 5 & 3 verified => GbsuFtb");
	}
	
	
	//Tests about appearance only
	

	@Test
	void should_return_Gbsu_When_Integer_Contains_one3_No5_No7__AndNotDevidedBy_3_5() {	
		assertEquals("Gbsu", GbsuFtbLaiService.convertNumber(31)," Only contains 3 verified => Gbsu (in order of appearance) ");
	}
	
	@Test
	void should_return_Ftb_When_Integer_Contains_one5_No3_No7__AndNotDevidedBy_3_5() {
		assertEquals("Ftb", GbsuFtbLaiService.convertNumber(52)," Only contains 5  verified => Ftb (in order of appearance) ");
	}

	@Test
	void should_return_Lai_When_Integer_Contains_one7_No3_No7__AndNotDevidedBy_3_5() {
		assertEquals("Lai", GbsuFtbLaiService.convertNumber(17)," Only contains 7 verified => Lai (in order of appearance) ");
	}
	
	
	@Test
	void should_return_InOrderOfAppearence_Gbsu_And_Ftb_When_Integer_Contains_3_5_No7_AndNotDevidedBy_3_5() {	
		assertEquals("FtbGbsu", GbsuFtbLaiService.convertNumber(53)," Contains 3 & 5 => FtbGbsu (in order of appearance) ");
	}
	
	@Test
	void should_return_InOrderOfAppearence_Gbsu_And_Lai_When_Integer_Contains_3_7_No5_AndNotDevidedBy_3_5() {	
		assertEquals("LaiGbsu", GbsuFtbLaiService.convertNumber(73)," Contains 3 & 7 verified => LaiGbsu (in order of appearance) ");
	}
	
	@Test
	void should_return_InOrderOfAppearence_Ftb_And_Lai_When_Integer_Contains5_7_No3_AndNotDevidedBy_3_5() {	
		assertEquals("LaiFtb", GbsuFtbLaiService.convertNumber(751)," Contains 5 & 7 => LaiFtb (in order of appearance) ");
	}
	
	@Test
	void should_return_InOrderOfAppearence_Ftb_And_Gbsu_And_Lai_When_Integer_Contains_3_5_7_AndNotDevidedBy_3_5() {	
		assertEquals("GbsuLaiFtbFtb", GbsuFtbLaiService.convertNumber(371551)," Contains 3 & 5 & 7 verified => GbsuLaiFtbFtb (in order of appearance) ");
	}
	

	//Tests about both division and appearance
	

	@Test
	void should_return_GbsuG_OnceForDivision_AndAsManyAs_3_Appears_When_Integer_ContainsAndDevidedBy3() {	
		assertEquals("GbsuGbsuGbsu", GbsuFtbLaiService.convertNumber(33)," Divisible by 3 & contains 3=> GbsuGbsuGbsu");
	}
	
	@Test
	void should_return_GbsuG_OnceForDivision_AndAsManyAs_5_Appears_When_Integer_ContainsAndDevidedBy5() {	
		assertEquals("FtbFtbFtb", GbsuFtbLaiService.convertNumber(55)," Divisible by 5 & contains 5=> FtbFtbFtb");
	}
	
	@Test
	void should_return_accordingToDevisionBy_3_5_Then_OrderOfAppearence_Ftb_Or_Gbsu_When_Integer_Contains_3_5__AndDevidedBy_3_5() {	
		assertEquals("GbsuFtbGbsuFtb", GbsuFtbLaiService.convertNumber(315)," Divisible by 3 & 5 and contains 3 then 5 each once => GbsuFtbGbsuFtb");
	}
	
	@Test
	void should_return_accordingToDevisionBy_3_5_Then_OrderOfAppearence_Ftb_Or_Gbsu_Or_Lai_When_Integer_Contains_3_5_7_AndDevidedBy_3_5() {	
		assertEquals("GbsuFtbLaiGbsuGbsuFtb", GbsuFtbLaiService.convertNumber(7335)," Divisible by 3 & 5 and contains 7, 3, 3 then 5 each once => GbsuFtbLaiGbsuGbsuFtb");
	}
}
