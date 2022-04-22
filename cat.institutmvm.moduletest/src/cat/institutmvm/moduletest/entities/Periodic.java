package cat.institutmvm.moduletest.entities;

import cat.institutmvm.app.entities.Fitxa;

public class Periodic extends Fitxa {
    private String titular;
    public Periodic(String referencia, String titol, String titular) {
        super(referencia, titol);
        this.setTitular(titular);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String visualitzar(){
        return super.visualitzar() +
                "Titular: " + this.getTitular() + "\n";
    }

}
