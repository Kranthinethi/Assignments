package MavenProjects.collections;
import java.util.List;

public class Question {
private int questionId;
private String question;
private List<String> answers;

public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getAnswers() {
	return answers;
}
public void setAnswers(List<String> answers) {
	this.answers = answers;
}
void print() {
	System.out.println("QuestionID:"+getQuestionId());
	System.out.println("Question:"+getQuestion());
	System.out.print("answers:");
    System.out.println(answers);    
    System.out.println("----------------------------");
}
}
