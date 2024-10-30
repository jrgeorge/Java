public class PruebaCodificador
{
   public static void main(String args[])
   {
      int numero;
      CodificadorEnteros ce = new CodificadorEnteros();
      numero=2019;
      ce.establecerNumero(numero);
      System.out.println();
      ce.verNumero();
   }
}