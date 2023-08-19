public class CorreoElectronico extends NotificacionCorreo {
    public CorreoElectronico(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviarNotifaciones(String mensaje) {
        // Lógica para enviar correo electrónico
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }


}
