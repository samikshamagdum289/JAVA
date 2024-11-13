import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class suffling 
{
    public static void main(String args[])
    {
        
        List<String> questions = new ArrayList<>();
        
        questions.add("Which company created Java?");
        questions.add("Which year was Java created?");
        questions.add("What was Java originally called?");
        questions.add("Who is credited with creating Java?");
        
        Collections.shuffle(questions);
        
        for (String question : questions) 
        {
        System.out.println(question);
        }
    }
}
