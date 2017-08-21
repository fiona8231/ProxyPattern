import javax.swing.*;

public class Browser {

    //send a request to ISP

    public void sendRequest(){

        String site = JOptionPane.showInputDialog("Enter the site URL");
        String response = this.getInternetProvider().getsource(site);
        this.laodRespond(response);


    }

    private void laodRespond(String response) {
        System.out.println(response);
    }
     //return ISP
     //Get the network setting for ISP to use
    private ISP getInternetProvider(){
        return new NetworkSettings().getInternet();

    }
}
