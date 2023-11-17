package com.example.doanh.services;



import com.example.doanh.models.Product;
import com.example.doanh.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productResponsitory;

        public Page<Product> findAll(int pageNo, int pageSize, String sortBy,
                                     String sortDirection) {
            Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
            Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

            return productResponsitory.findAll(pageable);
        }




//    public void add(Product p){
//        productResponsitory.save(p);
//    }
//    public void delete(long id){
//        productResponsitory.deleteById(id);
//    }
//    public Product getProductbyId(long id){
//        return productResponsitory.getReferenceById(id);
//    }
}
