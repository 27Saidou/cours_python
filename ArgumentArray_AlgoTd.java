import java.util.*;

public class ArgumentArray_AlgoTd {
    public static void pourcentage(Integer[] marks) {
        int totalMarks = 300;
        int obtainedMarks = 0;
        for (int mark : marks) {
            obtainedMarks += mark;
        }
        double percent = (obtainedMarks * 100) / totalMarks;
        System.out.println("pourcentage :" + percent);
    }

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(67);
        marks.add(87);
        marks.add(56);
        System.out.println("La moyenne est :" + marks);
        pourcentage(marks.toArray(new Integer[marks.size()]));
    }
}
