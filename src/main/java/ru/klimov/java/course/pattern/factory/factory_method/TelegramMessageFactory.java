package ru.klimov.java.course.pattern.factory.factory_method;

public class TelegramMessageFactory extends MessageFactory {
    @Override
    public Message createMessage(String typeMessage) {
        return switch (typeMessage) {
            case "voice" -> new VoiceMessage();
            case "classic" -> new ClassicMessage();
            case "video" -> new VideoMessage();
            default -> throw new RuntimeException("Unknown message type: " + typeMessage);
        };
    }
}
