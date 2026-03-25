import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> nachopop = new  ArrayList <>();
        nachopop.add(0);
        nachopop.add(1);
        nachopop.add(2);
        nachopop.add(3);
        //para acceder a posicion
        System.out.println(nachopop.get(3));
        nachopop.remove(3);
        System.out.println(nachopop);
    }
}