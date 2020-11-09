package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        new Permutation().permute("ABC");
    }


        public void permute(String input){
            permute("", input);
        }

        private void permute(String prefix, String suffix){
            if(1 == suffix.length()){
                System.out.println(prefix + suffix);
            }else {
                for (int i = 0; i < suffix.length(); i++) {
                    permute(prefix + suffix.charAt(i), suffix.substring(0,i) + suffix.substring(i+1, suffix.length()));
                }
            }
        }



    }

