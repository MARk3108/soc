public class Dolphin extends Animals{
    private String name;
    private String color;
    Dolphin (String name,String color){
        this.name=name;
        this.color=color;
    }
    @Override
    void sound(){
        System.out.println(name+" - scrr");
    }
    @Override
    void info(){
        System.out.println("name is "+name+"\n"+"color is "+color);
        super.info();
    }
}
