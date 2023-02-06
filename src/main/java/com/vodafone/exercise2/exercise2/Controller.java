package com.vodafone.exercise2.exercise2;
import java.util.ArrayList;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/HandleProducts")
public class Controller {

@PostMapping()
public Produto createProduto(@RequestBody Produto produto) {
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
    return catalogo.getList();
}

@PutMapping("/{id}")
public Produto updateProduto(@PathVariable String id,@RequestBody Produto produto){
    Catalogo catalogo=Catalogo.getCatalogo();

    return catalogo.updateProduto(id, produto);

}
    
}
