package cs161_js_assignmentThree_ClinicService;

public class SurveyQuestions {

	private int QuestionNumber;
	private String Question;
	
	public void setQuestionNumber(int QuestionNumber) {
		this.QuestionNumber = QuestionNumber;
	}
	
	public Integer getQuestionNumber () {
		return this.QuestionNumber;
	}
	
	public void setQuestion(String Question) {
		this.Question = Question;
	}
	
	public String getQuestion () {
		return this.Question; 
	}
}
