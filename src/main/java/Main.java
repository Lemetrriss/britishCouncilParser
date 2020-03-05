import DAO.BritishCouncilDAO;
import pages.StartPage;
import parse.GetInfo;

public class Main {
    public static void main(String[] args) {

        StartPage startPage = new StartPage();

        GetInfo getInfo = new GetInfo(startPage.getGeneralEnglish());

        new BritishCouncilDAO().addVehicleBrand(getInfo.getAlphabet());

        startPage.closeDriver();
    }
}
