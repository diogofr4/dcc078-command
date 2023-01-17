public class Lampada {
    private String cor;
    private int intensidade;
    private String estado;

    public Lampada(String cor, int intensidade) {
        this.cor = cor;
        this.intensidade = intensidade;
    }

    public String getEstado() {
        return estado;
    }

    public void acenderLampada() {
        this.estado = "Lâmpada acesa";
    }

    public void apagarLampada() {
        this.estado = "Lâmpada apagada";
    }
}
