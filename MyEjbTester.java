/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myejbapp.bean;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import myejbapp.entities.Cage;



/**
 *
 * @author ulrich
 */
@Singleton
@LocalBean
// Startup annotation ensures that an instance of this object gets created emmediately 
//after deployment
@Startup
public class MyEjbTester {
  
    // For entreprise application Entity manager is just injected and not created
    // using the EntityManagerFactory as in the case with Java SE applications.
    @PersistenceContext(name = "MyEjbAppPU")
    EntityManager em ;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    // Method annotated with Postcontruct get executed directly after the application gets deployed
    @PostConstruct
    public void myMain(){
//            Staff staff = new Staff();
//            staff.setAge(20);
//            staff.setGender(Gender.F);
//            staff.setName("FE12A02" );
//            staff.setSalary(200);
//            
//            System.out.println("Staffs Successfully Added");
//            em.persist(staff);
//        for(int i = 2 ; i <= 11; i++){
//            Staff staff = em.find(Staff.class, i);
//            em.remove(staff);
//            System.out.println("Removing Staff " +i);
//        }
//        System.out.println("All Staffs Successfully Removed");
//        
//        Animal animal = new Animal();
//        animal.setTotalNo(4);
//        animal.setType("Lion");
//        
//        Cage cage = new Cage();
//        cage.setCageNo("Cage3");
//        cage.setLocation("first");
//        
		/*An animal belongs to one cage and one cage hold one and only one animal
		  So hooking should be done on both sides to enforce this relation 
		  since the relationship has been defined to be bidirectional.
		*/    	
//        cage.setAnimal(animal);
//        animal.setCage(cage);
//        

//        em.persist(cage);
//        em.persist(animal);
//          Query query = em.createQuery("select a.type,a.totalNo from Animal a ");
//          TypedQuery<Animal> query1 = em.createQuery("select a from Animal a where a.totalNo > 4 " , Animal.class);
//          /** Named Parameter Query
//          */
//          TypedQuery<Animal> query2 = em.createQuery("select a from Animal a where a.totalNo > :num " , Animal.class);
//          query2.setParameter("num",3);
//          
//          /** Position parameter Query
//           */
//          TypedQuery<Animal> query3 = em.createQuery("select a from Animal a where a.totalNo > ?1 " , Animal.class);
//          query3.setParameter(1, 3);
//          List list = query.getResultList();
        /**
         * Named Query Animal.simple is the name of a query we created during the
         * definition of the animal entity
         * This type of query is preferable over dynamic query because it gives the
         * possibility to the jpa provider to preprocess the query and thereby reduces
         * the overall query processing time
         */
//          TypedQuery<Animal> query4 = em.createNamedQuery("Animal.simple",Animal.class);
//          List<Animal> list1 = query4.getResultList();
//
//           
//           for (Object obj : list){
//              Object[] myArray = (Object[]) obj;
//              System.out.println(myArray[0] + "--" + myArray[1]);
//           }
//          Query query = em.createQuery("SELECT a.type , a.totalNo from Animal a WHERE a.type LIKE '%ion' ");
//        Query query = em.createQuery("SELECT a.type , a.totalNo from Animal a WHERE a.totalNo between 4 and 10 ");
//        Query query = em.createQuery("SELECT a.type , a.totalNo from Animal a WHERE a.totalNo betwee :?1 and ?2 ");
//        Query query = em.createQuery("SELECT a.type , a.totalNo from Animal a WHERE a.totalNo between :lower and :upper ");
//          query.setParameter("lower", 4);
//          query.setParameter("upper", 10);
//        query.setParameter(1, 4);
//        query.setParameter(2, 10);
//        query.setFirstResult(0);
//        query.setMaxResults(4);
//          Category category = new Category();
//          category.setCategoryType("mammal");
//
//          
//          Animal animal = new Animal();
//          animal.setType("horse");
//          animal.setTotalNo(5);
//          
//          animal.setCategory(category);
//          category.setAnimalList(null);
//          
//          em.persist(animal);
//          em.persist(category);
//        TypedQuery<Animal> query = em.createQuery("SELECT a from Animal a WHERE a.foodItemList IS  EMPTY" , Animal.class);
//             Query query = em.createQuery("SELECT c.categoryType,SUM(a.totalNo) from Category c "
//                                        + "JOIN c.animalList a GROUP BY c HAVING SUM(a.totalNo) < 20 ORDER BY SUM(a.totalNo) ASC");
//             Query query = em.createQuery(" SELECT a.type, CASE WHEN a.totalNo<10 THEN 'low' "
//                                        + " WHEN   a.totalNo < 20 THEN 'medium' ELSE 'higher' END FROM Animal a");
//        TypedQuery<Vet> query = em.createQuery("SELECT v from Vet v ",Vet.class);
//        List<Vet> list = query.getResultList();
//            
//            System.out.println("Printing all the available vets ");
//            for (Vet vet : list){
//                System.out.println(vet.getName());
//            }

        // Updating the cage number of the cage with ID = 2
        Cage cage = em.find(Cage.class,2);
        cage.setCageNo("B9");
            
       
    }
}
