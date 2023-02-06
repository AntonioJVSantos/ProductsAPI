package com.vodafone.exercise2.exercise2;
import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Produto> listaProdutos;
    private static Catalogo single=null;

    private Catalogo(){
        this.listaProdutos=new ArrayList<>();        
    }
    
    public static Catalogo getCatalogo(){
        if(single==null){
            single=new Catalogo();
        }
        return single;
    }
    public void addProduto(Produto prod){
        listaProdutos.add(prod);
    }
    public ArrayList<Produto> getList(){
        return listaProdutos;
    }
    public Produto updateProduto(String id,Produto novo){
        boolean found=false;
        for(Produto p:listaProdutos){
            if(p.getId().equals(id)){
                p.setId(novo.getId());
                p.setName(novo.getName());
                p.setPrice(novo.getPrice());
                found=true;
            }
        }
        if(found){
            return novo;
        }
        return null;
    }
    public Produto removeProduto(String id){
        Produto temp=null;
        for(Produto p:listaProdutos){
            if (p.getId().equals(id)){
                temp=p;
            }            
        }
        if(temp!=null){
            listaProdutos.remove(temp);
        }
        return temp;
    }


    

}
