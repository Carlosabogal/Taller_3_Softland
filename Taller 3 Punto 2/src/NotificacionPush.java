public class NotificacionPush implements Notificacion {
    @Override
    public void enviarNotifaciones(String mensaje) {
        // Lógica para enviar notificación push
        System.out.println("Enviando notificación push: " + mensaje);
    }
}
