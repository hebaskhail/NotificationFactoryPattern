/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NotificationFactoryPattern;

/**
 *
 * @author hebaskhail
 */
public class PushNotification implements Notification {
      @Override
      public void notifyUser() {
        System.out.println("Sending a push notification...");
    }

    public PushNotification() {
    }
}



