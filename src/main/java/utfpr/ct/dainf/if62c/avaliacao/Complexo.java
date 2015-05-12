package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */ 
public class Complexo 
{
    private double real;
    private double img;

    public Complexo(double real, double img) 
    {
       this.real= real;
       this.img= img;
    }

    public double getReal()
    {
       return real;
    }

    public double getImg()
    {
       return img;
    }

    public Complexo soma(Complexo c) 
    {
       return new Complexo(real + c.real, img + c.img);
    }
    
    public Complexo sub(Complexo c)
    {
       return new Complexo (real- c.real, img - c.img);
    }

    public Complexo prod(double a)
    {
       return new Complexo (a*real, a*img);
    }

    public Complexo prod(Complexo c)
    {
       return new Complexo (real*real-img*img, 2*real*img);
    }
    
    public Complexo div(Complexo c)
    {
       double div = c.real*c.real +c.img*c.img;
       return new Complexo(((real*c.real+img*c.img)/div), ((c.real*img -real*c.img)/div));
    }
    
    public Complexo[] sqrt() 
    {
       Complexo[] raiz = new Complexo[2];
       
       double z = Math.sqrt(Math.sqrt((real*real) + (img*img)));
       double ang = 0.0;
        
       if (real > 0)
           ang = Math.atan(img/real);
        
       else if (real < 0)
           ang = Math.atan(img/real) + Math.PI;
        
       else if(real == 0.0 && img == 0.0)
           ang = 0;
        
       else if(real == 0.0 && img < 0)
           ang = 3.0*Math.PI/2.0;
              
       else if(real == 0.0 && img > 0)
           ang = Math.PI/2.0;
        

        
       raiz[0] = new Complexo((z*Math.cos(ang/2.0)),(z*Math.sin(ang/2.0)));
       raiz[1] = new Complexo((z*Math.cos((ang+Math.PI)/2.0)),(z*Math.sin((ang+Math.PI)/2)));
        
       return  raiz; 
    }
  

    @Override
    public int hashCode() 
    {
       int hash = 5;
       hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
       hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
       return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
       final Complexo c = (Complexo) obj;
       return obj != null && getClass() == obj.getClass() && real == c.real && img == c.img;
    }

    @Override
    public String toString() 
    {
       return String.format("%+f %+fi", real, img);
    }
    
}
