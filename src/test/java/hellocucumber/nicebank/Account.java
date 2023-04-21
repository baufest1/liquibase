package hellocucumber.nicebank;

import org.javalite.activejdbc.Model;

public class Account extends Model {
    public Account() {}

    public Account(int number) {
        setInteger("number", number);
        setString("balance", "0.00");
    }
}
