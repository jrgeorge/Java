public class CodificadorEnteros
{
   int n1, n2, n3, n4;
   
   public void establecerNumero(int n)
   {
      n1=n/1000;
      n2=(n-(n1*1000))/100;
      n3=(n-((n1*1000)+(n2*100)))/10;
      n4=n-((n1*1000) + (n2*100) + (n3*10));
      codificar();
   }
   private int sumar(int numero)
   {
      return (numero + 7);
   }
   
   private int residuo(int numero)
   {
      int r;
      r=numero%10;
      return r;
   }
   private void codificar()
   {
      n1=sumar(n1);
      n2=sumar(n2);
      n3=sumar(n3);
      n4=sumar(n4);
      
      n1=residuo(n1);
      n2=residuo(n2);
      n3=residuo(n3);
      n4=residuo(n4);
      
      intercambiarNumeros();
   }
   private void intercambiarNumeros()
   {
      int temp;
      
      temp=n1;
      n1=n4;
      n4=temp;
      
      temp=n2;
      n2=n3;
      n3=temp;    
   }
   public void verNumero()
   {
      System.out.printf("%d %d %d %d",n1,n2,n3,n4);
   }
}