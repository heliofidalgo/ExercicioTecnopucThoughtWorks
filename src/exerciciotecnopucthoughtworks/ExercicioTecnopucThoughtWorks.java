/* REQUISITOS DO EXERCICIO
* O grupo de empreendedores necessita saber o valor do salário total (salário + custos) sobre o colaborador. 
* Os custos da startup que serão somados no salário são as seguintes:
* INSS: 10%
* Seguro de Vida: 15%
* Vale Refeição: 11%
* Vale Transporte: 5%
* TOTAL de IMPOSTOS / SALARIOS / GERAL
* Bonificação anual (BÔNUS)
* Não usar INTERFACE / BIBLIOTECAS EXTERNAS / SEM PERGUNTAS
*  -- Linguagem ecolhida: JAVA para construção de exercicio proposto --
*  -- FALTOU TEMPO para implementação das classes para orientação a objetos, ainda aprendendo e fim de semestre e correria.
*  -- BUG na inserção do segundo NOME com SOBENOME.
 */
package exerciciotecnopucthoughtworks;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SenacDev
 */
public class ExercicioTecnopucThoughtWorks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Funcionario novofun;
        //novofun = new Funcionario();
        
        String nome1 = null;
        Double salario1 = null;
        String nome2 = null;
        Double salario2 = null;
        Double Inss = 10.0;
        Double SegV = 15.0;
        Double VR = 11.0;
        Double VT = 5.0;
        Double Result = null;
        Double Result1 = null;
        Double ST;
        Double STi;
        Double STsl;
        Double SG;
        Date Date = null;
  
        // funcionario 1
        System.out.print("Nome do Funcionário 1: ");
        nome1 = ler.nextLine();
        System.out.print("Informe o Salário do funcinário 1: ");
        salario1 = ler.nextDouble();
        
        
        Result =  (salario1 * Inss)/100;
        System.out.println(nome1+": Valor do INSS: R$"+Result);
        
        Result =  (salario1 * SegV)/100;
        System.out.println(nome1+":Valor do Seguro de Vida: R$"+Result);
        
        Result =  (salario1 * VR)/100;
        System.out.println(nome1+":Valor do Vale Refeição: R$"+Result);
        
        Result =  (salario1 * VT)/100;
        System.out.println(nome1+":Valor do Vale Transporte: R$"+Result);
        
        ST = salario1 + ((salario1 * Inss)/100)+ ((salario1 * SegV)/100)+ ((salario1 * VR)/100)+((salario1 * VT)/100);
        System.out.println(" Salário do funcionário "+nome1+" é de: "+ST);
        
        
        //funcionario 2
        System.out.print("Nome do Funcionário 2: ");
        nome2 = ler.nextLine();
        System.out.print("Informe o Salário do funcinário 2: ");
        salario2 = ler.nextDouble();
        
        Result1 =  (salario2 * Inss)/100;
        System.out.println(nome2+": Valor do INSS: R$"+Result1);
        
        Result1 =  (salario2 * SegV)/100;
        System.out.println(nome2+":Valor do Seguro de Vida: R$"+Result1);
        
        Result1 =  (salario2 * VR)/100;
        System.out.println(nome2+":Valor do Vale Refeição: R$"+Result1);
        
        Result1 =  (salario2 * VT)/100;
        System.out.println(nome1+":Valor do Vale Transporte: R$"+Result1);
        
        ST = salario2 + ((salario2 * Inss)/100)+ ((salario2 * SegV)/100)+ ((salario2 * VR)/100)+((salario2 * VT)/100);
        System.out.println(" Salário total do funcionário "+nome2+" é de: "+ST);
        
        STsl = (salario1 + salario2);
        System.out.println(" TOTAL SALARIOS: "+STsl);
        
        STi = ((salario1 * Inss)/100) +((salario2 * Inss)/100)+((salario1 * SegV)/100)+((salario2 * SegV)/100)+((salario1 * VR)/100)+((salario2 * VR)/100)+((salario1 * VT)/100)+((salario2 * VT)/100);
        System.out.println(" TOTAL IMPOSTOS: "+STi);
        
        SG = (STi + STsl);
        System.out.println(" TOTAL GERAL: "+SG);
        
  }
    
}
