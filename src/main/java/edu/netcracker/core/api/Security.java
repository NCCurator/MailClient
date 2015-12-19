package edu.netcracker.core.api;

/**
 * This interface is for managing security question and answer TODO интерфейс содержит методы для получения или изменения
 * контрольного вопроса пользователя при востановлении пароля от учетной записи
 *
 * @author Miroshnichenko Yuriy
 *         Date 14.12.2015.
 */
public interface Security {

    // TODO метод getId

    /**
     * TODO пояснение, что делает метод
     *
     * @return answer for security question
     */
    String getAnswer();

    /**
     * TODO пояснение, что делает метод
     *
     * @return question for security answer
     */
    String getQuestion();

    /**
     * TODO пояснение, что делает метод
     *
     * @param answer Sets answer for security question TODO описание аргумента метода
     */
    void setAnswer(String answer);

    /**
     * TODO пояснение, что делает метод
     *
     * @param question Sets question for security answer TODO описание аргумента метода
     */
    void setQuestion(String question);
}
