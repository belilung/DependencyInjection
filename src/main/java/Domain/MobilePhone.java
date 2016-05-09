package Domain;

/**
 * Created by Андрей on 27.04.2016.
 */
public class MobilePhone {
    private long id_mobile;
    private String firm;
    private String model;
    private short RAM;
    private short ROM;

    // get set section
    public long getId_mobile() {
        return id_mobile;
    }

    public void setId_mobile(long id_mobile) {
        this.id_mobile = id_mobile;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getRAM() {
        return RAM;
    }

    public void setRAM(short RAM) {
        this.RAM = RAM;
    }

    public short getROM() {
        return ROM;
    }

    public void setROM(short ROM) {
        this.ROM = ROM;
    }
}
