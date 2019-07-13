package ch03.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Name:ImutableArray
 * Desc :
 * Developer :82108
 * Date : 2019-07-13
 * Time : 오후 3:39
 */
public class ImutableArray {
    //public static final Thing[] VALUES = {}; // 길이가 0 이 아닌 배열은 변경 가능
    private static final Thing[] PRIVATE_VALUES={};
     // 첫번째 방법 불변 리스트 추가
    public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    // 2번째 방법 private 배열을 만들고 복사본을 반환
    private static final Thing[] PRIVATE_VALUES2 ={};
    public static final Thing[] values() {
        return PRIVATE_VALUES2.clone();
    }
}
class Thing {
    Thing() {

    }

}
