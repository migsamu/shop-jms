package org.iesfm.shop.jms.receiver;

import org.iesfm.shop.jms.pojos.Email;
import org.iesfm.shop.jms.sender.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;

public class EmailListener {

    private static final Logger log = LoggerFactory.getLogger(EmailListener.class);

    @JmsListener(destination = "shop_emails")
    public void onMessage(Email email) {
        log.info("Enviando email" + email.toString());
    }

}
