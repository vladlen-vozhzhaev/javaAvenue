public class Main {
    public static void main(String[] args) {
        Person katya= new Person("Екатерина",70,null,null);
        Person oleg = new Person("Олег",45,null,null);
        Person olga = new Person("Ольга",47, katya,null);
        Person igor = new Person("Игорь",20, olga,oleg);

        //System.out.println(igor.getMother().getName());
        olga.getInfo();
    }
}
// У человека не может бытьь более 100 едениц здоровья
class Person{
    private String name;
    private int age;
    private int hp;
    private Person mother;
    private Person father;
    public Person(String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }
    void setHp(int hp){
        if(this.hp+hp>=100) this.hp = 100;
        else this.hp += hp;
    }
    int getHp(){return this.hp;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo(){
        String info = "";
        info += "Меня зовут "+this.name+"\n"+
                "Мне "+this.age+" лет \n";
        if(this.mother != null){
            info += "Мою маму зовут " + this.mother.name + "\n";
            if(this.mother.mother != null)
                info += "Бабушку по маминой линии зовут " + this.mother.mother.name + "\n";
        }
        if(this.father != null) info += "Моего папу зовут "+this.father.name+"\n";
        System.out.println(info);
    }
}
