package workshop.test.exercises;

public class NotString {

    public String notString(String word){
        if(word.contains("not")){
            return word;
        }
        return "not " + word;
    }
}
