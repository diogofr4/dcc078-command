public class AcenderLampadaTarefa implements Tarefa{
    private Lampada lampada;

    public AcenderLampadaTarefa(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.acenderLampada();
    }

    public void cancelar() {
        this.lampada.apagarLampada();
    }
}
