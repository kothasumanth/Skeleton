package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;


public class App
{
    public static void main(String[] args)
    {
        String xmlString = "<employee>" +
                //"    <department>" +
                //"        <id>101</id>" +
                //"        <name>IT</name>" +
                //"    </department>" +
                "    <firstName>Lokesh</firstName>" +
                //"    <id>1</id>" +
                //"    <lastName>Gupta</lastName>" +
                "</employee>";

        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Employee employee = (Employee) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));

            System.out.println(employee);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
