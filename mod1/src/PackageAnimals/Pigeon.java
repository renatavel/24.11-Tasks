package PackageAnimals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pigeon extends Bird implements AnimalBehavior,AnimalMove,AnimalName{
    String species;
    public Pigeon(){

    };
    public Pigeon(String name,int age,int weight,String featherColor,String species){
        super(name,age,weight,featherColor);
        this.species=species;
    };

    public Pigeon(int weight,String species){
        super(null,0,weight,null);
        this.species=species;
    };
    @Override
    public String toString(){
        StringBuilder str=new StringBuilder(super.toString());
        if(species!=null){
            str.append(" Species kind: "+species).append(".");
        }
        return str.toString();
    };
    @Override
    public void eat(){
        System.out.println("The pigeon is eating the fish.");
    }
    @Override
    public void getVoice(){
        System.out.println("The pigeon is giving off no sounds.");
    };
    @Override
    public void sleep(){
        System.out.println("The dog is sleeping.");
    };

    @Override
    public void move(){
        System.out.println(getClass().getSimpleName()+" is swimming in the sea.");
    }
    @Override
    public void fly(){
        System.out.println("The pigeon is flying.");
    };

    public void swim(){
        System.out.println("The pigeon is swimming.");
    };

}
