import java.util.Map;
import java.util.Random;


public class ScheduleTest {


	
	public static void main(String args[])
	{
		PreferredNeighborManager p = new PreferredNeighborManager(5);
		new Thread(p).start();
	}
}
