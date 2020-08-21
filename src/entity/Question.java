
package entity;

import java.util.Objects;

public class Question {
    private String questionId;
    private String questionContent;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correntAnswer;

    public Question(String questionId, String questionContent, String answerA, String answerB, String answerC, String answerD, String correntAnswer) {
        this.questionId = questionId;
        this.questionContent = questionContent;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correntAnswer = correntAnswer;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public String getCorrentAnswer() {
        return correntAnswer;
    }

    @Override
    public boolean equals(Object obj) {

        final Question other = (Question) obj;
        if (this.questionId.equals(other.questionId)) {
            return true;
        }
        return false;
    }

}
