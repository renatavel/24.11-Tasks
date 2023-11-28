package PackageAnimals;
interface AnimalMove{
    default void move(){
        System.out.println(getClass()+"The animal is moving.");
    };
}

public class Mammal extends Animal implements AnimalMove,AnimalName{
   String furColor;
    public Mammal(){

    };
    public Mammal(String name,int age,int weight,String furColor){
        super(name,age,weight);
        this.furColor=furColor;
    };
    @Override
    public String toString(){
        StringBuilder str=new StringBuilder(super.toString());
        if(furColor!=null){
            str.append(" Fur color: "+furColor).append(".");
        }
        return str.toString();
    };

    @Override
    public void eat(){
        System.out.println("The mammal is eating the food.");
    }
    @Override
    public void getVoice(){
        System.out.println("The mammal is giving off some sounds.");
    };
//     public void sleep(){
//         System.out.println("The mammal is sleeping.");
//     };


}
