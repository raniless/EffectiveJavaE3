package chapter04.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Item15 {
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