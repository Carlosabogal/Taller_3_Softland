 public class MensajeTexto extends NotificarTexto {
    public MensajeTexto(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviarNotifaciones(String mensaje) {
        // Lógica para enviar mensaje de texto
        System.out.println("Enviando mensaje de texto a " + destinatario + ": " + mensaje);
    }
}

