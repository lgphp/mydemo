package com.data.test;

import java.util.Observable;

public class Obser1 implements java.util.Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�����ʼ��Ĺ۲����Ѿ���ִ��>>>>>>>>>>>."+arg);

	}

	
	
	
	public static void main(String[] args) {
		
		
		Subject s=new Subject();
		
		Observer a=new Observer();
		Obser1 b=new Obser1();
		
		s.addObserver(a);
		s.addObserver(b);
		
		s.setAbc("abc");
		
		
		
		
	}
	
	
}
