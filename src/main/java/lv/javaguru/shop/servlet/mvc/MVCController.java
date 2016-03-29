package lv.javaguru.shop.servlet.mvc;

import javax.servlet.http.HttpServletRequest;

public interface MVCController {
    MVCModel processRequest(HttpServletRequest req);
}
