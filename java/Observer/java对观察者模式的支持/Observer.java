package com.data.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Observer implements java.util.Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�����ʼ��Ĺ۲����Ѿ���ִ��" + arg);

	}

	public Observer() {

	}

	public static void main(String[] args) {

		Subject s = new Subject();

		Observer a = new Observer();
		Obser1 b = new Obser1();

		s.addObserver(a);
		s.addObserver(b);
		s.setAbc("abc");

		String sss = "����:80&С��:85&С��:60&����:61";

		String[] abc = sss.split("&");

		Map<String, Integer> m = new HashMap<String, Integer>();

		for (int i = 0; i < abc.length; i++) {

			m.put(abc[i].split(":")[0], Integer.parseInt(abc[i].split(":")[1]));
		}

		for (String aaa : m.keySet()) {
				
			System.out.println(aaa + "    " + m.get(aaa));
			
		}
	}
}








