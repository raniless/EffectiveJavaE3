package chapter04;

// Title : public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라
public class Item16 {
    /*
     - public 클래스는 절대 가변 필드를 직접 노출해서는 안된다.
     - 패키지 바깥에서 접근할 수 있는 클래스라면 접근자를 제공
     */

    //이렇게 사용해서는 안됨
    /*
    class Point {
        public double x;
        public double y;
    }
    */

    class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
}


