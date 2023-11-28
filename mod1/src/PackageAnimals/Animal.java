package PackageAnimals;
public abstract class Animal{
    String name;
    int age,weight;
    Animal(){

    };
    Animal(String name,int age,int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    };
    public String getName(){
        return this.name;
    }

    public abstract void eat();
    public abstract void getVoice();

    @Override
    public String toString(){
        StringBuilder str=new StringBuilder();
        if(name!=null){
            str.append("Name: "+name).append(".");
        }
        if(age!=0){
            str.append(" Age: "+age).append(".");
        }
        if(weight!=0){
            str.append(" Weight: "+weight).append(".");
        }
        return str.toString();

    }
}
