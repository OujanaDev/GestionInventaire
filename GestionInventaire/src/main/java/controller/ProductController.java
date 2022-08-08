package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repo.ProductRepo;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class ProductController {

    @Autowired
    ProductRepo productRepo;


    @GetMapping(value = "/productlist")
    public List<Product> getProductList(){
        return productRepo.findAll();
    }

    @GetMapping(value = "/product")
    public Optional<Product> getProductbyID(@RequestParam long id){
        return productRepo.findById(id);
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product prodcut){
        return productRepo.save(prodcut);
    }

    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam Long id){
        productRepo.deleteById(id);

    }
}
