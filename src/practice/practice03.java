package practice;

public class practice03 {
    public static void main(String[] args){
        // "aaaabbccd" 문자열 한글자 씩 출력하기
        StringBuilder str = new StringBuilder("aaaabbccd");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        // 단어 순서 뒤집기 "Hello Welcome Java" -> "Java Welcome Hello"
        String word = "Hello Welcome Java";
        StringBuilder reverse = new StringBuilder();

        String[] words = word.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            if (i > 0) {
                reverse.append(" ");
            }
        }
        System.out.println(reverse);
        // 공백 제외해서 하나의 문자로 출력 "    Hello Welcome Java    "
        String toBlank = "    Hello Welcome Java    ";
        System.out.println(toBlank.replaceAll(" ", ""));
        // 연속된 문자의 반복 횟수로 문자열을 압축해보기 "aaaabbccd" -> "a4b2c2d1"
        String original = "aaaabbccd";
        StringBuilder compressStr = new StringBuilder();
        char currentChar = original.charAt(0);
        int count = 1;
        for (int i = 1; i < original.length(); i++) {
            if (original.charAt(i) == currentChar) {
                count++;
            } else {
                compressStr.append(currentChar);
                compressStr.append(count);
                currentChar = original.charAt(i);
                count = 1;
            }
        }
        compressStr.append(currentChar);
        compressStr.append(count);
        System.out.println(compressStr);
    }
}
