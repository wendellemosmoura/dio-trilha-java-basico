public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume  = 25;

    public void ligar() {
        ligada = true;
        System.out.println("SmartTv ligada");
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Novo canal: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal aumentado para: " + canal);        
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal dimuinido para: " + canal);        
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume dimuinido para: " + volume);
    }
}
