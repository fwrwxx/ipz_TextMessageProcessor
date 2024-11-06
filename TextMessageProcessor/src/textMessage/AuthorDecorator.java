public class AuthorDecorator extends MessageDecorator {

    public AuthorDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return addAuthor(message.getContent());
    }

    private String addAuthor(String content) {
        String author = "Автор: Штифлюк Ольга Володимирівна";
        return content + " (" + author + ")";
    }
}
