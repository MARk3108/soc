public class Game {
    public static void play(int a, int b,Scissors s,Rock r, Paper p){
        if (a==s.numb){
            if (b==r.numb){
                System.out.println("Rock");
            }else{
                System.out.println("Scissors");
            }
        }else{
            if (a==r.numb){
                if(b==s.numb){
                    System.out.println("Rock");
                }else{
                    System.out.println("Paper");
                }
            }
        }
        if (a==p.numb){
            if (b==r.numb){
                System.out.println("Paper");
            }else{
                System.out.println("Scissors");
            }
        }
    }
}
