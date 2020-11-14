public class Cow extends Animals{
    private String name;
    private String color;
    Cow (String name,String color){
        this.name=name;
        this.color=color;
    }
    @Override
    void sound(){
        System.out.println(name+ " - woo");
    }
    @Override
    void info(){
        System.out.println("name is "+name+"\n"+"color is "+color);
        super.info();
    }
}
