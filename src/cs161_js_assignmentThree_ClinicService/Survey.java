package cs161_js_assignmentThree_ClinicService;

public class Survey {

	
	private int SurveyNumber;
	private String QuestionSet;
	private String AnswerSet;
	//PSEUDO CODE
	// displayQuestion;
	// recordAnswer;
	
	public void setSurveyNumber(int SurveyNumber) {
		this.SurveyNumber = SurveyNumber;
	}
	
	public Integer getSurveyNumber () {
		return this.SurveyNumber;
	}
	
	public void setQuestionSet(String QuestionSet) {
		this.QuestionSet = QuestionSet;
	}
	
	public String getQuestionSet () {
		return this.QuestionSet;
	}
	
	public void setAnswerSet(String AnswerSet) {
		this.AnswerSet = AnswerSet;
	}
	
	public String getAnswerSet () {
		return this.AnswerSet;
	}
}
