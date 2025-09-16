package atividade;

public class NotificacaoSMS extends Notificacao{
    
    public NotificacaoSMS(String mensagem){
        super(mensagem); // Referencia a classe pai
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS: " + this.getMensagem());
    }
}