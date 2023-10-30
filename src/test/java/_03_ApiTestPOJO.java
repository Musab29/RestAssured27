
import Model.Location;
import Model.Place;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class _03_ApiTestPOJO {
    // POJO : JSON nesnesi : locationNesnesi

    @Test
    public void extractJsonAll_POJO() {

        // Ogrenci ogr1= new Ogrenci();
        Location locationNesnesi =
                given()
                        .when()
                        .get("https://api.zippopotam.us/us/90210")


                        .then()
                        .extract().body().as(Location.class) // Model.Location Kalıbına göre
                // dönen body bilgisi Locaiton Class kalıbıyla çevir.
                ;

        System.out.println("locationNesnesi = " + locationNesnesi);
        System.out.println("locationNesnesi.getCountry() =" +
                locationNesnesi.getCountry());

        System.out.println("locationNesnesi.getPlaces() =" +
                locationNesnesi.getPlaces());

        for (Place p : locationNesnesi.getPlaces())
            System.out.println("p = " + p);

    }

    // http://api.zippopotam.us/tr/01000  endpointinden dönen verilerden "Dörtağaç Köyü" ait bilgileri yazdırınız


    @Test
    public void extractPOJO_Soru() {

        Location locationNesnesi =
                given()
                        .when()
                        .get("https://api.zippopotam.us/tr/01000")


                        .then()
                        .extract().body().as(Location.class);

        for (Place p : locationNesnesi.getPlaces()) {
            if (p.getPlacename().equalsIgnoreCase("Dörtağaç Köyü")) {
                System.out.println("p = " + p);
            }
        }
    }


}
