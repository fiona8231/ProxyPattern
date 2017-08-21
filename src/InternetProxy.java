import java.util.Calendar;

public class InternetProxy implements ISP {

    //The proxy method to do logging and filtering

    @Override
    public String getsource(String site)
    {
       this.logRequest(site);
       if(this.isBlocked(site)){
           return "This site is blocked according to company policy";
       }

       NetworkSettings networkSettings = new NetworkSettings();
       return networkSettings.getISP().getsource(site);
    }

    private void logRequest(String site) {

        System.out.println(Calendar.getInstance().getTime() + "  Request for  " + site);
    }


    private boolean isBlocked(String site){
        switch (site){

            case "www.google.com":
                return false;

            case "www.yahoo.com":
                return false;

            case "www.gaming.com":
                return true;
                default: return false;
        }


    }
}
