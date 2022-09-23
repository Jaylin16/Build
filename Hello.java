import java.util.ArrayList;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello");

//        증감연산자 예제
        int x = 2;
        int y = 2;

        System.out.println(x * y++);
//        = 2*2
        System.out.println(x * ++y);
//        =2*(14번 줄 전휘형 증감 연산자로 인한 1+ 12번줄 후휘형 증감연산자로 인해 변한 y값 3)
//        즉, =2*4 = 8

    }
}
