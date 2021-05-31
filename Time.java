package testLab.java;
import java.util.*;

interface Sec
{
	public abstract void dispTime_InSec();
}

interface Hrs
{
	public abstract void dispTime_InHrs();
}

public class Time implements Sec,Hrs
{
	static float sec;
	static float min;
	static float hrs;
	static Scanner sc =new Scanner(System.in);
	public void Accept_Min()
	{
		System.out.println("Enter Minutes :");
		min = sc.nextFloat();
		
	}
	@Override
	public void dispTime_InHrs() {
		hrs =  min / 60;
		System.out.println("Hours : "+hrs);
		
	}
	@Override
	public void dispTime_InSec() {
		sec = min * 60;	
		System.out.println("Seconds : "+sec);
	}
	
	public static void main(String[] args) 
	{
		Time t1 = new Time();
		t1.Accept_Min();
		t1.dispTime_InSec();
		t1.dispTime_InHrs();
	}}
