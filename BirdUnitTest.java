//import statements
public class BirdUnitTest {
		
	@Test
	public void testBirdSing() {
		Bird b = new Bird();
		
		assertThat(b.sing()).isEqualToIgnoringCase("I am singing");
	}


}
