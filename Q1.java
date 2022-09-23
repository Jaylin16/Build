public class Q1 {
//    다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?
    public static void main(String[] args) {
        int var1=5;
//        정수형 타입(int) var1에 5가 저장됩니다.
        int var2=2;
//        정수형 타입(int) var2에 2가 저장됩니다.
        double var3=var1/var2;
//        실수형 타입(double) var3에서 요구하는 var1, var2가 정수형 타입(int)이므로 그 값은 정수형이 나옵니다.
//        때문에 var3에는 2.5가 아닌 2가 저장됩니다.
        int var4=(int)(var3*var2);
//        따라서 var4 = 2*2 =4가 출력됩니다.
        System.out.println(var4);

//      코드 실행시 출력결과 5를 얻고 싶다면 아래와 같이 타입을 수정해줘야합니다.
        double var5=5;
        double var6=2;
        double var7=var5/var6;
        int var8=(int)(var7*var6);
        System.out.println(var8);
    }
}