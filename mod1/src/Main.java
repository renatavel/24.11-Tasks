import PackageAnimals.Animal;
import PackageAnimals.Mammal;

public class Main {
    public static void main(String[] args) {
     Animal[] animals=new Animal[5];
     animals[0]=new PackageAnimals.Dog("Archi",10,10,"brown","haski");
     animals[1]=new PackageAnimals.Dog("Stormi");
     animals[2]=new PackageAnimals.Blowfish("Lily",7,5,"light blue","2.5");
     animals[3]=new Mammal("Sam",15,16,"black");
     animals[4]=new PackageAnimals.Pigeon(7,"Ice pigeon");

     for(int i=0;i< animals.length;i++){
         System.out.println(animals[i]);
         animals[i].eat();
         animals[i].getVoice();
         if(animals[i] instanceof PackageAnimals.Dog){
             ((PackageAnimals.Dog)animals[i]).run();
             ((PackageAnimals.Dog)animals[i]).sleep();
         }
         if(animals[i]instanceof PackageAnimals.Blowfish){
             ((PackageAnimals.Blowfish)animals[i]).ask();
             ((PackageAnimals.Blowfish)animals[i]).sleep();
         }
         if(animals[i] instanceof PackageAnimals.Pigeon){
             ((PackageAnimals.Pigeon)animals[i]).swim();
             ((PackageAnimals.Pigeon)animals[i]).sleep();
         }
        }
        for(int j=0;j<animals.length;j++){
            if(animals[j] instanceof PackageAnimals.Dog){
                ((PackageAnimals.Dog)animals[j]).move();
            }
            if(animals[j]instanceof PackageAnimals.Blowfish){
                ((PackageAnimals.Blowfish)animals[j]).move();
            }
            if(animals[j] instanceof PackageAnimals.Pigeon){
                ((PackageAnimals.Pigeon)animals[j]).move();
            }
        }
        for(Animal a:animals){
            PackageAnimals.AnimalName.name(a,a.getName());
        }

    }
}