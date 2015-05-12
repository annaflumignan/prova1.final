
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao1 {

    public static void main(String[] args) 
    {
        Complexo[] x = new Complexo[2];
        Complexo a = new Complexo(1.0 , 0.0);
        Complexo b = new Complexo(5.0, 0.0);
        Complexo c = new Complexo (4.0, 0.0);
        x = raizesEquacao(a,b,c);
        
        System.out.print("x1 = ");
        System.out.println(x[0].toString());
        System.out.print("x2 = ");
        System.out.println(x[1].toString());
        Complexo d = new Complexo (2.0 , 0.0);
        
        x = raizesEquacao(a, d, b);
        System.out.print("y1 = ");
        System.out.println(x[0].toString());
        System.out.print("y2 = ");
        System.out.println(x[1].toString());
    }
    
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c)
    {       
        Complexo[] raizes = new Complexo[2];
        Complexo[] raiz = new Complexo[2];
        raiz = (b.prod(b).soma(a.prod(-4.0).prod(c)).sqrt());
        raizes[0]= ((b.prod(-1).soma(raiz[0])).div(a.prod(2.0)));
        raizes[1]= ((b.prod(-1).soma(raiz[1])).div(a.prod(2.0)));
        return raizes;
        
    }
    
}
