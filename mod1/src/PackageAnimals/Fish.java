package PackageAnimals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fish extends Animal implements AnimalMove,AnimalName{
    String scalesColor;
    public Fish(){

    };
    public Fish(String name,int age,int weight,String scalesColor){
        super(name,age,weight);
        this.scalesColor=scalesColor;
    };
    @Override
    public String toString(){
        StringBuilder str=new StringBuilder(super.toString());
        if(scalesColor!=null){
            str.append(" Scales color: "+scalesColor).append(".");
        }
        return str.toString();
    };
    @Override
    public void eat(){
        System.out.println("The fish is eating the seaweed.");
    }
    @Override
    public void getVoice(){
        System.out.println("The fish is giving off no sounds.");
    };

    public void swim(){
        System.out.println("The fish is swimming.");
    };

}
