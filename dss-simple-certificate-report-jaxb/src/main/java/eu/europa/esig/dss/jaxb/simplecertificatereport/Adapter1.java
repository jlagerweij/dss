//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.16 at 07:50:15 AM CEST 
//


package eu.europa.esig.dss.jaxb.simplecertificatereport;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.DateParser.parse(value));
    }

    public String marshal(Date value) {
        return (eu.europa.esig.dss.jaxb.parsers.DateParser.print(value));
    }

}
