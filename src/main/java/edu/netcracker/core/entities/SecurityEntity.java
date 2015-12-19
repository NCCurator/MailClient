package edu.netcracker.core.entities;

import edu.netcracker.core.api.Security;

/**
 * This class is for managing security question and answer
 * TODO Класс предназначен для востановления пароля от своей учетной записи по вспомогательному вопросу, заданому при регистрации учетной записи пользователя
 *
 * @author Miroshnichenko Yuriy
 *         Date 14.12.2015.
 */

public class SecurityEntity extends AbstractEntity implements Security {

    /**
     * Question for security answer
     */
    private String question;

    /**
     * Answer for security question
     */
    private String answer;

    // TODO конструктор с проставлением значений полям класса

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }
}
