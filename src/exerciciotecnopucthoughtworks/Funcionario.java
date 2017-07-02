/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Classe para OO
 */
package exerciciotecnopucthoughtworks;

/**
 *
 * @author SenacDev
 */
public class Funcionario {
  
       private String nome;
       private Double salario;
       private Double newSal;
       private Double Inss = 10.0;
       private Double SegV = 15.0;
       private Double VR = 11.0;
       private Double VT = 5.0;
       private int data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getNewSal() {
        return newSal;
    }

    public void setNewSal(Double newSal) {
        this.newSal = newSal;
    }

    public Double getInss() {
        return Inss;
    }

    public void setInss(Double Inss) {
        this.Inss = Inss;
    }

    public Double getSegV() {
        return SegV;
    }

    public void setSegV(Double SegV) {
        this.SegV = SegV;
    }

    public Double getVR() {
        return VR;
    }

    public void setVR(Double VR) {
        this.VR = VR;
    }

    public Double getVT() {
        return VT;
    }

    public void setVT(Double VT) {
        this.VT = VT;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public double getBonificacao() {
        return this.salario * 1.2;
  }
}
