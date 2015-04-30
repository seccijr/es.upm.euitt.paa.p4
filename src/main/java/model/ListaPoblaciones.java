package model;

import paa.provincias.IPoblacion;

public class ListaPoblaciones {
    private IPoblacion[] poblaciones = null;

    public ListaPoblaciones() {
        poblaciones = new IPoblacion[0];
    }

    public ListaPoblaciones(IPoblacion[] poblaciones) {
        this.poblaciones = poblaciones;
    }

    public IPoblacion[] getProvincias() {
        return poblaciones;
    }

    public void setProvincias(IPoblacion[] poblaciones) {
        this.poblaciones = poblaciones;
    }
}
