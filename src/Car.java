public class Car {

        public void start(){
            System.out.println("машина запускается");//запуск машины
        }
        public void stop(){
            System.out.println("машина останавливается");//выключение машины
        }
        public int drive(int howlong){
            int distance = howlong * 60;
            System.out.println("Машина проехала:" + distance + "км");

            return distance;
        }
}
