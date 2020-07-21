package chapter04.item17;

public class Item17 {
    // Title : 변경 가능성을 최소화하라

    /*
     - 클래스를 불변으로 만들려면 다음 다섯가지 규칙을 따르면 된다.
      1) 객체의 상태를 변경하는 메서드(변경자)를 제공하지 않는다.
      2) 클래스를 확장할 수 없도록 한다.
      3) 모든 필드를 final로 선언한다.
      4) 모든 필드를 private으로 선언한다.
      5) 자신 외에는 내부의 가변 컴포넌트에 접근할 수 없도록 한다.

     - 불변 객체는 근본적으로 스레드 안전하여 따로 동기화할 필요 없다.
       (안심하고 공유할 수 있다.)

     - 불변 객체는 자유롭게 공유할 수 있음은 물론, 불변 객체끼리는 내부 데이터를 공유할 수 있다.

     - 불변 클래스에도 단점은 있다. 값이 다르면 반드시 독립된 객체로 만들어야 한다는 것이다.

     - 더 유연한 방법은 모든 생성자를 private 혹은 package-private으로 만들고 public 정적 팩터리를 제공하는 방법이다.(Complex2)
     */
}