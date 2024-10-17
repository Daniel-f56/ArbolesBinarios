package com.mycompany.arbolesbinarios;

import javax.swing.JOptionPane;

public class Arbol {
    
    Nodo inicial;
    
    public void Arbol(){
        this.inicial = null;
    }
    
    public void insertar(){
        String valor = JOptionPane.showInputDialog(null, "Ingrese el valor que va a ingresar");
        try{
            int numero = Integer.parseInt(valor);
            if(this.inicial == null){
                this.inicial = new Nodo(numero);
            } else {
                this.inicial.insertar(numero);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "El dato que ingreso no es valido, porfavor solamente ingrese numeros enteros");
        }
        
    }
    
    //Estos dos metodos son para imprimir por consola todo el arbol en un orden especifico, el cual es, raiz luego izquierda y luego derecha
    public String dispararPreorden(){
        return preorden(this.inicial);
    }

    public String preorden(Nodo nodo){
        if(nodo == null){
            return ""; // Caso base
        } else {
        // Concatenamos el valor actual y llamamos recursivamente a la izquierda y derecha
        String resultado = nodo.getValor() + ", ";
        resultado += preorden(nodo.getNodoIzq());
        resultado += preorden(nodo.getNodoDerecho());
        return resultado;
        }
    }
    
    
    //Estos dos metodos son para imprimir por consola todo el arbol en un orden especifico, el cual es (creo), izquierdo, raiz y luego derecho
    public String dispararInorden(){
        return inorden(this.inicial);
    }
    
    public String inorden(Nodo nodo){
        if(nodo == null){
            return ""; // Detener recursividad caso base
        } else {
            String resultado = nodo.getValor() + ", ";
            resultado += inorden(nodo.getNodoIzq());
            resultado += inorden(nodo.getNodoDerecho());
            return resultado;
        }
    }
    
    
    //Estos dos metodos son para imprimir por consola todo el arbol en un orden especifico, el cual es (creo), izquierdo, derecho y raiz
    public void dispararPostorden(){
        this.postorden(this.inicial);
    }
    
    public void postorden(Nodo nodo){
        if(nodo == null){
            return; // Detener recursividad caso base
        } else {
            postorden(nodo.getNodoIzq());
            postorden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+", ");
            
        }
    }
}
