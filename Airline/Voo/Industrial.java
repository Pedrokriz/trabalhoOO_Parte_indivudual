package Voo;

import Manupulacao.Cargo;
import Manupulacao.Employee;
import Excessoes.InvalidBookingException;
import Manupulacao.Payload;
import Manupulacao.Person;

public class Industrial extends Flight 
{
  public Industrial()
  {
     id = 200000000 +getID();
  }

    /**
     *
     * @param payload
     * @throws InvalidBookingException
     */
  @Override
  public void book(Payload payload)  throws InvalidBookingException
  {
    if(((payload instanceof Cargo) || (payload instanceof Employee)) && !(payload instanceof Person) )
    {
      super.book(payload);
    }
    else
      throw new InvalidBookingException ("Reserva Invalida");
  }
  
  public String toString()
  {
    return ("Voo Industrial " + super.toString());
  }
}