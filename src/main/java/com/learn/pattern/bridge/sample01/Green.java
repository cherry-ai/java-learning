package com.learn.pattern.bridge.sample01;

public class Green implements Color
{
	public void bepaint(String penType,String name)
	{
		System.out.println(penType + "��ɫ��"+ name + ".");
	}
}