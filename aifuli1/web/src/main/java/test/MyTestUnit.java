package test;

import com.aifuli.pojo.vo.StudentVo;
import com.aifuli.service.UserService;
import com.aifuli.web.TenantWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TenantWebApplication.class)
//@WebAppConfiguration
public class MyTestUnit {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        StudentVo student = userService.getStudentList().get(0);
        return;
    }
}
