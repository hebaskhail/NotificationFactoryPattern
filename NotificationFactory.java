/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NotificationFactoryPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hebaskhail
 */
public class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Notification type cannot be null or empty");
        }

       String className = "NotificationFactoryPattern." + type + "Notification" ;
       
        try {
            return (Notification) Class.forName(className).newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotificationFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NotificationFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NotificationFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return null;
        }
}
