package calculator.app;

import java.util.ArrayList;
import java.util.Scanner;

import calculator.device.AdvanceCalc;
import calculator.device.StandardCalc;

public class App extends BasicMath{
    // Main class that initializes the system
    ArrayList<String> storage = new ArrayList<String>();
    StandardCalc memory = new StandardCalc(storage);
    Scanner input = new Scanner (System.in);
    public static void main(String[] args){
        new App().calculator();

    }
    // calculator method; main method that runs the system collectively
    private void calculator(){

        
        // if users are given 2 options to choose 1; basic math while 2 advance math
        System.out.println("Welcome to my calculator, for basic calculation enter 1, for advanced calculation enter 2 and enter 3 to enter  memory");
        int response_value = input.nextInt();
        if(response_value==1){
            System.out.println("Basic calculator selected: functions permitted are '*', '+', '/', '-'; Please enter the math");
            String solution = ""+input.next();
            //here the basic math abstract class is inherited by App.main 
            BasicMath solver = new App();
            memory.memoryAdd(solution);
            //runBasic method in the initial class in inherited and used here
            String result = solver.runBasic(solution.trim());

            System.out.println("Answer = "+result);
            
        }else if(response_value==2){
            System.out.println("Advanced calculator selected; for square root enter the problem as 'Sn' while for pow enter the problem as n^n");
            String solution = ""+input.next();

            // advanceCalc class is called here and value passed to it's constructor
            AdvanceCalc advanceMath = new AdvanceCalc(solution);
            memory.memoryAdd(solution);
            // result of the advancedCalc method is printed
            System.out.println("Answer ="+advanceMath.solve());

        }else if(response_value==3){
           System.out.println("You are now in the calculator memory... enter 1 to print memory, 2 to delete from memory and 3 to clear memory");
           int memory_response = input.nextInt();
           if(memory_response==1){
               System.out.println("------------Memory Record-------------------");
               memory.memoryRecall();
           }else if(memory_response==2){
            System.out.println("Please state which of the memory index you want to delete");
            int memory_index = input.nextInt();
            memory.memorySubtract(memory_index);
            System.out.println("Calculator record at the selected index has been cleared");

           }else if(memory_response==3){
            memory.memoryCLear();
            System.out.println("Calculator record has been cleared");
           }
        
        }else{
            System.out.println("You are required to enter either 1 or 2 only");
        }
        System.out.println("---------------------------------Do you want to continue? y/n ------------------------------------");
        String recurssion = ""+input.next();
        if(recurssion.contains("y")){
            calculator();
        }else{
            System.out.println("System has been exited");
            System.exit(0);
        }
        

    }
    // runBasic method inherited from the abstract class of basicMath, solution is passed as a string and tokenized to get computation symbol and values surrounding it
    String runBasic(String problem){
        String result = "";
        String [] temp_box = new String[2];
        Double value_1,value_2,tmp_result=0.00;
        try{
            if(problem.contains("+")){
                    temp_box = problem.split("\\+");
                     value_1 = Double.parseDouble(temp_box[0]);
                     value_2 = Double.parseDouble(temp_box[1]);
                    tmp_result =value_1 + value_2;
                    result = tmp_result+"";
            } else if(problem.contains("*")){
                     temp_box = problem.split("\\*");
                     value_1 = Double.parseDouble(temp_box[0]);
                     value_2 = Double.parseDouble(temp_box[1]);
                     tmp_result =value_1 * value_2;
                     result = tmp_result+"";
            }else if(problem.contains("/")){
                     temp_box = problem.split("\\/");
                     value_1 = Double.parseDouble(temp_box[0]);
                     value_2 = Double.parseDouble(temp_box[1]);
                     tmp_result =value_1 / value_2;
                     result = tmp_result+"";
            }else if(problem.contains("-")){
                    temp_box = problem.split("\\-");
                    value_1 = Double.parseDouble(temp_box[0]);
                    value_2 = Double.parseDouble(temp_box[1]);
                    tmp_result =value_1 - value_2;
                    result = tmp_result+"";
       }

        }catch(Exception x){
            //error is caught and reported
            x.printStackTrace();
        }

    return result;
    }
}
