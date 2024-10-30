public class PruebaDecodificador
{
   public static void main (String args[])
   {
      int numero=6879;
      DecodificadorEnteros de = new DecodificadorEnteros();
      de.establecerNumero(numero);
      System.out.println();
      de.verNumero();
   }
}