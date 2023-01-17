public class ApagarLampadaTarefa implements Tarefa{
    private Lampada lampada;

    public ApagarLampadaTarefa(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.apagarLampada();
    }

    public void cancelar() {
        this.lampada.acenderLampada();
    }
}
