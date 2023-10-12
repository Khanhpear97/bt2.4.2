import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int check;
        do {
            System.out.println("Nhan phim 1 de bat dau bam gio: ");
            System.out.println("Nhan phim 2 de dung bam gio: ");
            check = scanner.nextInt();
            switch (check) {
                case 1:
                    stopWatch.start();
                    break;
                case 2:
                    stopWatch.stop();
                    break;
            }
        } while (check != 2);
        long elapseTime = stopWatch.getElapsedTime();
        System.out.println("Thoi gian da troi qua: " + elapseTime + "s");
    }
}