package Assignment5;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HolidayBonusSTUDENTTest {
	private double[][] dataSet1 = {{1253.65, 4.50, 2154.36, 7532.45, 3388.44},		
								   {2876.22, -3.24, 1954.66},
								   {4896.23, 2.29, 5499.29},
								   {2256.76, 3.76, 4286.29, 5438.48, 3794.43},
								   {3184.38, 3654.65, 3455.76, 6387.23, 4265.77, 4592.45},
								   {2657.46, 3265.34, 2256.38, 8935.26, 5287.34, 6598.23}}; 
	
	private double[][] dataSet2 = {{12536.54, 45665.05, 21543.66, 75324.57, 33884.48, 65982.39},
								   {28762.21, 35762.42, 19546.63},
								   {48962.34, 28552.95, 23863.66, 54992.97},
								   {22567.63, 36327.64, 42862.95, 54383.86, 37944.37},
								   {31843.86, 36546.57, 34557.68, 63872.39, 42657.70, 45924.51},
								   {26574.65, 32653.46, 22563.87, 89352.68, 52873.49}}; 
	
	private double[][] dataSet3 = {{2,3,4},{5,6},{7,8,9}};
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		/**
		 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */

		@Test
		public void testCalculateHolidayBonusSTUDENTA() {
			try{
				double[] result = HolidayBonus.calculateHolidayBonus(dataSet1,5000,1000,2000);
				assertEquals(8000.0,result[0],.001);
				assertEquals(3000.0,result[1],.001);
				assertEquals(12000.0,result[2],.001);
				assertEquals(9000.0, result[3], .001);
				assertEquals(14000.0, result[4], .001);
				assertEquals(21000.0, result[5], .001);
				 
				result = HolidayBonus.calculateHolidayBonus(dataSet2,5000,1000,2000);
				assertEquals(16000.0,result[0],.001);
				assertEquals(5000.0,result[1],.001);
				assertEquals(10000.0,result[2],.001);
				assertEquals(12000.0,result[3],.001);
				assertEquals(11000.0,result[4],.001);
				assertEquals(16000, result[5],.001);
				}
				catch (Exception e) {
					fail("This should not have caused an Exception");
				} 
			
				
		}
		

		/**
		 * Test calculateHolidayBonus method with a high of 1000, low of 250 and 500 as other
		 */

		@Test
		public void testCalculateHolidayBonusSTUDENTB() {
			try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet3, 1000, 250, 500); 
			assertEquals(750.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(3000.0,result[2],.001);
			}
			catch(Exception e) {
				fail("This should not have caused an Exception");
			}
		}

		/**
		 * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(67000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet1, 5000, 1000, 2000),.001);
		assertEquals(70000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet2, 5000, 1000, 2000),.001);
	}
	
	/** 
	 * Test calculateTotalHolidayBonus method with a high of 1000, low of 250 and 500 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {   
		assertEquals(4750.0,HolidayBonus.calculateTotalHolidayBonus(dataSet3, 1000, 250, 500),.001);
		
	}

}
