package program2;

import com.sun.xml.internal.ws.api.model.CheckedException;

public class InvalidAgeException extends Exception  {
    InvalidAgeException(String message){
        super(message);
    }
}
