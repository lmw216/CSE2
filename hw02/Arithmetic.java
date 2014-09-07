//Liam Walsh
//CSE2 - 111
//September 5, 2014
//
//This program's purpose is to find the final cost of different products at 
// Walmart that also includes the %6 sales tax in PA.

public class Arithmetic{
    
    public static void main(String[] args){
        
//Input Variables

        int nSocks = 3; //Number of socks
        double SockCost = 2.58; //Cost per pair of sock
        int nGlasses = 6; //Number of glasses
        double GlassesCost = 2.29; //Cost per glass
        int nEnBox = 1; //Number of boxes of enevelopes
        double EnBoxCost = 3.25; //Cost per box of envelopes
        double TaxPercent = 0.06; //PA sales tax
        
//Declare Variables

        double TotalSockCost, TotalGlassCost, TotalEnBoxCost, TotalBeforeTax, TotalCost;
        
        TotalSockCost = nSocks*SockCost*TaxPercent + nSocks*SockCost; //Total cost for socks
        TotalGlassCost = nGlasses*GlassesCost*TaxPercent + nGlasses*GlassesCost; //Total cost for glasses
        TotalEnBoxCost = nEnBox*EnBoxCost*TaxPercent + nEnBox*EnBoxCost; //Total cost for envelope box
        TotalBeforeTax = nSocks*SockCost + nGlasses*GlassesCost + nEnBox*EnBoxCost; //Total cost before tax
        TotalCost = TotalBeforeTax*TaxPercent + TotalBeforeTax; //Total Cost including the tax
        
     
        
//Display all costs and keep decimals to 2 places using %.2f

        System.out.printf("The total cost of socks is $ %.2f \n", TotalSockCost); //Prints total cost for socks
        System.out.printf("The total cost of glasses is $ %.2f \n ", TotalGlassCost); //Prints total cost for glasses
        System.out.printf("The total cost of the box of envelopes is $ %.2f \n", TotalEnBoxCost);//Prints total cost for envelopes
        System.out.printf("The total cost of purchases before tax is $ %.2f \n", TotalBeforeTax); //Prints total cost before tax
        System.out.printf("The total cost of purchases after tax is $ %.2f \n", TotalCost); //Prints total cost after tax
        
        
         }
    
}
    
   
    
    
    
    