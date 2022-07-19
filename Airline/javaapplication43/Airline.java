package javaapplication43;

import Excessoes.InvalidInputException;
import Manupulacao.Payload;
import Voo.Flight;
import Voo.Industrial;
import Voo.Commercial;
import java.io.*;
import java.util.ArrayList;
public class Airline {
  ArrayList<Payload> payloads = new ArrayList<Payload>();
  ArrayList<Flight> flights = new ArrayList<Flight>();
  
  public Airline(AvaliacaoOO2022 a)
  {
      AvaliacaoOO2022 Avaliacao = a;
      try{
          FileWriter fw = new FileWriter("C:\\\\Users\\\\usuario\\\\Documents\\\\NetBeansProjects\\\\JavaApplication43\\\\src\\\\javaapplication43\\\\avaliacaoOO.txt");
          BufferedWriter bw = new BufferedWriter(fw);
          System.out.println(Avaliacao.matricula);
          bw.append("Nome: " + Avaliacao.nome + ", Matricula: " +Avaliacao.matricula + ", Nota: " + Avaliacao.nota+ "\n");
          bw.flush();
          bw.close();
      }catch(IOException e){
          System.out.println("AvaliacaoOO2022NaoInformadaException");
      }
  }

    Airline() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
  public String addFlight(char type) throws InvalidInputException
  {
    if (type == 'I')
    {
      Flight flight = new Industrial();
      flights.add(flight);
      return (flight.toString());
    }
    else if (type == 'C')
    {
      Flight flight = new Commercial();
      flights.add(flight);
      return (flight.toString());
    }
    else
      throw new InvalidInputException ("Entrada Invalida"); 
  }
  
  public Flight getFlight(int id)
  {
    
    for (int i = 0; i< flights.size();i++)
    {
      if(flights.get(i).id == id)
      {
        return flights.get(i);
      }
    }
    return null;
  }
  
  public void addPayload (Payload thePayload)
  {
    payloads.add(thePayload);
  }
  
  public Payload getPayload(int id)
  {
    for (int i = 0;i<payloads.size();i++)
    {
      if(payloads.get(i).id == id)
        return payloads.get(i);
    }
    return null;
  }
}


