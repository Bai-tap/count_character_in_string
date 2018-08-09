import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi ký tự để đếm số lần xuất hiện từng ký tự: ");
        String charString = sc.next();
        System.out.println("Nhập vào ký tự muốn đếm: ");
        String charCount = sc.next();

        int count = 0;
        for (int i = 0; i < charString.length(); i++) {
            if (charCount.equals(String.valueOf(charString.charAt(i))))
                count++;
        }
        System.out.println("Số lần xuất hiện của ký tự '" + charCount + "' là: " + count + " lần.");
    }
}
