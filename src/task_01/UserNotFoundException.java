package task_01;

public class UserNotFoundException extends RuntimeException{
    // throw new task_01.UserNotFoundException("message")

    UserNotFoundException(String message){
        super(message);
    }
}
