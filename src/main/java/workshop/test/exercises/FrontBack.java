package workshop.test.exercises;

public class FrontBack {

    public String frontBack(String word){
        if(word.length() <= 1){
            return word;
        }
        String sub = word.substring(1, word.length()-1);
        return word.charAt(word.length()-1) + sub + word.charAt(0);
    }
}



  //  Given a string, return a new string where the first and last chars have been exchanged.