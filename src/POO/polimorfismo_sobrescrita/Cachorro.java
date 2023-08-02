package polimorfismo_sobrescrita;

public class Cachorro extends Animal {
    
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();

    }

    @Override
    public void fazerBarulho() {

        System.out.println("au au");

    }

}
