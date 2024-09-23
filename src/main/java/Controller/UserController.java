package Controller;

import facade.UserFacade;

public class UserController {
    private UserFacade userFacade = new UserFacade();

    public String createUser(String username, String email){
            userFacade.createUser(username, email);
            return "success";
    }
}
