package org.projectlombok;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;

public class MyStepdefs {
    String user;
    String sentMessage;
    boolean isSent = false;
    String receivedMessage;
    @Дано("устанавливаю пользователя {string}")
    public void устанавливаюПользователя(String arg0) {
        user = arg0;
    }

    @Когда("отправляю сообщения в VPS иdспользуя {string}")
    public void отправляюСообщенияВVPSИспользуя(String arg0) {
        sentMessage = arg0;
        isSent = true;
    }

    @Тогда("проверяю приходит ответ сообщение {string}")
    public void проверяюПриходитОтветСообщение(String arg0) {
        if (isSent){
            receivedMessage = "отправлено";
        }
        else{
            receivedMessage = "Error";
        }
        Assert.assertEquals(arg0, receivedMessage);
    }
}
