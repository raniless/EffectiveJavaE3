package chapter06.item34;

public class WeightTable {
    public static void main(String[] args) {
//        double earthWeight = Double.parseDouble(args[0]);
        double earthWeight = 185;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet planet : Planet.values()) {
            System.out.printf("%s에서의 무게는 %f이다. (질량 : %f, 반지름 : %f, 표면중력 : %f)%n",
                    planet.name(), planet.surfaceWeight(mass), planet.mass(), planet.radius(), planet.surfaceGravity());
        }
    }
}
