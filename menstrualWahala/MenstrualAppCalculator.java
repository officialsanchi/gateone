public class MenstrualAppCalculator{
	public static int check(int first_day_of_period , int cycle_length){


	int nextperiod = first_day_of_period + cycle_length;

	int ovulation = 14 - nextperiod;
	
	int freeperiod = ovulation + 14 - 1 ;
	 int [] result = {nextperiod ,  ovulation, freeperiod};


	return nextperiod;
	
	}
	public static int dayofovulation(int first_day_of_period, int cycle_length) { 

	int nextperiod = first_day_of_period + cycle_length;

	int ovulation = 14 - nextperiod;

	
	return ovulation;
	}
	public static int dayoffreeperiod(int first_day_of_period, int cycle_length){


	int nextperiod = first_day_of_period + cycle_length;

	int ovulation = 14 - nextperiod;
	
	int freeperiod = ovulation + 14 - 1 ;


	return freeperiod;

	}
}