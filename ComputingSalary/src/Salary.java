package ece325_assignment4;

public class Salary {
	
	/**
	 * Returns the amount of pay a band member will get (in dollars). This amount is computed by adding the bonus (if any)
	 * to the base salary and then deducting the amount spent on snacks. So, if a band member earned 100 dollars, spent 50 on snacks,
	 * and earned a bonus of 10 (%), their pay will be 60 dollars. 
	 * 
	 * Note: The current implementation of this method is extremely buggy and can easily be abused by anyone.
	 * 
	 * @param salary The base salary earned by this band member during this salary period (in dollars).
	 * @param snacksAmount The total amount spent by this band member on snacks during this salary period (in dollars).
	 * @param bonus The bonus percentage that the band member earned this salary period (in percentage).   
	 * @return the amount of pay a band member will get (in dollars)
	 */
	public static Double pay(Double salary, Double snacksAmount, Integer bonus) {
		// check for invalid salary and bonus values
		if (salary < 0 || salary > 1000) {
			throw new IllegalArgumentException("Salary is not between 0 and 1000");
		}
		if (bonus < 0 || bonus > 10) {
			throw new IllegalArgumentException("Bonus is not between 0 and 10");
		}
		// represent the bonus as a percentage
		float percent = (float) bonus/100;
		
		// check for invalid snacksAmount
		if (snacksAmount > salary*(1+percent) || snacksAmount < 0) {
			throw new IllegalArgumentException("snacksAmount is invalid");
		}
		// compute the pay
		return (salary*(1+percent)-snacksAmount);
	}
}

