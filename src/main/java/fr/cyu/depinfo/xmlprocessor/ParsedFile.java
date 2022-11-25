package fr.cyu.depinfo.xmlprocessor;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * This class contains methods to get and set metadata from an XML file extracted from an ODT file.
 *
 * @author Thomas REMY
 */
public class ParsedFile {
    private Document doc;

    /**
     * Constructs a new ParsedFile from an XML file.
     *
     * @param f The XML file to parse.
     */
    public ParsedFile(File f) {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        try {
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();

            doc = builder.parse(f);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return The parsed XML document.
     */
    public Document getDoc() {
        return this.doc;
    }

    /**
     * @param doc The modified parsed XML document.
     */
    public void setDoc(Document doc) {
        this.doc = doc;
    }
}