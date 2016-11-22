package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DmitryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("The code marked @BeforeClass runs once before the entire dima fixture.");}
	
/*	The code marked @Before is executed before each dima, while @BeforeClass runs once before the 
 * entire dima fixture. If your dima class has ten dimas, @Before code will be executed ten times, 
 * but @BeforeClass will be executed only once.
 * 
 * In general, you use @BeforeClass when multiple dimas need to share the same computationally expensive setup code.
*/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	       System.out.println("AfterClass method will be executed after last dima method completed");}
	
	@Before
	public void setUp() throws Exception {
	       System.out.println("Before method will execute before every dima method");}

	@After
	public void tearDown() throws Exception {
	       System.out.println("After method will execute after every dima method");}

	@Test // @Ignore
    public void dima_01_AssertEquals_Positive() {
    System.out.println("Dima_01_assertEquals_Positive");}
@Test // @Ignore
    public void dima_02_AssertEquals_Negative() {
    System.out.println("Dima_02_assertEquals_Negative");}
@Test @Ignore
    public void dima_03_AssertEquals_Ignored() {
    System.out.println("Dima_03_assertEquals_Ignored");}
@Test // @Ignore
    public void dima_04_AssertSame_Positive() {
    System.out.println("Dima_04_AssertSame_Positive");}
@Test // @Ignore
    public void dima_05_AssertSame_Negative() {
    System.out.println("Dima_05_AssertSame_Negative");}
@Test @Ignore
    public void dima_06_AssertSame_Ignored() {
    System.out.println("Dima_06_AssertSame_Ignored");}
@Test // @Ignore
    public void dima_07_AssertFalse_Positive() {
    System.out.println("Dima_07_assertFalse_Positive");}
@Test // @Ignore
    public void dima_08_AssertFalse_Negative() {
    System.out.println("Dima_08_assertFalse_Negative");}
@Test // @Ignore
    public void dima_09_AssertTrue_Positive() {
    System.out.println("Dima_09_assertTrue_Positive");}
@Test // @Ignore
    public void dima_10_AssertTrue_Negative() {
    System.out.println("Dima_10_assertTrue_Negative");}


}
