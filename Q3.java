public class Q3 {
//    while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
//    눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
//    눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
    public static void main(String[] args) {
        System.out.println("시작!");

        boolean threwDice = true;
//        논리형 변수 threwDice가 ture일 때 while문 실행 시작.
        while (threwDice) {
            int non1 = (int) (Math.random() * 6) + 1;
            int non2 = (int) (Math.random() * 6) + 1;
//            Math.random()이 0=< ~ <1 소숫값을 반환하는 함수이므로 *6을 해서 0=< ~ <6 으로 만들어준다.
//            그리고 이 값에 +1 을 해주어 1=< ~ <7 로 범위값을 바꿔준다.
//            이 소숫값을 int로 정수형으로 변환하여 1~6 사이의 범위값만 출력한다.

            System.out.println("(" + non1 +"," + non2 + ")");

            if (non1 + non2 == 5)
                break;
//            반복문 while에 if로 "non1+non2 = 5 일때," 라는 조건을 붙여준다.
//            해당 조건을 만족할시 멈추도록(break) 해준다.
        }

        System.out.println("끝!");
    }
}
