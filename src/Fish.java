public class Fish extends Pet {
    int currentDepth = 10;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        //System.out.println("ныряю на глубину " + howDeep + " футов");
        //System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
        return currentDepth;
    }
}
