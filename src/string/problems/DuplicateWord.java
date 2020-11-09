package string.problems;

import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";



        String[] splitSt = st.split(" ");

        HashMap<String, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < splitSt.length; i++) {
            Integer previousCount = occurrences.get(splitSt[i]);
            if (previousCount == null) {
                previousCount = 0;
            }

            occurrences.put(splitSt[i], previousCount + 1);
        }

        System.out.println(occurrences);

        // double check this one
        System.out.println(occurrences.get("Java"));

    }

}
