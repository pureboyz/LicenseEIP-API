package pw.pureboyz.vo;

public class QuestionVO
{
	int questionId;
	String round;
	String chapter;
	String question;
	String useImage;
	String imagePath;
	String createDate;
	String updateDate;
	String deleteDate;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getUseImage() {
		return useImage;
	}
	public void setUseImage(String useImage) {
		this.useImage = useImage;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}
	
	public String toJSONString() {
		return "\"questionId\"=\"" + questionId + "\", \"round\"=\"" + round + "\", \"chapter\"=\"" + chapter + "\", \"question\"=\""
				+ question + "\", \"useImage\"=\"" + useImage + "\", \"imagePath\"=\"" + imagePath + "\", \"createDate\"=\"" + createDate
				+ "\", \"updateDate\"=\"" + updateDate + "\", \"deleteDate\"=" + deleteDate + "\"";
	}
	
}
