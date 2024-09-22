package facade;

public class UserService {
    public void createUser(String username, String email){
        System.out.println("사용자"+ username + "이메일" + email + "정보를 데이터베이스에 저장");
    }
}
