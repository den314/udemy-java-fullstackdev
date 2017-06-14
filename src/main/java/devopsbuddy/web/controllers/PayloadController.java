package devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author TheDioniz, created on 13.06.2017.
 */
@Controller
public class PayloadController {

    public static final String PAYLOAD_VIEW_NAME = "payload/payload";

    @RequestMapping("/payload")
    public String payload() {
        return PAYLOAD_VIEW_NAME;
    }
}