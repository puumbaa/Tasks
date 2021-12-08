package task_01;

import java.util.Arrays;

public class UserTest {
    public static void main(String[] args) {

        User user1 = new User("Ivan", "Ivanov", Role.USER);
        User user2 = new User("Andrew", "Ivanov", Role.MODERATOR);

        User user3 = new User("Mihail", "Ivanov", Role.ADMIN);

//        System.out.println(user1.equals(user3));
//        System.out.println(user1.equals(user3));
        User[] users = {user1, user2};
//        System.out.println(findUser(users, user3));

        Role role = Role.valueOf("USER");
        Role[] roles = Role.values();
        int ordinal = role.ordinal();
        System.out.println(role + " ordinal = " + ordinal);
        System.out.println(Arrays.toString(roles));

   /*     switch (user1.getRole()) {
            case USER -> System.out.println(user1.getFirstName() + " " +user1.getLastName() + " is " + task_01.Role.USER);
            case ADMIN -> System.out.println(user1.getFirstName() + " " +user1.getLastName() + " is " + task_01.Role.ADMIN);
            case MODERATOR -> System.out.println(user1.getFirstName() + " "+ user1.getLastName() + " is " + task_01.Role.MODERATOR);
        }*/

    }

    public static User findUser(User[] users, User targetUser) {
        User result = null;
        for (User user : users) {
            if (user.equals(targetUser)) {
                result = user;
            }
        }
        if (result == null) throw new UserNotFoundException("Пользователя нет в массиве");
        return result;
    }
}
