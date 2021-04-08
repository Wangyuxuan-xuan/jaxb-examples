package legoset;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import movie.YearAdapter;


import java.net.URL;
import java.time.Year;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {

    @XmlAttribute(name = "number")
    private int number;

    private String name;
    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<String> tag;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    private Ratings ratings;

    private URL url;

}