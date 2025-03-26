import java.util.Scanner;

public class WindChillTemperature
{
	//User Defined Method to Calculate Wind Chill
	public double calculateWindChill(double temperature,double windSpeed)
	{
		return (35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16));
	}
	
	//Main() Method
	public static void main(String[] args)
	{
		//Creating Objects
		Scanner input=new Scanner(System.in);
		WindChillTemperature wchill=new WindChillTemperature();
		
		//USER INPUT:
		System.out.print("Enter Temperature: ");
		double temp=input.nextDouble();
		
		System.out.print("Enter Wind Speed: ");
		double wspeed=input.nextDouble();
		
		double windchill=wchill.calculateWindChill(temp,wspeed);
		
		//PRINTING:
		System.out.println("\n\nPRINTING DETAILS: ");
		System.out.println("Given temperature: "+temp+" degree celsius");
		System.out.println("Given WindSpeed: "+wspeed+" m/s.");
		System.out.printf("Calculated Wind Chill: %.3f degree celsius",windchill);
		
		input.close();
	}
}