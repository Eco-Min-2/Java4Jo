package Feb10;

public class Feb10_1 {
    public static void main(String[] args) {
        String s = "사라져버린 Summer Time 너의 두 눈이 나를 비추던 Summer Time";
        System.out.println("s = " + s);
        System.out.println("문자열 길이 : " + s.length());
        System.out.println("Summer -> Spring " + s.replaceAll("Summer", "Spring"));
        System.out.println("영어를 전부 대문자로 : " + s.toUpperCase());

        System.out.println("너 indexOf : " + s.indexOf("너"));
        System.out.println("나 indexOf : " + s.indexOf("나"));

        System.out.println("너 와 나 사의 문자 만 출력 : " + s.substring(s.indexOf("너")+1, s.indexOf("나")));
    }
}
