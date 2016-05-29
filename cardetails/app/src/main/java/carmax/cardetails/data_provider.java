package carmax.cardetails;

/**
 * Created by Root on 16/05/2016.
 */
public class data_provider {
    private String carname;
    private String cardoors;
    private String caryear;
    private String carfueltype;
    private String carkilometres;
    private String carengineoil;
    private String carairfilter;
    private String cartyres;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCardoors() {
        return cardoors;
    }

    public void setCardoors(String cardoors) {
        this.cardoors = cardoors;
    }

    public String getCaryear() {
        return caryear;
    }

    public void setCaryear(String caryear) {
        this.caryear = caryear;
    }

    public String getCarfueltype() {
        return carfueltype;
    }

    public void setCarfueltype(String carfueltype) {
        this.carfueltype = carfueltype;
    }

    public String getCarkilometres() {
        return carkilometres;
    }

    public void setCarkilometres(String carkilometres) {
        this.carkilometres = carkilometres;
    }

    public String getCarengineoil() {
        return carengineoil;
    }

    public void setCarengineoil(String carengineoil) {
        this.carengineoil = carengineoil;
    }

    public String getCarairfilter() {
        return carairfilter;
    }

    public void setCarairfilter(String carairfilter) {
        this.carairfilter = carairfilter;
    }

    public String getCartyres() {
        return cartyres;
    }

    public void setCartyres(String cartyres) {
        this.cartyres = cartyres;
    }

    public data_provider(String carname,String cardoors,String caryear,String carfueltype,String carkilometres,String carengineoil,String carairfilter,String cartyres){
       this.carname = carname;
       this.cardoors = cardoors;
       this.caryear = caryear;
       this.carfueltype = carfueltype;
       this.carkilometres = carkilometres;
       this.carengineoil = carengineoil;
       this.carairfilter = carairfilter;
       this.cartyres = cartyres;

   }

}
