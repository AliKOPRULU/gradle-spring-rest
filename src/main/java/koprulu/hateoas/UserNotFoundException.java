package koprulu.hateoas;

/**
 * Created by Ali on 23.11.2016.
 */
class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String userId) {
        super("could not find user '" + userId + "'.");
    }
}
