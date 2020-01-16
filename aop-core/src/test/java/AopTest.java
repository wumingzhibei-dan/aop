import com.sdd.aop.service.UserLoginService;
import com.sdd.common.bean.LoginResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopTest {

    @Autowired
    private UserLoginService userLoginService;

    @Test
    public void testLoginAop() {
        LoginResult sdd = userLoginService.login("sdd", "123");
        System.out.println(sdd.toString());
    }
}
