public class JamesBondCar extends Car{

    @Override
    public int drive(int howlong) {

       int distance = howlong * 180;

        System.out.println("Скорость машины по воде:180");

        return distance;


    }   @Override
    public void start(){
        System.out.println("Машина  заводится");
 }           @Override
    public void stop(){
        System.out.println("Машина говорит:Заканчиваю работу");

}
}
