import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel marriott = new Hotel(new Room[]
                {
                        new Room(2,true,true,false,false,11),
                        new Room(2,true,true,false,false,12),
                        new Room(3,true,true,true,false,13),
                        new Room(3,true,true,true,true,21),
                        new Room(4, true,true,false,false,22),
                        new Room(2,false,false,false,false,23),
                        new Room(2, false,true,false,false,31),
                        new Room(1, false, true,true,true,32),
                        new Room(1,true,true,true,true,33)
                });
        while(true){
            System.out.println("Введите команду");
            String command = scanner.nextLine();
            if(command.equals("eat")){
                marriott.getRoomsWithEat();
            }else if(command.equals("freeRooms")){
                marriott.getFreeRooms();
            }
        }
        /*Person oleg = new Person("Oleg",35);
        System.out.println(oleg.name);
        Person igor = new Person("Igor",23);
        igor.sayHi(oleg.name);*/
    }
}

class Person{
    String name;
    int age;
    int hp; // здоровье не может быть больше 100
    Person(String name, int age){
        this.name = name;
        this.age = age;
        this.hp = 100;
    }
    void sayHi(String name){
        System.out.println("Hello " +name+", I`m "+this.name);
    }
}
