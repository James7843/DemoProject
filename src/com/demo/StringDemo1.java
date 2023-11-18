package com.demo;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This     is     the     trial     program";
		
		String[] str1=str.split("\\s+");
		String str3=String.join(" ", str1);
		String str2="";
		System.out.println(str3);
		StringBuilder sb2=new StringBuilder(str3);
		StringBuilder sb1=new StringBuilder(str);
		System.out.println(sb2.reverse().toString());
		System.out.println(sb1.reverse().toString());
		
		for(String s:str1)
		{
			StringBuilder sb=new StringBuilder(s);
			str2+=sb.reverse().toString()+" ";
		}
		System.out.println(str2);

	}

}
