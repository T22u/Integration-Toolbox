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


public abstract class AbstractSolver implements IntegrationSolver{
    protected Expression f;
    protected int n;
    public AbstractSolver(Expression f,int n){
        if(f==null||n<=0)
            throw new IllegalArgumentException();
        this.f=f;
        this.n=n;
       
    }
    public void setN(int n){
        if(n<=0)
            throw new IllegalArgumentException();
        this.n=n;
        
    }

    
}