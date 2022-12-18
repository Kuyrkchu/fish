public class PetMaster {

  public static void main(String[] args) {
/*
      String petReaction;
      Pet myPet = new Pet();
      Pet myPet2 = new Pet();






      petReaction = myPet.say("Чик!! Чирик!!,pet");
      System.out.println(petReaction);

      petReaction = myPet2.say("Гав!! Гав!!,pet2");
      System.out.println(petReaction);

*/

      int catParameter;
      String catParameterString;

      Cat myCat = new Cat();

      catParameter = myCat.getAge();
      System.out.println("Возраст кота: "  + catParameter);

      catParameter = myCat.getHeight();
      System.out.println("Рост кота: " + catParameter);

      catParameter = myCat.getWeight();
      System.out.println("Вес кота: " + catParameter);

      catParameterString = myCat.getColor();
      System.out.println("Цвет кота:" + catParameterString);

      myCat.eat();
      myCat.sleep();


  }
}
