import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Ball_8 {
    Scanner scanner = new Scanner(System.in);
    // Массив содержащий варианты ответа магического шара.
    private String[] answer = {
            "Бесспорно",
            "Предрешено",
            "Никаких сомнений",
            "Определённо да",
            "Можешь быть уверен в этом",
            "Мне кажется - \"да\"",
            "Вероятнее всего",
            "Хорошие перспективы",
            "Знаки говорят \"да\"",
            "Да",
            "Пока не ясно, попробуй снова",
            "Спроси позже",
            "Лучше не рассказывать",
            "Сейчас нельзя предсказать",
            "Сконцентрируйся и спроси опять",
            "Даже не думай",
            "Мой ответ - \"нет\"",
            "По моим данным \"нет\"",
            "Перспективы не очень хорошие",
            "Весьма сомнительно"
    };

    Ball_8(){
        ballMenu();
    }
    private void ballMenu() {
        System.out.println("############# Магический шар Вольмерка #############");
        System.out.println("Вы берете в руки магический шар Восьмёрку.");
        System.out.println("Для того чтобы потрясти шар и получить ответ на свой вопрос, введите команду \"трясти\".");
        System.out.println("Для выхода введите команду \"положить\".");
    }

    private void shake() {
        int num = (int) (Math.random() * 20);
        System.out.println("Шар говорит: " + answer[num]);
    }

    void useBall() {
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String str = scanner.next();

            switch (str) {
                case "трясти":
                    shake();
                    break;
                case "положить":
                    work = false;
                    System.out.println("Вы кладёте магический шар.");
                    break;
                default:
                    System.out.println("Шар тебя не понял");
            }
        }
    }
}
