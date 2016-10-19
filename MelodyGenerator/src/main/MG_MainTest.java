package main;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class MG_MainTest {

	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
        	{"10", "120"},
        	{"6", "90"},
        	{"D", "120"},
        	{"7", "fast"},
        	{"C", "slow"},
        });	
	}

	@Parameter
	public String numOfNotes;
	@Parameter(value=1)
	public String tempo;
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void test() {
		//Pattern pattern = new Pattern();
		Player player = new Player();
		
		StringBuilder sb = new StringBuilder();
		sb.append(numOfNotes);
		sb.append(" ");
		sb.append(tempo);
		System.out.println(sb.toString());

		
		player.play(numOfNotes, tempo);
	
		//assertEquals("",pExpect,calc.calculate(sb.toString()));
		//System.out.println(calc.calculate(sb.toString()));
		
		//fail("Not yet implemented");
	}

}
