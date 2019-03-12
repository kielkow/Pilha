
import java.util.EmptyStackException;


public class Teste {

    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        p.push(2);
        p.push(3);
        p.push(8);
        p.push(10);
        p.push(-55);
        p.push(-1);
        try {
            System.out.println(p.pop());
            System.out.println(p.pop());
            System.out.println(p.pop());
            System.out.println(p.pop());
            System.out.println(p.pop());
            System.out.println(p.pop());
        } catch (EmptyStackException ex) {
            System.out.println("Pilha vazia");
        }
    }
}
