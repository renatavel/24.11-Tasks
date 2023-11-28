package PackageAnimals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Blowfish extends Fish implements AnimalBehavior,AnimalMove,AnimalName{
    String fishSize;
    public Blowfish(){

    };
    public Blowfish(String name,int age,int weight,String scalesColor,String fishSize){
        super(name,age,weight,scalesColor);
        this.fishSize=fishSize;
    };
    public Blowfish(String scalesColor){
        super(null,0,0,scalesColor);
    };
    @Override
    public String toString(){
        StringBuilder str=new StringBuilder(super.toString());
        if(fishSize!=null){
            str.append(" Fish size: "+fishSize).append(".");
        }
        return str.toString();
    };
    @Override
    public void eat(){
        System.out.println("The blowfish is eating the seaweed.");
    }
    @Override
    public void getVoice(){
        System.out.println("The blowfish is giving off no sounds.");
    };
    @Override
    public void sleep(){
        System.out.println("The blowfish is sleeping.");
    };

    @Override
    public void swim(){
        System.out.println("The blowfish is swimming.");
    };

    @Override
    public void move(){
        System.out.println(getClass().getSimpleName()+" is swimmimg.");
    }

    public void ask(){
        System.out.println("The blowfish is begging for the food");
    };



}
