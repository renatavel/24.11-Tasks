package PackageAnimals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bird extends Animal implements AnimalMove,AnimalName{
    String featherColor;
    public Bird(){

    };
    public Bird(String name,int age,int weight,String featherColor){
        super(name,age,weight);
        this.featherColor=featherColor;
    };
    @Override
    public String toString(){
        StringBuilder str=new StringBuilder(super.toString());
        if(featherColor!=null){
            str.append(" Feather color: "+featherColor).append(".");
        }
        return str.toString();
    };
    @Override
    public void eat(){
        System.out.println("The bird is eating the seeds.");
    }
    @Override
    public void getVoice(){
        System.out.println("The bird is giving off the coo coo sound.");
    };

    public void fly(){
        System.out.println("The bird is flying.");
    };

}
