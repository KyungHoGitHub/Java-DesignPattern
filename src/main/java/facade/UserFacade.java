package facade;

public class UserFacade {
    private UserService  userService;
    private EmailService emailService;
    private LogService logService;


    public UserFacade(){

    }

    public UserFacade(UserService userService, EmailService emailService, LogService logService){
        this.userService = userService;
        this.emailService = emailService;
        this.logService = logService;
    }

    public void createUser(String username, String email){
        // ... 유저 생성시 처리되는 메소드 추가
        userService.createUser(username,email);
        emailService.sendWelcomeEmail(email);
        logService.logUserCreation(username);
    }
}
