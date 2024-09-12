import java.util.List;
import java.util .*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class AdditionClosure {

    public static boolean isClosed(List<Integer> intList, Integer n) {
        // TODO: Implement this method


        for (int i = 0; i < intList.size(); i++) {
            intList.get(i);
            intList.set(i, intList.get(i)%n);

        }

        for (int i = 0; i < intList.size()-1; i++) {
            for (int j = i+1; j < intList.size(); j++) {
                int tmp = (intList.get(i) + intList.get(j)) % n;
                if (!intList.contains(tmp)) {
                    return false;
                }
            }
        }
        return true;
    }

}