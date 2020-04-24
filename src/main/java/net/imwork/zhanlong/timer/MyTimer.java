package net.imwork.zhanlong.timer;

import java.util.Timer;

/**
 * 任务调度
 */
public class MyTimer
{
	public static void main(String[] args)
	{
		Timer timer = new Timer(true);
		
		timer.schedule(new MyTimerTask(), 0, 5000); // 每5秒钟调度一次
		
		try
		{
			Thread.sleep(12000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		timer.cancel();
		
		try
		{
			Thread.sleep(400000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
