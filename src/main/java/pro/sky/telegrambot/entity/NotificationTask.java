package pro.sky.telegrambot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class NotificationTask {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long chatId;
    private String text;
    private LocalDateTime execDate;

    public NotificationTask(Long chatId, String text, LocalDateTime execDate) {
        this.chatId = chatId;
        this.text = text;
        this.execDate = execDate;
    }

    public NotificationTask() {
    }

    public Long getId() {
        return id;
    }

    public Long getChatId() {
        return chatId;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getExecDate() {
        return execDate;
    }
}
