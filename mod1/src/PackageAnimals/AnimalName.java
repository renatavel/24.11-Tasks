package PackageAnimals;

public interface AnimalName {
    static void name(Object ob,String name) {
        if(name!=null){
        System.out.println(ob.getClass().getSimpleName()+ " name is: " + name);}
        else {return;}
    }
}
