package org.beh.gamedev;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UtilTest {
	
	@Before
	public void before(){
		
	}

	@Test
	public void testCsvSpliterStringInt() {
		String[] array;
		String csv;
		csv = "23,0,\"猫村耳子\",\"猫村\",28,14,2,900,2600,45,17,10,20,40,80,5,3,2,0,3,5,3,0,0,0,0,\"拥有丰富的常识,舞跳得特别好.\"";
		array = Util.CsvSpliter(csv, 27);
		for (String s : array){
			System.out.println(s);
		}
		csv = "91,0,\"阿克巴国王\",\"国王\",5,5,6,1500,15000,45,26,30,51,47,52,5,4,0,2,5,5,0,2,0,0,0,\"中东石油大王.喜欢游戏.\"";
		array = Util.CsvSpliter(csv, 27);
		for (String s : array){
			System.out.println(s);
		}
		csv = "94,0,\"Kairo君\",\"Kairo\",32,20,6,9000,65536,45,30,200,200,200,200,5,7,0,3,3,5,2,2,2,5,5,\"感谢你发现我!!\"";
		array = Util.CsvSpliter(csv, 27);
		for (String s : array){
			System.out.println(s);
		}
	}

}
