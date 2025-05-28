package Interface;

public class Abstract {
    String name;
    int age;

    Abstract(){
    }
    Abstract(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void Sound2(){
        System.out.println("Sound2");
    }
}
