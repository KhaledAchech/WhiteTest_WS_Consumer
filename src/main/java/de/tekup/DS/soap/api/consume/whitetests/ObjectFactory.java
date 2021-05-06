//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.06 à 02:21:18 AM CEST 
//


package de.tekup.DS.soap.api.consume.whitetests;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.tekup.DS.soap.api.consume.whitetests package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.tekup.DS.soap.api.consume.whitetests
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link StudentRequest }
     * 
     */
    public StudentRequest createStudentRequest() {
        return new StudentRequest();
    }

    /**
     * Create an instance of {@link WhiteTestResponse }
     * 
     */
    public WhiteTestResponse createWhiteTestResponse() {
        return new WhiteTestResponse();
    }

    /**
     * Create an instance of {@link Exam }
     * 
     */
    public Exam createExam() {
        return new Exam();
    }

    /**
     * Create an instance of {@link ExamsRequest }
     * 
     */
    public ExamsRequest createExamsRequest() {
        return new ExamsRequest();
    }

    /**
     * Create an instance of {@link ExamsResponse }
     * 
     */
    public ExamsResponse createExamsResponse() {
        return new ExamsResponse();
    }

    /**
     * Create an instance of {@link Student.Address }
     * 
     */
    public Student.Address createStudentAddress() {
        return new Student.Address();
    }

}
