// SOAP : Simple Object Access Protocol ....
// JAX-WS (Java Annotation XML for Web Service)
// JAXB (Java Architecture XML Building)
// URL : Uniforme Resource Locator
// URN : Uniforme Resource Name
// URI : UNIFORME Resource Identifier ...
// URN+URL = URI


import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.fr")
public class MonserviceWeb {

  @WebMethod(operationName = "Convertir")
  public double conversion(double mt){
    return mt*0.9;
  }
  public double somme(@WebParam(name = "parametre1") double a, double b){
    return a+b;
  }
  
  public Etudiant getEtudiant(int identifiant){
    return new Etudiant(1, " luigi",  19);
    
  }
}
