
public class Timer {

	// Minutes of the timer
	private int minutes;
	// Seconds of the timer
	private int seconds;
	
	// Thread
	static Thread t = new Thread();

	/*
	 * Constructor
	 * 
	 * Can set exact minutes and seconds
	 * 
	 */
	public Timer(int minutes, int seconds)
	{
		this.minutes = minutes;
		this.seconds = seconds;

		// Converts it all into seconds
		int tempSeconds = this.minutes * 60;
		this.seconds = this.seconds + tempSeconds;
	}

	/*
	 * Beings the timer
	 */
	public void startTimer() throws InterruptedException 
	{
		int tempMinute = 0;
		int tempSeconds = 0;

		for (int i = this.seconds; i > 0; i--)
		{
			Thread.sleep(1);
			this.seconds--;

			// This section just prints out the timer
			tempMinute = seconds / 60;
			tempSeconds = seconds % 60;

			if (tempSeconds / 10 == 0)
			{
				System.out.println(tempMinute + ":0" + tempSeconds);
			}
			else
			{
				System.out.println(tempMinute + ":" + tempSeconds);
			}
			// End of printing out timer
		}
	}

	/*
	 * Gets the seconds in the Timer
	 */
	public int getSeconds()
	{
		return seconds;
	}
	
	// Tester
	public static void main (String args[]) throws InterruptedException
	{
		Timer t = new Timer(5, 0);
		t.startTimer();
	}

}
