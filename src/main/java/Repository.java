import org.hibernate.Session;
import org.hibernate.Transaction;

class Repository {
Owner addOwner(Owner newOwner){
    var session = HibernateUtil.getSessionFactory().openSession();
    var transaction = session.beginTransaction();

    session.persist("Owner",newOwner);

    transaction.commit();
    session.close();

    return newOwner;
}
Pet addPet(Pet newPet){
    var session = HibernateUtil.getSessionFactory().openSession();
    var transaction = session.beginTransaction();

    session.persist("Pet",newPet);

    transaction.commit();
    session.close();

    return newPet;
}

Race addRace(Race newRace){
    var session = HibernateUtil.getSessionFactory().openSession();
    var transaction = session.beginTransaction();

    session.persist("Race",newRace);

    transaction.commit();
    session.close();

    return newRace;
}

Owner selectOwner(Integer id){
    var session = HibernateUtil.getSessionFactory().openSession();
    var transaction= session.beginTransaction();

    var owner = session.get(Owner.class, id);

    transaction.commit();
    session.close();
    return owner;
}
}
