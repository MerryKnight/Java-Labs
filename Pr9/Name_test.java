public class Name_test
{
    public static void main(String[] args)
    {
        Nameable dog = new Dog("Jimbo");
        Nameable car = new Car("AUDI");
        
        System.out.println(dog.getName());
        System.out.println(car.getName());
    }
}
