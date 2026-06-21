package CalculatorService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * @author
 */
@WebService(serviceName = "calculatorservice")
public class calculatorservice {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation to sum two numbers
     * @param num1
     * @param num2
     * @return 
     */
    @WebMethod(operationName = "sum")
    public int sum(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int sum = 0;
        sum = num1 + num2;
        // TODO write your implementation code here
        return sum;
    }
}
