/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration;

/**
 *
 * @author cronos
 */
import net.objecthunter.exp4j.Expression;
public class Simpsons_one_third extends AbstractSolver {
    
    public Simpsons_one_third(Expression f, int n) {
        super(f, n);
    }

    
    @Override
    public double evaluateIntegral(double a, double b) {
        
        if(a>b)
            throw new IllegalArgumentException("INVALID INPUT");
        if(n%2!=0)
        {throw new IllegalArgumentException("INVALID INPUT");}
        double y =(b-a)/n;
        double sum;
        sum = (f.setVariable("x", b).evaluate() +f.setVariable("x", a).evaluate())/3;
        for(int i = 1; i<n; i++)
            if(i % 2 !=0)
               sum+= 4*(f.setVariable("x", a+i*y).evaluate())/3;
            else
               sum+= 2*(f.setVariable("x", a+i*y).evaluate())/3;
    return sum * y; 
}

    
}