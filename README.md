# MovieTheaterSeating
An algorithm for assigning seats within a movie theater to fulfill reservation requests.

The movie theater has the seating arrangement of 10 rows x
20 seats.

Input file-<br>
1]Input file should be a text file containing all the reservation requests.<br>
2]Each line in the file will be comprised of a reservation identifier, followed by a
space, and then the number of seats requested. The reservation
identifier will have the format: R####.<br>
3]There should not be any empty space between two reservations.
Example.
R001 2
R002 0
R003 4
R004 3
R005 10

Output file-
1]The program output a file containing the seating assignments
for each request.
2]Each row in the file includes the reservation
number followed by a space, and then a comma-delimited list of the
assigned seats.
Example.
R001 A1,A2
R003 A3,A4,A5,A6
R004 A7,A8,A9
R005 A10,A11,A12,A13,A14,A15,A16,A17,A18,A19
Roo6 A20,B1,B2,B3,B4

While assigning the seats, all seats from a single requests are grouped together.
Seats are assigned sequentially.

How to run the program-
Input file path should be provided as a command line argument.
Output file gets created in the same project directory.
