
package SWING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class PullApiData {
    
    public double getRateEuro() { 
      double valueEuro=0;
      try{      
      URL urlEuro = new URL ("http://api.nbp.pl/api/exchangerates/rates/A/eur/?format=JSON");
      URLConnection con = urlEuro.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null; 
            
      while ((line = br.readLine()) !=null){
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      valueEuro = Double.parseDouble(numbers);            
      }     
      }
      catch(IOException e){
      System.out.println("Nie działa");
      }
      return valueEuro;
    }
    public double getRateDollar() {
      double valueDollar=0;
      try{
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/A/usd/?format=JSON");
      URLConnection con = urlDollar.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;      
      
      while ((line = br.readLine()) !=null){
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      valueDollar = Double.parseDouble(numbers);
      }
      }
      catch(IOException e){
      System.out.println("Nie działa");
      }  
      return valueDollar;  
    }  
    
    public double getRateFunt(){
      double valueFunt=0;
      try{
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/a/gbp/?format=json");
      URLConnection con = urlDollar.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;
      
      while ((line = br.readLine()) !=null){
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      valueFunt = Double.parseDouble(numbers);     
      }
      }
      catch(IOException e){
      System.out.println("Nie działa");
      } 
      return valueFunt;
    } 
    
}
