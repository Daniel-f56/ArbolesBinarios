package com.mycompany.arbolesbinarios;

import javax.swing.JOptionPane;

//Clase para contruir los nodos
public class Nodo {
    
    int valor;
    Nodo nodoIzq;
    Nodo nodoDerecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.nodoDerecho = null;
        this.nodoIzq = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    //Funcion para agtregar un nodo a la derecha si es mayor y a la izquierda si es menor
    public void insertar(int _valor){
        //if para comprobar que el valor no se repita
        if(_valor == this.valor){
            JOptionPane.showMessageDialog(null, "Ese numero ya esta en el arbol");
            return;
        }
        
        if(_valor < this.valor){
            //Insertar en lado izquierdo
            if(this.nodoIzq == null){
                this.nodoIzq = new Nodo(_valor);
            } else {
                this.nodoIzq.insertar(_valor);
            }
        } else {
            //Insertar en lado derecho
            if(this.nodoDerecho == null){
                this.nodoDerecho = new Nodo(_valor);
            } else {
                this.nodoDerecho.insertar(_valor);
            }
        }
    }
}
