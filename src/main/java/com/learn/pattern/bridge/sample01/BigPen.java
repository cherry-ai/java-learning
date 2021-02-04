package com.learn.pattern.bridge.sample01;

public class BigPen extends Pen
{
	public void draw(String name)
	{
		String penType="���ë�ʻ���";
		this.color.bepaint(penType,name);			
	}	
}