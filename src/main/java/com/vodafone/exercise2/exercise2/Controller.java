package com.vodafone.exercise2.exercise2;
import java.util.ArrayList;

import javax.xml.catalog.Catalog;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

@RestController
@RequestMapping("/HandleProducts")
public class Controller {

@PostMapping()
    public Produto CreateProduto(@RequestBody Produto produto) {
        Catalogo catalogo=Catalogo.getCatalogo();
        catalogo.addProduto(produto);
        return produto;
}
@DeleteMapping("/{id}")
public Produto deleteProduct(@PathVariable String id){
    Catalogo catalogo=Catalogo.getCatalogo();    
    return catalogo.removeProduto(id);
}

@GetMapping()
public ArrayList<Produto> getProducts(){
    Catalogo catalogo = Catalogo.getCatalogo();
    // ArrayList<Produto> temp=new ArrayList<>();
    // temp.add(new Produto(1, "Prod1", "ID1"));
    // temp.add(new Produto(2, "Prod2", "ID2"));
    // temp.add(new Produto(3, "Prod3", "ID3"));
    return catalogo.getList();
}

@PutMapping("/{id}")
public Produto updateProduto(@PathVariable String id,@RequestBody Produto produto){
    Catalogo catalogo=Catalogo.getCatalogo();

    return catalogo.updateProduto(id, produto);

}
    
}
