package task_01;

public enum Role {
    USER("Пользователь"),
    ADMIN("Администратор"),
    MODERATOR("Модератор");

    private String translation;

    Role() {}

    Role(String translation) {
        this.translation = translation;
    }
}
