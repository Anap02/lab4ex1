import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File f = new File("fisier.txt");
        Scanner sc = null;
        Map<String, Integer> map = new HashMap<>();
        try {
            sc = new Scanner(f);

            if (sc != null) {
                while (sc.hasNext()) {
                    String line = sc.next();
                    String[] cuvinte = line.split(" ");
                    for (String cuv : cuvinte) {
                        cuv = cuv.toLowerCase();
                        if (map.containsKey(cuv)) {
                            map.put(cuv, map.get(cuv) + 1);
                        } else {
                            map.put(cuv, 1);
                        }
                    }
                }

                for (String cuv : map.keySet()) {
                    System.out.println(cuv + " " + map.get(cuv));
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit!");
            return;
        }
    }
}