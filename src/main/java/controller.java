import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/helloworld")
    public String helloworld(){
        return"hello world";
    }
@RequestMapping("/Add")
    public int add(){
int a=6;
int b=7;
return a+b;
}
@RequestMapping("/multiple")
    public int multiple(){

        int a=5;
        int b=6;
        return a*b;
}


}
