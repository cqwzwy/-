package com.cnik;

import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Main {
	
	
	
	
	static {
		
		out.println("����������Ҫ�����Ĺؼ��ʣ�");
		
		out.println();
		
		Scanner scan=new Scanner(in);
		
		String value=scan.nextLine();
		
		String url="http://kns.cnki.net/kns/brief/brief.aspx?";
		
		Params param=new Params();
		
		param.setUrl(url);
		
		param.setK_V(value);
		
		url=param.getUrl();
		
		stratRun.startRun(url);
		
		
		
		
		
	}
	public static void main(String[]args) {
		
	}
	
	
}
