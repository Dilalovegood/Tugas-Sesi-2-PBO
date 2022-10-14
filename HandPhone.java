
public class HandPhone {
   public String phone_type;
   public int production_year;
    
    public void setDataHP(String phone_type, int production_year){
        this.phone_type = phone_type;
        this.production_year = production_year;        
    }
    public String getType(){
        return phone_type;
    }
    
    public int getYear(){
        return production_year;
    }
    
    public static void main(String[] args) {
        HandPhone myphone = new HandPhone();
        myphone.setDataHP("Android", 2003);
        System.out.println("Jenis HP : " + myphone.getType());
        System.out.println("Tahun Produksi : " + myphone.getYear());
    }
}