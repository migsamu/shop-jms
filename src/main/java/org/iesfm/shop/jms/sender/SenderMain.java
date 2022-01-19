package org.iesfm.shop.jms.sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SenderMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SenderMain.class, args);

    }

}
/*
1. Controlador de usuarios. Por cada usuario debemos guardar username, phone e email

a. Alta de usuario POST /users

i. Cuando se invoca el alta se mandará un email con este formato

1. Titulo: Bienvenido <username>

2. To: <email>

3. Body: Gracias por registrate <username>

2. Debe haber otro proceso EmailListener. Imprimir en pantalla el email
*/