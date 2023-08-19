public abstract class NotificacionBase implements Notificacion {
    protected String destinatario;

    public NotificacionBase(String destinatario) {
        this.destinatario = destinatario;
    }
}

