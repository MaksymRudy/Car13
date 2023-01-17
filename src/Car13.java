public class Car13 {
    int age = 0;
    int power = 110;
    int turbo = 5;

    public static void main(String[] args) {
        Car13 tt1 = new Car13();
        Car13 tt2 = new Car13();

        System.out.println(tt1.getAge());
        System.out.println(tt1.calculateIndex());
        System.out.println(tt2.power);
        System.out.println(tt2.upgradePower(110));
        System.out.println(tt2.calculateIndex());

    }

    int getAge() {
        return age;
    }

    int calculateIndex() {
        return power * 10 + turbo;
    }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }

}
