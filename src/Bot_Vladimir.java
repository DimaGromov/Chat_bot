
import sun.awt.windows.WSystemTrayPeer;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Bot_Vladimir {
    Scanner scanner = new Scanner(System.in);

    String name = "Владимир"; // Имя бота.
    String name_companion;    // Имя сосебедника.
    int age_companion;        // Возраст собеседника.
    int counter = 0;          // Счётчик вызова меню.

    //********************************* МЕТОДЫ КЛАССА *********************************

    // В методе acquarintance происходит знакомство с пользователем. Узнается его имя и возраст. Возраст проверяется на
    // допустимость значения. Ввод возраста продолжается до введения коректоного значения.
    void acquaintance() {
        // Спрашиваем про возраст.
        System.out.println(" - Привет, я абсурдный Бот Владимир!\n - Как тебя зовут?");
        setName_companion(scanner.next());

        // Спрашиваем про возраст.
        System.out.println(" - А сколько тебе лет, " + name_companion + "?");

        while (true) {
            int a = scanner.nextInt();
            if (a > 120) {
                System.out.println(" - Либо кто-то украл у буддиских манахов рецепт долголетия, либо ты " + name_companion + " врешь Боту Владимиру...");
                System.out.println(" -Попробуй еще раз");
            } else if (a < 18) {
                System.out.println(" - Прости мелюзга, мне можно общаться только со взрослыми...");
                System.out.println(" - Пс... Но если ты соврешь про свой возраст, я не расскажу твоим родителям.");
            } else {
                setAge_companion(a);
                break;
            }
        }

        // Завершения знакомства
        System.out.println(" - Ладно, я знаю о тебе достаточно, Приятель.\n - Давай теперь развлечёмся, погляди что я умею:");
        help();
    }

    // Справочное меню с командами.
    void help() {
        if (counter == 0) {
            System.out.println("====================================================================================");
            System.out.println(" - К сожалению мой создатель не Марк Цукерберг и даже не Паша Дуров, поэтому я понимаю только команды ниже: ");
        } else {
            System.out.println("====================================================================================");
            System.out.println(" - Мои команды:");
        }
        counter++;

        System.out.println("\t\"help\"\t\t- вызов справоочного меню");
        System.out.println("\t\"Игра\"\t\t- играть в игру Быки и Коровы");
        System.out.println("\t\"Шар\"\t\t- магический шар восьмёрка");
        System.out.println("\t\"Польша\"\t- расскажу о численности насления Польши в 1964 году");
        System.out.println("\t\"Патриот\"\t- режим Владимира Киселёва");
        System.out.println("\t\"Пока\"\t\t- попращаться с Ботом Владимиром");
        System.out.println("====================================================================================");
    }

    // Установка имени собеседника.
    void setName_companion(String name_companion) {
        this.name_companion = name_companion;
    }

    // Установка возраста собеседника.
    void setAge_companion(int age_companion) {
        this.age_companion = age_companion;
    }

    // Рабочий интерфейс бота.
    void workBot(){
        boolean working = true;
        while (working){
            System.out.println();
            System.out.print("Введите команду: ");
            String str = scanner.next();
            switch (str){
                case "help":
                    System.out.println();
                    help();
                    break;
                case "Игра":
                    System.out.println();
                    Bulls_and_Cows new_game = new Bulls_and_Cows();
                    new_game.startGame();
                    break;
                case "Шар":
                    System.out.println();
                    Ball_8 new_ball = new Ball_8();
                    new_ball.useBall();
                    break;
                case "Польша":
                    System.out.println();
                    System.out.println("Численность населения Польши в 1964 году 30.94 миллиона человек.");
                    break;
                case "Патриот":
                    System.out.println();
                    System.out.println("ГОСДОЛГ США $19,252,128,599,992");
                    break;
                case "Пока":
                    System.out.println();
                    System.out.println("Пока, приятель!");
                    working = false;
                    break;
                default:
                    System.out.println("Я тебя не понял...");
            }
        }
    }
}
