package legoset;

import jaxb.JAXBHelper;

import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setNumber(75211);
        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setPackaging("box");
        legoSet.setTag(List.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        legoSet.setMinifigs(minifigs);

        legoSet.setRatings(new Ratings(468,4.4));

        

        JAXBHelper.toXML(legoSet, System.out);
    }

}