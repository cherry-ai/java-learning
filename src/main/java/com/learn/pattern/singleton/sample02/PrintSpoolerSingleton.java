package com.learn.pattern.singleton.sample02;

public class PrintSpoolerSingleton
{
	private static PrintSpoolerSingleton instance=null;
	
	private PrintSpoolerSingleton()
	{	
	}
	
	public static PrintSpoolerSingleton getInstance() throws PrintSpoolerException
	{
		if(instance==null)
		{
			System.out.println("������ӡ�أ�");
		    instance=new PrintSpoolerSingleton();		
		}
		else
		{
			throw new PrintSpoolerException("��ӡ�����ڹ����У�");
		}
		return instance;
	}
	
	public void manageJobs()
	{
	    System.out.println("�����ӡ����");
	}	
}