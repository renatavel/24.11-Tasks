package PackageAnimals;
interface AnimalBehavior{
    void sleep();
}

public class Dog extends Mammal implements AnimalBehavior,AnimalMove,AnimalName{
 String breed;
 public Dog(){

 };
    public Dog(String name,int age,int weight,String furColor,String breed){
        super(name,age,weight,furColor);
        this.breed=breed;
    };

    public Dog(String name){
        super(name,0,0,null);
    };
    @Override
    public String toString(){
        StringBuilder str=new StringBuilder(super.toString());
        if(breed!=null){
            str.append(" Dog's breed: "+breed).append(".");
        }
        return str.toString();
    };

    @Override
    public void eat(){
        System.out.println("The dog is eating the dog's feed.");
    }
    @Override
    public void getVoice(){
        System.out.println("The dog is barking.");
    };
    @Override
    public void sleep(){
        System.out.println("The dog is sleeping.");
    };
    @Override
    public void move(){
        System.out.println(getClass().getSimpleName()+" is running.");
    }
    public void run(){
        System.out.println("The dog is running around.");
    }

}
