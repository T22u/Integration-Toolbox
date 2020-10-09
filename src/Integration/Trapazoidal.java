/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration;
import net.objecthunter.exp4j.Expression;

/**
 *
 * @author cronos
 */
public class Trapazoidal extends AbstractSolver{
    public Trapazoidal(Expression f,int n){
        super(f,n);
        
    }

    @Override
    public double evaluateIntegral(double a, double b) {
        if(a>b)
            throw new IllegalArgumentException();
        double y =(b-a)/n;
        
                double sum;
        sum = (f.setVariable("x", b).evaluate() +f.setVariable("x", a).evaluate())/2;
for(int i=1; i<n; i++)
    sum+=f.setVariable("x", a+i*y).evaluate();
 return sum * y; 
    }
}