
package MavenProjects.collections;

import java.util.Set;

public class QuestionSet {
private int questionId;
private String question;
private Set<String> answers;

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
public Set<String> getAnswers() {
	return answers;
}
public void setAnswers(Set<String> answers) {
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
