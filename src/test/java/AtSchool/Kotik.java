package AtSchool;

import org.junit.Test;

public class Kotik {
    @Test
    public void example1() {
        Kotik kotik = new Kotik();
        kotik.prettiness = 9999;
        kotik.name = "Рыжый";
        kotik.weight = 6327;//в граммах

    }

    @Test
    public void example2() {
        Kotik kotik1; // Объявление переменной
        Kotik kotik2; // Объявление переменной
        kotik1 = new Kotik(); // инициализация переменной
        kotik2 = kotik1; //Переприсваивание ссылки
        kotik1.prettiness = 9999;
        kotik1.name = "Рыжый";
        kotik1.weight = 6327;//в граммах
        System.out.println(kotik2.name + " - " + kotik2.prettiness);
    }

    @Test
    public void example3() {
        Kotik kotik1; // Объявление переменной
        kotik1 = new Kotik(); // инициализация переменной
        kotik1.prettiness = 9999;
        kotik1.name = "Рыжый";
        kotik1.weight = 6327;//в граммах
        kotik1.meow = "Кря кря";
        kotik1.sayMeow();
    }

    int prettiness;
    int weight;
    String name;
    String meow;
    private int hunger;
    private boolean isHunger;
    String[] foods = new String[] {"KittyCat", "Колбаску", "Сыр"};

    //Конструктор без параметров, он идентичен конструктору по умолчанию, 
    //который сюда бы подставила Java,    
    // Но она его не подставит, по той причине, 
    //что ниже определяется другой конструктор, с параметрами.
    public Kotik() {
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;this.name = name;
        this.meow = meow;
        hunger = 5;
        isHunger = false;
    }


    void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        hunger = 5;
        isHunger = false;
    }

    //У котика не может быть денег
    /*int giveMeMoney() {
        return 100;
    }
    */

    void sayMeow() {
        System.out.println(name + " говорит " + meow);
    }

    /**
     * Добаыленные методы здесь    |
     *                            \/
     */

    public static void main(String[] args) {
        new Kotik(3, 4, "Мурзик", "Мяу")
                .liveAnotherDay();
    }

    private void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int random = (int) (Math.random() * 5) + 1;
            switch (random) {
                case 1:
                    sleep();
                    break;
                case 2:
                    play();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    purr();
                    break;
                case 5:
                    wash();
                    break;
            }
            if (isHunger) {
                eat();
                isHunger = false;
            }
        }
    }

    private void eat() {
        int randomIndex = (int) (Math.random() * foods.length);
        eat(10, foods[randomIndex]);
    }

    private void eat(int hunger) {
        this.hunger += hunger;
    }

    private void eat(int hunger, String food) {
        int randomFood = (int)(Math.random() * 3);
        this.hunger += hunger;
        System.out.println(name + " ест " + food);
    }

    private void sleep() {
        if(hunger > 0) {
            System.out.println(name + " спит");
            hunger -= 1;
        } else {
            System.out.println(name + " голоден");
            isHunger = true;
        }
    }

    private void play() {
        if(hunger > 0) {
            System.out.println(name + " играет");
            hunger -= 1;
        } else {
            System.out.println(name + " голоден");
            isHunger = true;
        }
    }

    private void chaseMouse() {
        if(hunger > 0) {
            System.out.println(name + " ловит мышку");
            hunger -= 1;
        } else {
            System.out.println(name + " голоден");
            isHunger = true;
        }
    }

    private void purr() {
        if(hunger > 0) {
            System.out.println(name + " мурчит");
            hunger -= 1;
        } else {
            System.out.println(name + " голоден");
            isHunger = true;
        }
    }

    private void wash() {
        if(hunger > 0) {
            System.out.println(name + " моется");
            hunger -= 1;
        } else {
            System.out.println(name + " голоден");
            isHunger = true;
        }
    }
}
