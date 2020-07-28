package chapter04.item18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("틱", "틱틱", "평");

        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(list);
        //3이 아닌 6이 출력 -> Why? addAll()이 내부적으로 add를 호출 -> override된 add를 호출하므로 count가 더 증가
        System.out.println(s.getAddCount());

        //Compostion 구성으로 정상적으로 출력
        NewInstrumentedHashSet<String> s2 = new NewInstrumentedHashSet<>(new HashSet<String>());
        s2.addAll(list);
        System.out.println(s2.getAddCount());
    }
}
