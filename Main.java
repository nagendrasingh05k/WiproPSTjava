package Assignment5;

import java.util.Optional;

interface UserService{

    default String getWelcomeMessage(){
        return "Welcome, Guest!";

    }

    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService{
    
    public Optional<String> getUser(String name){
        return Optional.ofNullable(name);
    }

    public String getPersonalizedWelcomeMessage(String name){

        return getUser(name)
                .map(userName -> "Welcome, " + userName + "!")
                .orElse(getWelcomeMessage());
    }
}
public class Main {
    
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        
        System.out.println(userService.getPersonalizedWelcomeMessage("Nagendra")); 
        System.out.println(userService.getPersonalizedWelcomeMessage(null));
    }
}
