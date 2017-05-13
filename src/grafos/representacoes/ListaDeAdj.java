/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos.representacoes;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ListaDeAdj implements Grafo{
    
    LinkedList<LinkedList> lisAdj = new LinkedList<>();
            
    public ListaDeAdj(int numDeVertice){
        for(int i = 0; i < numDeVertice; i++ ){
            lisAdj.add(i,lisAdj);
        }
    
    }
      
    public List getLista(){
        return  lisAdj;
    
    }
    

    @Override
    public int getNumeroDeVertices() {
        return lisAdj.size();
    }

    @Override
    public void addAresta(int origem, int destino) {
        
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
