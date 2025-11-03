import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String,List<String >> map = new LinkedHashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("src\\sample.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String key = sortedWords(line);
            if(!map.containsKey(key))
            {
            map.put(key, new ArrayList<>());
            }
            map.get(key).add(line);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\anagrams.txt"));

        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            bw.write(String.join(" ", entry.getValue())+"\n");
        }
        bw.close();
    }
    public static String sortedWords(String word){
        word = word.toLowerCase();
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}