/**
 *
 * @author hebaskhail
 */
package NotificationFactoryPattern;

public class NotificationService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String notificationType = "Slack";  // The type is determined at runtime

        //Scanner input = new Scanner(System.in)
        Notification notification = NotificationFactory.createNotification(notificationType);
        
     
        notification.notifyUser();
    }

}

