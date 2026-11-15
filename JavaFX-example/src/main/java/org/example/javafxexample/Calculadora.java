package org.example.javafxexample;
    public class Calculadora {
        private String pantalla = "0";
        private double numeroGuardado;
        private String op;
        public void escribirDigito(String a){
            if(pantalla.equals("0")) {
                pantalla = a;
            }
            else{
                pantalla = pantalla+a;



            }
        }
        public String getPantalla(){
            return pantalla;
        }
        public void limpiar(){
            pantalla = "0";
            numeroGuardado =0;
            op = null;
        }
        public void operacion(String operacion){
            numeroGuardado = Double.parseDouble(pantalla);
            op = operacion;
            pantalla = "0";
        }
        public void resultadoOperacion(){
            double segundo =Double.parseDouble(pantalla);
            double resultado = 0;
            if ("+".equals(op)){
                resultado = numeroGuardado + segundo;
            }
            if ("-".equals(op)){
                resultado = numeroGuardado - segundo;
            }
            if ("/".equals(op)){
                if (segundo == 0){
                    pantalla = "error";
                    return;
                }
                resultado = numeroGuardado / segundo;

            }
            if ("*".equals(op)){
                resultado = numeroGuardado*segundo;
            }

            pantalla = String.valueOf(resultado);
        }

        public void borrar() {
            if (pantalla.length() == 1) {
                pantalla = "0";
            } else {
                pantalla = pantalla.substring(0, pantalla.length() - 1);
            }
        }

    }

