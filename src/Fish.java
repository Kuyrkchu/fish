public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {

        currentDepth = currentDepth + howDeep;

        if (currentDepth > 100) {

        System.out.println("Я маленькая рыбка и не могу плавать глубже 100 метров");


        currentDepth = currentDepth - howDeep;
        System.out.println();

    }
        else if(currentDepth <= 80) {

            System.out.println("Мама говорот:'что здесь безопасно плавать!'");
        }



        else if(currentDepth <= 100) {

        System.out.println("Погружаюсь ещё на " + howDeep + " метров");

        System.out.println("Я на глубине " + currentDepth + "метров");



        System.out.println();

    }

        System.out.println("CurrentDepth: "  + currentDepth);

    return currentDepth;
}
    @Override
    public String say(String something) {
      return "Разве вы не знаете, что рыбы говорят?";

    }

}

