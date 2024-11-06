public class EncryptionDecorator extends MessageDecorator {

    public EncryptionDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return encrypt(message.getContent());
    }

    private String encrypt(String content) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}
