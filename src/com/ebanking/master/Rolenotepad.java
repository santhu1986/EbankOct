package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rolenotepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Lib LB=new Lib();
		
		LB.openApp("http://122.175.8.158/ranford2");
		LB.AdminLgn("Admin","M1ndq");
		
		//To get Test Data File Path
		
		String Fpath="E:\\SeleniumonlineSep\\Ebanking\\src\\com\\ebanking\\testdata\\NotepadRole.txt";
		
		String Rpath="E:\\SeleniumonlineSep\\Ebanking\\src\\com\\ebanking\\results\\NotepadRes.txt";
		String SD;
		//To get Test data File
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		//Write Headerline
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();
		
		//Multiple Iterations -- While loop
		
		while ((SD=BR.readLine())!=null)
		{
			System.out.println(SD);
			
			//Split
			
			String SR[]=SD.split("###");
			
			String Rname=SR[0];
			String Rt=SR[1];
			
			String Res=LB.Role(Rname,Rt);
			
			//Write
			
			BW.write(SD+"$$$$$$"+Res);
			BW.newLine();
		}
		BW.close();
		BR.close();
		
	}

}

