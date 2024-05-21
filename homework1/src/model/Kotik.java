package model;

    public class Kotik {

        static int count = 0;
        private String name;
        private int hour;
        private int random;
        private int fullness;
        private String feed;

        private Kotik(String name){
            this.name = name;
            model.Kotik kotik = new model.Kotik("Барсик");
            count++;
            System.out.println("Кот " + name + " Всего котов: " + count);
        }



        public void sleep(){
            System.out.println("Котик спит");
        }
        public void sayMeow(){
            System.out.println("Мяу!");
        }
        public void jump(){
            System.out.println("Прыг-прыг!");
        }
        public void play(){
            System.out.println("Котик играет");
        }
        public void chaseMouse(){
            System.out.println("Котик бежит за мышью");
        }
        public void liveAnotherDay() {
            for (hour = 1; hour <= 24; hour++) {
                return hour;
            }
            public static int randomNumber () {
                random = return (int) (Math.random() * 6) + 1;
            }

            switch (random) {
                case (1):
                    System.out.println("Котик спит");
                    break;
                case (2):
                    System.out.println("Мяу!");
                    break;
                case (3):
                    System.out.println("Прыг-прыг!");
                    break;
                case (4):
                    System.out.println("Котик играет");
                    break;
                case (5):
                    System.out.println("Котик бежит за мышью");
                    break;
                default:
                    System.out.println("Хочу есть!");
            }

        }
        public void eat(fullness){
            for(fullness = 0; fullness<=5; fullness++){
                System.out.println("Уровень сытости: " + fullness);
            }
        }
        public void eat(fullness, feed){
            System.out.println("Уровень сытости: " + fullness + ". " + "Сегодня " + name + " ест " + feed + ".");
        }
        public void eat(){
            model.Kotik kotik = new model.Kotik();
            kotik.eat(fullness, "Китикет");
        }


    }

}
