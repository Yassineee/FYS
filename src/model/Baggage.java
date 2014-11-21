package model;

public class Baggage {

    private int baggageId;
    private String collor;
    private double weight;
    private String brand;
    private String description;
    private String materials;
    private String department;

    public Baggage() {
        this(-1, "", -1, "", "", "", "");
    }

    public Baggage(int baggageId, String collor, double weight, String brand, String description, String materials, String department) {
        this.baggageId = baggageId;
        this.collor = collor;
        this.weight = weight;
        this.brand = brand;

    }

    /**
     * @return the categoryId
     */
    public int getbaggageId() {
        return baggageId;
    }

    /**
     * @param baggageid the baggageid to set
     */
    public void setbaggageId(int accountId) {
        this.baggageId = accountId;
    }

    /**
     * @return the collor
     */
    public String getcollor() {
        return collor;
    }

    /**
     * @param collor the collor to set
     */
    public void setcolor(String collor) {
        this.collor = collor;
    }

    /**
     * @return the weight
     */
    public double getweight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setweight(double weight) {
        this.weight = weight;
    }

    public String getbrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setbrand(String brand) {
        this.brand = brand;
    }

public String getdescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setdescription(String description) {
        this.description = description;
    }
public String getmaterials() {
        return materials;
    }

    /**
     * @param materials the materials to set
     */
    public void setmaterials(String materials) {
        this.materials = materials;
    }
public String getdepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setName(String department) {
        this.department = department;
    }
}
