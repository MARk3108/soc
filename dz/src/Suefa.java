import java.util.Scanner;

public class Suefa {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        Scissors s=new Scissors();
        s.numb=1;
        Rock r=new Rock();
        r.numb=2;
        Paper p=new Paper();
        p.numb=3;
        new Game().play(a,b,s,r,p);
    }
}
