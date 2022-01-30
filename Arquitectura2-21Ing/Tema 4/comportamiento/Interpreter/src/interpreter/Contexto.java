/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author Carlos
 */
class Contexto {

    private String siguienteOp = "";
    private int operador = 0;
    private int resultado = 0;

    public int getInteger(String in) {

        if (in.toLowerCase().equals("cero")) {
            return 0;
        } else if (in.toLowerCase().equals("uno")) {
            return 1;
        } else if (in.toLowerCase().equals("dos")) {
            return 2;
        } else if (in.toLowerCase().equals("tres")) {
            return 3;
        } else if (in.toLowerCase().equals("cuatro")) {
            return 4;
        } else if (in.toLowerCase().equals("cinco")) {
            return 5;
        } else if (in.toLowerCase().equals("seis")) {
            return 6;
        } else if (in.toLowerCase().equals("siete")) {
            return 7;
        } else if (in.toLowerCase().equals("ocho")) {
            return 8;
        } else if (in.toLowerCase().equals("nueve")) {
            return 9;
        } else {
            return -1;
        }

    }

    public void setOperador(int operador) {

        this.operador = operador;

    }

    public void setOperacion(String operacion) {

        if (operacion.toLowerCase().equals("mas")) {
            this.siguienteOp = "+";
        } else if (operacion.toLowerCase().equals("menos")) {
            this.siguienteOp = "-";
        }

    }

    public void calcular() {

        if (this.siguienteOp.toLowerCase().equals("")
                || this.siguienteOp.toLowerCase().equals("+")) {
            this.resultado += operador;
        } else if (this.siguienteOp.toLowerCase().equals("-")) {
            this.resultado -= operador;
        }

    }

    public int getResultado() {

        return this.resultado;

    }
}
