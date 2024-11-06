import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDecorator extends MessageDecorator {

    public DateDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return addDate(message.getContent());
    }

    private String addDate(String content) {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return "[" + date + "] " + content;
    }
}
