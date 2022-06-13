package day2;

public class TwoWheeler {
	 int noOfWheels= 4;
	   short noOfMirrors = 3;
	   long chasisNumber= 12344332222L;
	   boolean isPunctured = false;
	   String bikeName = "Pulsar";
	   double runningKM = 23000.50;

	public static void main(String[] args) {
		// calling all variables
    TwoWheeler obj = new TwoWheeler();
   int wheels= obj.noOfWheels;
   short mirrors= obj.noOfMirrors;
   long chasis= obj.chasisNumber;
   String bikename = obj.bikeName;
   double runkm = obj.runningKM;
   boolean punctured = obj.isPunctured;
   
   // Printing all variables
    System.out.println(wheels);
    System.out.println(mirrors);
    System.out.println(chasis);
    System.out.println(bikename);
    System.out.println(runkm);
    System.out.println(punctured);
    
   
    
	}

}