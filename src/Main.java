import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("fisier.txt"));
            while (sc.hasNext()) {
                String line = sc.next();
                String[] cuvinte = line.split(" ");
                for (String cuv : cuvinte) {
                    cuv = cuv.toLowerCase();
                    if (!map.containsKey(cuv)) {
                        map.put(cuv, map.get(cuv) + 1);
                    } else {
                        map.put(cuv, 1);
                    }
                }
            }
            sc.close();
        }   catch (FileNotFoundException e) {
        System.out.println("Fișierul nu a fost găsit!");
        return;
    }

           for (String cuv : map.keySet()) {
               System.out.println(cuv + " " + map.get(cuv));
           }
    }
}