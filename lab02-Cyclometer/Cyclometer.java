// Liam Walsh
// September 3, 2014
//CSE 002-111
//Lab 2 Cyclometer

//Purpose: A cyclometer records the number of rotations of the front wheel of
//         a biycle over time. This program's purpose is to act as a cyclometer
//         where it would print its recorded time and number of rotations. With this 
//         data, the program will be able to determine the distance of one trip, aswell 
//         as two trips combined.

public class Cyclometer{
    
    public static void main (String[] args) {
        
        int secsTrip1=480; // This is the time it took for trip one.
        int secsTrip2=3220; // This is the time it took for trip two.
        int countsTrip1=1561; // This is the number of rotations for trip one.
        int countsTrip2=9037; // This is the number of rotations for trip two.
        
        double wheelDiameter=27.0, // This variable represents the wheel's diamter.
        PI=3.14159, // Constant for pi.
        feetPerMile=5280, // Constant to represent feet per mile.
        inchesPerFoot=12, // Constant to represent inches per foot.
        secondsPerMinute=60; // Constant to represent seconds per minute.
        double distanceTrip1, distanceTrip2, totalDistance; // Variables to determine distances and overall distance.
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)
                             + " minutes and had "+ countsTrip1+" counts."); // Prints time and rotations for trip one.
                             
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)
                             + " minutes and had "+ countsTrip2+" counts."); // Prints time and rotations for trip two.
    
        distanceTrip1 = countsTrip1 * wheelDiameter * PI; //equation for distance of trip 1 in inches.
        
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Equation for distance of trip two.
        totalDistance=distanceTrip1+distanceTrip2;

        System.out.println("Trip 1 was "+distanceTrip1+" miles"); 
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); 
        System.out.println("The total distance was "+totalDistance+" miles");

        

        

    }
}
    
    
    
    
        

