package ex_21_Encapsulation;

public class LAb_183_Encapsulation_example2 {
    public static void main(String[] args) {

        Building b1 = new Building("Sambhav",23);
        System.out.println(b1.getBuilding_name());
        System.out.println(b1.getFlat_number());

        b1.setBuilding_name("Shraddha");
        System.out.println(b1.getBuilding_name());

        //b1.setFlat_number(1,false);
       // System.out.println(b1.getFlat_number());

        b1.setFlat_number(1,true);
         System.out.println(b1.getFlat_number());
    }
}

class Building{

   private String Building_name;
   private int flat_number;

   public String area;

    public Building(String building_name, int flat_number) {
        this.Building_name = building_name;
        this.flat_number = flat_number;
    }

    public String getBuilding_name() {
        return Building_name;
    }

    public void setBuilding_name(String building_name) {
        Building_name = building_name;
    }

    public int getFlat_number() {
        return flat_number;
    }

    public void setFlat_number(int flat_number, boolean Sambhav) {
        if(Sambhav){
        this.flat_number = flat_number;
        }else
        {
            System.out.println("Building name is not Sambhav ");
        }
    }
}
