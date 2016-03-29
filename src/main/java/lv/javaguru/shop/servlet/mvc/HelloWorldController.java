package  lv.javaguru.shop.servlet.mvc;

import javax.servlet.http.HttpServletRequest;

public class HelloWorldController implements MVCController {
    @Override
    public MVCModel processRequest(HttpServletRequest req) {
        return new MVCModel("/views/helloWorld.jsp", "Hello from MVC");
    }
}