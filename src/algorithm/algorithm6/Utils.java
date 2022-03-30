package algorithm.algorithm6;

public class Utils {
        public int sumSequenceNumbers(int min, int max) {
            int result = 0;
            int count = 0;
            int maxCount = (max - min) / 2;
            while(maxCount >= count) {
                result += min + max;
                count++;
                min++;
                max--;
            }
            return result;
        }
    }

