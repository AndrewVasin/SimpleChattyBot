import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        ArrayList<String> guestList = new ArrayList<>();
        while (scanner.hasNext()) {
            guestList.add(scanner.next());
        }
        for (int i = guestList.size() - 1; i >= 0; i--) {
            System.out.println(guestList.get(i));
        }
    }
}