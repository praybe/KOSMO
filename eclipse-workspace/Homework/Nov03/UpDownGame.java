package Nov03;
 
import java.util.Scanner;
 
class UpDownGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while (true) {
 
            System.out.println("**************" + "\n" + "1. 게임 시작" + 
            "\n" + "2. 게임 종료" + "\n" + "**************");
 
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("게임시작");
 
                int com = (int) (Math.random() * 100 + 1);
 
                for (int i = 0; i < 10; i++) {
                    System.out.println(">>>");
                    int human = sc.nextInt();
 
                    if (i == 9 && com != human) {
                        System.out.println("10번의 기회가 끝났습니다." + "\n" + "Game Over");
                        break;
                    }
 
                    if (com > human) {
                        System.out.println("up");
 
                    } else if (com < human) {
                        System.out.println("down");
 
                    } else {
                        System.out.println("맞았다");
                        break;
                    }
 
                }
 
            } else {
                System.out.println("게임 종료");
                break;
            }
 
        }
 
    }
}