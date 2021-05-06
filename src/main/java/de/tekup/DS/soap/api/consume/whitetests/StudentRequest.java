//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.06 à 02:21:18 AM CEST 
//


package de.tekup.DS.soap.api.consume.whitetests;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="examCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentId",
    "examCode"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    protected int studentId;
    @XmlElement(required = true)
    protected String examCode;

    /**
     * Obtient la valeur de la propriété studentId.
     * 
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Définit la valeur de la propriété studentId.
     * 
     */
    public void setStudentId(int value) {
        this.studentId = value;
    }

    /**
     * Obtient la valeur de la propriété examCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamCode() {
        return examCode;
    }

    /**
     * Définit la valeur de la propriété examCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamCode(String value) {
        this.examCode = value;
    }

}
