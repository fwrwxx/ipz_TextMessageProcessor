public class CompressionDecorator extends MessageDecorator {

    public CompressionDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return compress(message.getContent());
    }

    private String compress(String content) {
        return content.replaceAll("\\s+", " ");
    }
}
