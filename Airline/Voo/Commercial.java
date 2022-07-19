package Voo;

import Excessoes.InvalidBookingException;
import Manupulacao.Payload;
import Manupulacao.Person;

public class Commercial extends Flight
{
  public Commercial()
  {
     id = 100000000 + getID();
  }
  
  public void book(Payload payload)  throws InvalidBookingException
  {
    if (payload instanceof Person)
    {
     super.book(payload);
    }
    else
      throw new InvalidBookingException ("Reserva Invalida");
  }
  
  public String toString()
  {
    return ("Voo Comercial " + super.toString());
  }
}