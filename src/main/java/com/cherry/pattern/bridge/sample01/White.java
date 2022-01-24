package com.cherry.pattern.bridge.sample01;

public class White implements Color
{
	public void bepaint(String penType,String name)
	{
		System.out.println(penType + "��ɫ��"+ name + ".");
	}
}