/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos.representacoes;

import java.util.List;

/**
 *
 * @author Acer
 */ 
public class MatrizDeIncidencia implements Grafo{
    
    private int[][] matrizIncidencia;

    public MatrizDeIncidencia(int numVertices) {
        
        this.matrizIncidencia = new int[numVertices][(numVertices*(numVertices -1))/2];
    }
 
    @Override
    public int getNumeroDeVertices() {
        return 0;
    }

    @Override
    public void addAresta(int origem, int destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAresta(int origem, int destino, double peso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAresta(int origem, int destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAresta(int origem, int destino, double peso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAresta(int origem, int destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAdjacente(int origem, int destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAdjacentes(int vertice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPeso(int origem, int destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
