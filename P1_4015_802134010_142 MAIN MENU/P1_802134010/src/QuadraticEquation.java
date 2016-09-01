
/**
 * A quadratic equation calculator that gives you the solutions, if any
 * 
 */

	public class QuadraticEquation {

		private float a; 
		private  float b;
		private float c;
		
		/**
		 * Constructor that creates a new cuadratic equation
		 * @param your a , b, c in the quadratic equation. 
		 * 
		 */

	public QuadraticEquation(float a, float b, float c)
	{
		this.a = a;
		this.b = b;
		this.c= c; 
		
	}

	/**
	 * Gives you the value of a.
	 * @return the a value
	 */

	public  float getA() {
		return a;
	}
	 
	/**
	 * Gives you the value of b.
	 * @return the b value
	 */
	
	public float getB() {
		return b;
	}

	/**
	 * Gives you the value of c.
	 * @return the c value
	 */
	
	public  float getC() {
		return c;
	}

	
	/**
	 * Counts how many real solutions there are in the equation.
	 * @return the number of real solutions
	 * 
	 */
	
	public int realSolutionsCount() {
		float discriminant, denominator; 
		int counter = 0;
		discriminant = (float) (Math.pow(b, 2)-(4*a*c));
		denominator = 2*a;
		if (discriminant < 0 || denominator ==0 ){
			counter = 0; 
		return counter;
		}
		else 
		if (discriminant == 0){
				counter = 1;
		return counter;
			}
			else 
				if  (discriminant > 0)
					{
					counter =2; 
					return counter; }
		return counter = 2;
		}
					
		/*
		 * Solves the quadratic equation. 
		 * @return reference to a new object (a pair of Float objects) if the equation has at least one real
                solution. If no real solution, it then returns
                null value. In the case of only one real solution, 
                both components of that pair reference the same
                Float object whose value is that real solutions. 
                If it has two real solutions, the components
                of that pair object are references to both, 
                respectively.
		 */

	public FloatPair getRealSolutions() {
		
		double totalPos,totalNeg, square,answerPos,answerNeg,discriminant; 
		discriminant = Math.pow (b, 2)-(4*a*c); 
		float denominator = 2*a;
			if (discriminant <0 || denominator == 0){
			System.out.println("No Real Solutions");
			return null;
		}
		else 
			
			if (discriminant == 0)
			{
				System.out.println("One real solution");
				square = Math.sqrt (discriminant);
				answerPos = -b + square; 
				totalPos = answerPos / (2*a);
				
				return new FloatPair(totalPos,totalPos) ;
			}
			else 
			{
				
				System.out.println("Two real solutions");
				square = Math.sqrt (discriminant);
				answerNeg = -b - square; 
				answerPos = -b + square; 
				totalPos = answerPos / (2*a);	
				totalNeg = answerNeg / (2*a);
				return new FloatPair(totalPos,totalNeg); 
				}
	}

	}
	
	
	
	
	
	
	
	
