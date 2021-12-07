package com.cherry.pattern.builder;

public class Client
{
	public static void main(String args[])
	{
		//��̬ȷ���ײ�����
	    MealBuilder mb=(MealBuilder)XMLUtil.getBean();
		//����Ա��ָ����
		KFCWaiter waiter=new KFCWaiter();
	    //����Ա׼���ײ�
	    waiter.setMealBuilder(mb);
	    //�ͻ�����ײ�
	    Meal meal=waiter.construct();
        
        System.out.println("00000");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
	}
}
