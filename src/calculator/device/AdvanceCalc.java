public class advanceCalc implements advanceMath {
    String problem="";
    double square_root_value=0;
    double base_number= 0;
    double exponet_number=0;
    String answer="";
    advanceCalc(String problem){
        this.problem = problem;
    }

    public String squareRoot(){
        String result ="";
        result = ""+Math.sqrt(square_root_value);        
        return result;
    }
    public String powerOf(){
        String result ="";
        result = ""+Math.pow(base_number, exponet_number);
        return result;
    }
    
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