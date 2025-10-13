public class AccoutPla extends Accout{
    private String cnpj;
    private double annualValue;
    private String companyName;

    public AccoutPla(){}

    public AccoutPla(String name, int age, String cnpj, double annualValue){
        super(name,age);
        this.cnpj = cnpj;
        this.annualValue = annualValue;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getAnnualValue() {
        return annualValue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setAnnualValue(double annualValue) {
        this.annualValue = annualValue;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String toString(){
        return "CNPJ: " + cnpj + "\n"
                + "Company name: " + companyName + "\n"
                + "Founder: " + getName() + "\n"
                + "Annual value: " + annualValue + "\n";
    }
}
