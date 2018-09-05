package com.ticketSystem;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MovieTheater {
	
	static int theaterAvailability;
	static int row, col, curRow, curCol;
	
	//Theater dimensions
	static {
		theaterAvailability = 200;
		row = 10;
		col = 20;
		curRow = 0;
		curCol = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath;
		filePath = args[0];
		try {
			PrintWriter writer = new PrintWriter("Output.txt");
            
			FileInputStream fstream = new FileInputStream(filePath);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			// Reading the file line by line
			while ((strLine = br.readLine()) != null) {
				String[] tokens = strLine.split(" ");
				
				if (getSeats(tokens[0], Integer.parseInt(tokens[1]), writer)) {
					continue;
				} else {
					break;
				}

			}
			writer.close();
			in.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static boolean getSeats(String resId, int seats, PrintWriter out) {
		if (theaterAvailability <= 0)
			return false;

		if (seats > 0) {
			out.write(resId + " ");
			while (seats > 0 && theaterAvailability > 0) {
				//To assign neighboring seats
				if (curCol + 1 <= col) {
					curCol += 1;
					out.write((Character.toString((char) ('A' + curRow))) + curCol);
					--theaterAvailability;
					--seats;
					if (seats == 0) {
						out.println("");
						return true;

					} else
						out.write(",");
				} else {
					//To move to next row
					if (curRow + 1 < row) {
						curCol = 1;
						curRow += 1;
						out.write((Character.toString((char) ('A' + curRow))) + curCol);
						--theaterAvailability;
						--seats;
						if (seats == 0)
							return true;
						else
							out.write(",");
					} else
						return false;
				}
			}

		}
		return true;
	}

}
