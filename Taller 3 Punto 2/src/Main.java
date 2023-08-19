public class Main {
    public static void main(String[] args) {

        Notificacion correo = new CorreoElectronico("csabogal@gma.com");
        Notificacion mensajeTexto = new MensajeTexto("12345");
        Notificacion push = new NotificacionPush();

        correo.enviarNotifaciones("Desarollador de softland");
        mensajeTexto.enviarNotifaciones("Hola");
        push.enviarNotifaciones("Actualizacion");

    }
}