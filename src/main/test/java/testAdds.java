
public class testAdds {
	@test
	public void testAdd1Plus1() {
		int answer = 1;
		System.out.println("test is running");
		AddsNum add = new AddsNum();
		assertEquals(answer, add.adds(1,1));
	}
}
