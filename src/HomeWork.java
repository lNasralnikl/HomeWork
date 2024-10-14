public class HomeWork {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");

        System.out.println("Задача 3");
        dog = dog -3.5;
        cat = cat -1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend 1 = " + friend);
        friend = friend * 2;
        System.out.println("friend 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend 3 = " + friend);
        System.out.println("");

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog 1 = " + frog);
        frog = frog * 10;
        System.out.println("frog 2 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog 3 = " + frog);
        frog = frog + 4;
        System.out.println("frog 4 = " + frog);
        System.out.println("");

        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Общая масса боксеров " + (boxer1 + boxer2));
        System.out.println("Разница между массами боксеров " + (boxer2 - boxer1));
        System.out.println("");

        System.out.println("Задача 7");
        System.out.println("Остаток деления " + (boxer2 % boxer1));
        System.out.println("");

        System.out.println("Задача 8");
        var hours = 640;
        var hourPeop = 8;
        var people = hours / hourPeop;
        System.out.println("Всего работников в компании -" + people + "человек.");
        System.out.println("Если в компании работает " + (people + 94) + " человека, то всего " + ((people + 94) * hourPeop) + " часов работы может быть поделено между сотрудниками");
    }

}
