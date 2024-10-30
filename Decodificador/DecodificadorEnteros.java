public class DecodificadorEnteros
{
   int n1, n2, n3, n4;
   
   public void establecerNumero(int n)
   {
      n1=n/1000;
      n2=(n-(n1*1000))/100;
      n3=(n-((n1*1000)+(n2*100)))/10;
      n4=n-((n1*1000) + (n2*100) + (n3*10));
      decodificar();
   }
   
   private int dividendo(int numero)
   {
     return (numero+10);
   }
   
   private int restar(int numero)
   {
      numero=numero-7;
      if (numero>9)
         numero=numero-10;
      return numero;
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
   private void decodificar()
   {
      n1=dividendo(n1);
      n2=dividendo(n2);
      n3=dividendo(n3);
      n4=dividendo(n4);
      
      n1=restar(n1);
      n2=restar(n2);
      n3=restar(n3);
      n4=restar(n4);
      
      intercambiarNumeros();
   }
   public void verNumero ()
   {
      System.out.printf("%d %d %d %d",n1,n2,n3,n4);
   }
}