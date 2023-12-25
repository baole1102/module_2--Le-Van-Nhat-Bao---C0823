package com.example.repository;


import com.example.model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static EntityManager entityManager;
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> showList() {
        String select = "select p from Product p";
        TypedQuery<Product> query = entityManager.createQuery(select, Product.class);
        return query.getResultList();
    }

    @Override
    public void addNewProduct(Product product) {
        Transaction transaction = null;
        Product origin;
        if (product.getId() == 0) {
            origin = new Product();
        } else {
            origin = findById(product.getId());
        }
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            origin.setName(product.getName());
            origin.setPrice(product.getPrice());
            origin.setPDescribe(product.getPDescribe());
            origin.setProducer(product.getProducer());
            session.saveOrUpdate(origin);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public Product findById(int id) {
        String findId = "select p from Product p where p.id = :id";
        TypedQuery<Product> query = entityManager.createQuery(findId, Product.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            Product productToDelete = session.get(Product.class, id);
            if (productToDelete != null) {
                session.delete(productToDelete);
                transaction.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public List<Product> search(String name) {
        List<Product> list1 = new ArrayList<>();
        for (Product p: showList()) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                list1.add(p);
            }
        }
        return list1;
    }

    @Override
    public Product information(int id) {
        return null;
    }
}
