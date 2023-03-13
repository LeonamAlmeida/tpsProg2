package exercicio_02;

public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String destinatario){
        this.destinatario = destinatario;
    }
    @Override
    public void showMessage(){
        System.out.println("Bom dia " + destinatario + " feliz dia dos namorados, tamo junto");
    }
}
