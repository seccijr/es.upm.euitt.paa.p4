package model;

public class ListaProvincias {
    private String[] provincias = null;

    public ListaProvincias() {
        provincias = new String[0];
    }

    public ListaProvincias(String[] provincias) {
        this.provincias = provincias;
    }

    public String[] getProvincias() {
        return provincias;
    }

    public void setProvincias(String[] provincias) {
        this.provincias = provincias;
    }
}
