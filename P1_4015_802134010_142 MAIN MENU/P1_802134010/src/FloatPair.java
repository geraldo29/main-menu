import java.util.Scanner;

/**
 * A simple class to get a pair of solutions to the quadratic equation.
 * 
 */

public class FloatPair {
	
	private  Float first;
	private  Float second;
	


/**
 * Get the pair of solutions. 
 * @param the solutions by adding and subtraction the discriminant
 * 
 * 
 */

	public FloatPair(double totalPos, double totalNeg) {
		this.first= (float) totalPos;
		this.second =(float) totalNeg;
	// TODO Auto-generated constructor stub
}


	/**
	 * Get the first solution. 
	 * @return first Solution
	 * 
	 */
	public Float getFirst() {
		return first;
	}
	
	/**
	 * Set the first solution. 
	 * 
	 */

	public void setFirst(Float first) {
		this.first = first;
	}

	/**
	 * Get the second solution. 
	 * @return second Solution
	 * 
	 */
	
	public Float getSecond() {
		return second;
	}

	/**
	 * Set the first solution. 
	 * 
	 */

	
	public void setSecond(Float second) {
		this.second = second;
	}

	/**
	 * Scan 
	 * 
	 */
	
	
	/**
	 * Set the object reference variables to string 
	 * @return the data located in the object reference variables.
	 */
	
	public String toString(){
		return "("+this.first+","+this.second+")";
	}


}


