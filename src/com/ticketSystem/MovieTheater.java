package com.ticketSystem;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MovieTheater {
	 
	 final int theaterCapacity=200;
	 static int theaterAvailability;
	 static int row,col,curRow,curCol;
	
	
	
	 
  static {
	 // theaterSeats=new int[10][20];
	  
	  theaterAvailability=200;
	  row=10;
	  col=20;
	  curRow=0;
	  curCol=0;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath;
		filePath=args[0];
		try {
			PrintWriter writer = new PrintWriter("Output.txt");
		
		System.out.println(filePath);
		
		    FileInputStream fstream = new FileInputStream(filePath);
		          DataInputStream in = new DataInputStream(fstream);
		          BufferedReader br = new BufferedReader(new InputStreamReader(in));
		          String strLine;
		          
		          while ((strLine = br.readLine()) != null)   {
		   String[] tokens = strLine.split(" ");
		   
		   //Record record = new Record(tokens[0],tokens[1],tokens[2]);//process record , etc
		  // writer.println(Character.toString((char)('A'+1)));
		   for(int i=0;i<tokens.length;i=i+2) {
			   System.out.println(tokens[i]+"======"+tokens[i+1]);
			   if(getSeats(tokens[i], Integer.parseInt(tokens[i+1]), writer)) {
				   continue;
			   }
			   else {
				   break;
			   }
			   
			   
		   }
		   
		   }
		   writer.close();
		   in.close();
		   }catch (Exception e){
		     System.err.println("Error: " + e.getMessage());
		   }						
	}
	
	public static boolean getSeats(String resId,int seats,PrintWriter out) {
		if(theaterAvailability<=0)
			return false;
		out.println("");
		out.write(resId+" ");
		while(seats>0 && theaterAvailability>0) {
			if(curCol+1<=col) {
				curCol+=1;
				out.write((Character.toString((char)('A'+curRow)))+curCol);
				--theaterAvailability;
				--seats;
				if(seats==0)
					return true;
				else
					out.write(",");
			}else {
				if(curRow+1<row) {
					curCol=1;
					curRow+=1;
					out.write((Character.toString((char)('A'+curRow)))+curCol);
					--theaterAvailability;
					--seats;
					if(seats==0)
						return true;
					else
						out.write(",");
				}else {
					return false;
				}
			}
		}
		
		return true;
	}

}
