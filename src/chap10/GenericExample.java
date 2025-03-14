package chap10;

import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List list = new ArrayList<>(); // 타입 안정성 없음
        list.add("문자열");
        list.add(new AccountException());
        // String str = list.get(0); //  generic을 사용하지 않아 list가 object 타입이다.
        String str = (String) list.get(0); // 강제 캐스팅
        System.out.println(str);
        // String accountException = (String) list.get(1); // runtime 오류


        List<String> list2 = new ArrayList<>();
        list2.add("문자열");
        // list.add(1000); // 오류, String이 아니여서
        String str2 = list2.get(0); // 캐스팅 작업 X
        System.out.println(str2);
    }
}
