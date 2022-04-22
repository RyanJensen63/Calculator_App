package calculator.device;

import java.util.ArrayList;

public class StandardCalc {
    ArrayList<String> memory = new ArrayList<String>();

    public StandardCalc(ArrayList<String> memory){
        this.memory = memory;
    }
    public void memoryCLear(){
        this.memory.clear();
    }
    public void memoryAdd(String problem){
        this.memory.add(problem);
    }
    public void memorySubtract(int x){
        this.memory.remove(x);
    }
    public void memoryRecall(){
        if(this.memory.size() > 0){
        for(int x =0; x< this.memory.size(); x++){
            System.out.println(this.memory.get(x));
        }
    }else{
        System.out.println("Memory is empty...");
    }

    }

    
}