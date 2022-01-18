package org.iesfm.shop.jms;

import org.iesfm.shop.jms.pojos.Email;
import org.iesfm.shop.jms.pojos.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private JmsTemplate jmsTemplate;

    public UserController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/users")
    public void createUser(@RequestBody User user) {
        log.info(user.toString());
        Email email = new Email(
                "Bienvenido " + user.getUsername(),
                user.getEmail(),
                "Gracias por registrarte " + user.getUsername()
        );
        jmsTemplate.convertAndSend("emails", email);
    }
}
