package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] LottoNumbers;
    private int count;

    public int[] generate() {
        LottoNumbers = new int[6];
        count = 0;

        // 무작위 숫자 6개 생성
        while (count < 6) {
            // 1 ~ 45 숫자 생성
            int num = random.nextInt(45) + 1;
            if(isUnique(num)) {
                LottoNumbers[count] = num;
                count++;
            }
        }
        return LottoNumbers;
    }

    private boolean isUnique(int num) {
        for (int i = 0; i < count; i++) {
            if (LottoNumbers[i] == num) {
                return false;
            }
        }
        return true;
    }
}
