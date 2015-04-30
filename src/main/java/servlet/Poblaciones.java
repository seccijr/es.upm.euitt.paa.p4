package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.SortedSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paa.provincias.IPoblacion;
import paa.provincias.IAlmacenPoblaciones;
import paa.provincias.IPoblacionAEMET;
import model.ListaPoblaciones;
import model.ListaProvincias;
import almacen.AlmacenPoblaciones;
import java.net.URISyntaxException;

/**
 * Servlet implementation class Poblaciones
 */
@SuppressWarnings("serial")
public class Poblaciones extends HttpServlet {
    private IAlmacenPoblaciones almacen = null;

    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        almacen = new AlmacenPoblaciones();
        try {
            String almacenPath = Poblaciones.class.getResource("almacen.dat").toURI().toString();
            almacen.recuperar(almacenPath);
        }
        catch(URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Set<String> setProvincias = almacen.getProvincias();
        String[] provincias = setProvincias.toArray(new String[setProvincias.size()]);
        ListaProvincias listaProvincias = new ListaProvincias(provincias);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    }
}
