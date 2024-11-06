public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("Це тестове повідомлення для декоратора.");

        System.out.println("Оригінальне повідомлення: " + message.getContent());

        message = new EncryptionDecorator(message);
        System.out.println("Після шифрування: " + message.getContent());

        message = new DateDecorator(message);
        System.out.println("Після додавання дати: " + message.getContent());

        message = new AuthorDecorator(message);
        System.out.println("Після додавання автора: " + message.getContent());

        message = new CompressionDecorator(message);
        System.out.println("Після стиснення: " + message.getContent());
    }
}
