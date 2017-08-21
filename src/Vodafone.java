
public class Vodafone implements ISP{
    @Override
    public String getsource(String site) {
       switch (site) {

           case "www.google.com":
               return "Goooooogle";

           case "www.yahoo.com":
               return "Yahooooooo";

           case "www.gaming.com":
               return "NO resource found";

       }

        return site;
    }

}
