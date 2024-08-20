//import stuff here?

//Your code here
public class Program5 {
    public static void main(String[] args) {
        int royaleMiles = 286;
        int royaleGallons = 9;
        int koopaKingMiles = 412;
        int koopaKingGallons = 40;
        int pipeFrameroyaleMiles = 361;
        int pipeFrameGallons = 18;
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        
        double royaleMPG = Math.round(10*(double)royaleMiles / royaleGallons)/10.0;
        double koopaKingMPG = Math.round(10*(double)koopaKingMiles / koopaKingGallons) / 10.0;
        double pipeFrameMPG = Math.round(10*(double)pipeFrameroyaleMiles / pipeFrameGallons) / 10.0;
        double badwagonMPG = Math.round(10*(double)badwagonMiles / badwagonGallons) / 10.0;
        
        System.out.println("The average miles per gallon of the Royale car is: " + royaleMPG);
        System.out.println("The average miles per gallon of the Koopa King car is: " + koopaKingMPG);
        System.out.println("The average miles per gallon of the Pipe Frame car is: " + pipeFrameMPG);
        System.out.println("The average miles per gallon of the Badwagon car is: " + badwagonMPG);
    }
    
    
}


//Paste console output below:
/*
The average miles per gallon of the Royale car is: 31.8
The average miles per gallon of the Koopa King car is: 10.3
The average miles per gallon of the Pipe Frame car is: 20.1
The average miles per gallon of the Badwagon car is: 14.6


*/
