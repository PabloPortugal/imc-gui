package br.senai.sp.jandira.model;

public class CalculadoraIMC {

   private double altura, peso, imc;
   private String estadoDoIMC;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcularIMC(){
        this.imc = getPeso() / Math.pow(getAltura(),2);
    }

    public double getIMC(){
        return imc;
    }

    public String getEstadoDoIMC(){
        if (this.imc > 40) {
            return "Obesidade grau 3 (mórbida)";
        } else if (this.imc >= 35) {
            // se for menor ou igual a 40, não vai entrar no primeiro if
            // então se chegou aqui é porque com certeza não é maior que 40
            // por isso não precisa verificar isso de novo, basta verificar a nova condição
            // (se é maior ou igual a 35)
            return "Obesidade grau 2 (severa)";
        } else if (this.imc >= 30) {
            // se for menor ou igual a 35, não vai entrar no primeiro e nem no segundo if
            // então se chegou aqui é porque com certeza não é maior que 35
            // por isso não precisa verificar isso de novo, basta verificar a nova condição
            // (se é maior ou igual a 30)
            return "Obesidade grau 1";
        } else if (this.imc >= 25) {
            return "levemente acima do peso";
        } else if (this.imc >= 18.6) {
            return "Peso ideal parabéns";
        } else {
            return "abaixo do peso";
        }
    }

}
