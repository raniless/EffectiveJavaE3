package chapter04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Title : 클래스와 멤버의 접근 권한을 최소화 하라
public class Item15 {
    /*
     - 모든 클래스와 멤버의 접근성을 가능한 한 좁혀야 한다.
     - public 클래스의 인스턴스 필드는 되도록 public이 아니어야 한다.
     - public 가변 필드를 갖는 클래스는 일반적으로 스레드 안전하지 않다.
     - 클래스에서 public static final 배열 필드를 두거나 이 필드를 반환하는 접근자 메서드를 제공해서는 안된다.
       (Why? > 길이가 0이 아닌 배열은 모두 변경 가능)
     */

    //보안 허점이 숨어 있다.
    public static final String[] VALUE = {"a", "b", "c", "d"};

    //해결 1 : 앞 코드의 public 배열을 private로 만들고 public 불변 리스트를 추가하는 것
    private static final String[] PRIVATE_VALUE2 = {"a", "b", "c", "d"};
    public static final List<String> VALUES2 = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUE2));

    //해결 2 : 앞 코드의 public 배열을 private로 만들고 복사본을 반환하는 public 메서드를 추가하는 방법
    private static final String[] PRIVATE_VALUE3 = {"a", "b", "c", "d"};
    public static final String[] values() {
        return PRIVATE_VALUE3.clone();
    }
}