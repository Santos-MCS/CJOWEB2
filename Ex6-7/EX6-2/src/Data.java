// criando a classe com encapsulamento 

import javax.swing.JOptionPane;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    //validação
    public Data(int dia, int mes, int ano) {
        while (dia < 1 || dia > 30) {
            dia = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Dia invalido! Digite outro dia (1-30): "));
        }
        this.dia = dia;

        while (mes < 1 || mes > 12) {
            mes = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Mes invalido! Digite outro mes (1-12):"));
        }
        this.mes = mes;

        while (ano < 1990) {
            ano = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Ano Invalido! Digite outro ano (>= 1990)"));
        }
        this.ano = ano;

        // if (ano >= 1900) {
        //     this.ano = ano;
        // }
    }

    public void setDia(int dia) {

        while (dia < 1 || dia > 30) {

            dia = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Dia inválido! Digite outro dia (1-30):"));
    }
    this.dia = dia;
}



    public int getDia() {
        return dia;
    }

    public  void setMes(int mes){
        while (mes < 1 || mes > 12) {
            mes = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Mes invalidoo! Digite outro mes (1-12)"));
        }
        this.mes = mes;
    }    

   
    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        while (ano < 1990) {
            ano = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Ano Invalido! Digite outro ano (>= 1990)"));
        }
        this.ano = ano;
        

    }

    public int getAno() {
        return ano;
    }




    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }


    
}