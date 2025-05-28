package Interface;

public class Dog extends Abstract implements Animal {
    public void sound(){
        System.out.println("geo geo");
    }
    public void eat(){
        System.out.println("dog dog....");
    }

    public void Sound2(){
        System.out.println("Sound 2 overriding");
    }
}
