package lv.javaguru.shop.servlet.mvc;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by maris on 3/29/16.
 */
public interface MVCController {
    MVCModel processRequest(HttpServletRequest req);
}
