package BasicJava;

public class Exe_008_TernaryGradeCalculator {
    public static void main(String[] args) {

        int marks=45;

        String grade= (marks<=59)?"F":((marks>=60 && marks<=69)?"D":(marks>=70 && marks<=79)?"C":(marks>=80 && marks<=89)?"B":"A");
        System.out.println(grade);
    }
}
