
public class Learner {
    private String name;
    private int age;
    private String month;
public static void main (String[] args){
    Learner boy = new Learner("Uche", 24, "August");
        boy.eat();
       System.out.println(boy.getAge());
}
    public Learner(String name, int age, String month) {
        this.name = name;
        this.age = age;
        this.month = month;
        
        
    }
    

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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    public void eat(){
        System.out.println(name + " is eating rice");}
    
    
     
}

