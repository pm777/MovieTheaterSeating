# MovieTheaterSeating
An algorithm for assigning seats within a movie theater to fulfill reservation requests.

The movie theater has the seating arrangement of 10 rows x
20 seats.

<b>Input file-</b><br>
1]Input file should be a text file containing all the reservation requests.<br>
2]Each line in the file will be comprised of a reservation identifier, followed by a
space, and then the number of seats requested. The reservation
identifier will have the format: R####.<br>
3]There should not be any empty space between two reservations.<br>
Example.<br>
R001 2<br>
R002 0<br>
R003 4<br>
R004 3<br>
R005 10<br>

<b>Output file-</b><br>
1]The program output a file containing the seating assignments
for each request.<br>
2]Each row in the file includes the reservation.<br>
number followed by a space, and then a comma-delimited list of the
assigned seats.<br>
Example.<br>
R001 A1,A2<br>
R003 A3,A4,A5,A6<br>
R004 A7,A8,A9<br>
R005 A10,A11,A12,A13,A14,A15,A16,A17,A18,A19<br>
Roo6 A20,B1,B2,B3,B4<br>
<br>
While assigning the seats, all seats from a single requests are grouped together.
Seats are assigned sequentially.
<br><br>
<b>How to run the program-</b><br>
Input file path should be provided as a command line argument.<br>
Output file gets created in the same project directory.
