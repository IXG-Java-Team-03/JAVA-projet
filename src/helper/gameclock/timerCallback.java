package helper.gameclock;

public interface timerCallback {
	
	/**
	 * This callback method is called whenever a time unit equal to "interval" seconds elapses
	 * @param currentValue The current value of the timer
	 * @param timeoutValue The end value of the timer
	 * @param timerNumber The timer that this event refers to
	 */
	public void clockTick( int currentValue, int timeoutValue, int timerNumber);
	
	/**
	 * This callback method is called at the expiration of the timer
	 * @param currentValue The current value of the timer
	 * @param timeoutValue The end value of the timer
	 * @param timerNumber The timer that this event refers to
	 */
	public void clockExpired( int currentValue, int timeoutValue, int timerNumber);
	
	/**
	 * This callback method is called when the timer is stopped before its normal duration
	 * @param currentValue The current value of the timer
	 * @param timeoutValue The end value of the timer
	 * @param timerNumber The timer that this event refers to
	 */
	public void clockStopped( int currentValue, int timeoutValue, int timerNumber);
	
	/**
	 * This callback method is called when the timer is paused
	 * @param currentValue The current value of the timer
	 * @param timeoutValue The end value of the timer
	 * @param timerNumber The timer that this event refers to
	 */
	public void clockPaused( int currentValue, int timeoutValue, int timerNumber);
	
	/**
	 * This callback method is called when the timer is restarted after it was previously paused
	 * @param currentValue The current value of the timer
	 * @param timeoutValue The end value of the timer
	 * @param timerNumber The timer that this event refers to
	 */
	public void clockRestarted( int currentValue, int timeoutValue, int timerNumber);
}
