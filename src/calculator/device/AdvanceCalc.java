package calculator.device;

public class AdvanceCalc implements advanceMath {
	//advanceCalc class implements the interface advanceMath
	String problem="";
	double square_root_value=0;
	double base_number= 0;
	double exponet_number=0;
	String answer="";
	// constructor that receives the problem
	public AdvanceCalc(String problem){
		this.problem = problem;
	}
	 // squareRoot method inherited from advanceMath interface
	public String squareRoot(){
		String result ="";
		result = ""+Math.sqrt(square_root_value);        
		return result;
	}
	  // powerOf method inherited from advanceMath interface
	public String powerOf(){
		String result ="";
		result = ""+Math.pow(base_number, exponet_number);
		return result;
	}
	 // solve method houses the logical solution to know what kind of solution is required of the advanced class
	public String solve(){
		try{

			if(this.problem.contains("S")){
				String soln = this.problem.replace("S", "").trim();
				this.square_root_value = Double.parseDouble(soln);
				answer =squareRoot();


			}else if(this.problem.contains("^")){
				String temp_box[] = this.problem.split("\\^");
				this.base_number = Double.parseDouble(temp_box[0]);
				this.exponet_number = Double.parseDouble(temp_box[1]);
				answer = powerOf();



			}else{
				answer ="Please enter the math correctly";
			}
		}catch(Exception x){
			System.out.println("Please enter the math properly");
		}
		return answer;
	}

}