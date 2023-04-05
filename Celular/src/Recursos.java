public abstract class Recursos {
    private boolean mensagem;
    private boolean internet;
    private boolean email;
    private boolean radio;
    private boolean tv;
    private boolean arquivo;

    public Recursos(boolean mensagem, boolean internet, boolean email, boolean radio, boolean tv, boolean arquivo) {
        this.mensagem = mensagem;
        this.internet = internet;
        this.email = email;
        this.radio = radio;
        this.tv = tv;
        this.arquivo = arquivo;
    }

    public boolean isMensagem() {
        return mensagem;
    }

    public void setMensagem(boolean mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isArquivo() {
        return arquivo;
    }

    public void setArquivo(boolean arquivo) {
        this.arquivo = arquivo;
    }
}
