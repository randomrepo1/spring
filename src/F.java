import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class F{


    @SuppressWarnings("unused")
    class DetailsAboutVisitorPattern {

        DetailsAboutVisitorPattern() {
            System.out.println("We have Real Objects such as Dog Cat Bird which is an Animal, so  Animal is an interface");
            System.out.println("Each Animal will have an accept method");
            System.out.println("Accept method will take the Visitor Object");
            System.out.println("Dog Objects will take the visitor objects in accept method");
            System.out.println("In the accept method the visitor object is taken and visit method of visitor is called with this as the parameter");
            System.out.println("Each Visitor object is implementation of visitor interface");
            System.out.println("Each visitor will have the visit method implementation");
            System.out.println("visit implementation can have any thing written");
            System.out.println("When Dogs -> accept method is called -> particular visitor is passed -> visitor.visit(this) will take Dog as " +
                    "parameter and dogs variables are taken for logic  ");
        }
    }

    @SuppressWarnings({"SpellCheckingInspection","unused"})
    class HibernateInterviewQuestionsAndConstructors {

        HibernateInterviewQuestionsAndConstructors() {
            System.out.println("Hibernate is a lightweight ORM tool for mapping to the database with actual real time objects");
            System.out.println("ORM is an object relational mapping tool that is used for data manipulation ");
            System.out.println("Java Application -> SessionFactory -> Session -> Connection Provider -> Persistent Object -> Transaction");
            System.out.println("Internal API used by Hibernate JNDI -> JDBC -> JTA -> Databases");
            System.out.println("Core Interfaces of Hibernate -> Configuration -> SessionFactory -> Session -> Query -> Criteria -> Transaction");
            System.out.println("A SessionFactory provides an instance of Session. It is a factory of session. It holds the data of second level cache that is not enabled ");
            System.out.println("Core objects of hibernate framework are Transaction, Session, Session Factory, Transaction Factory, Connection Provider -> These are present in the persistent object ");
            System.out.println("Internal API used by hibernate are JNDI JDBC JTA");
            System.out.println("There are four layers in hibernate architecture java application layer, hibernate framework layer backend api layer and database layer");
            System.out.println("The high level architecture of hibernate consisting of Mapping file and the configuration file");
            System.out.println("The elements of Hibernate Architecture are");
            System.out.println("SessionFactory -> The sessionFactory is a factory of session and client of ConnectionProvider");
            System.out.println("It holds the second level cache of data");
            System.out.println("The SessionFactory has the factory method to get the object of session");
            System.out.println("The Session object provides an interface between the application and the data stored in the database.");
            System.out.println("It is a short lived object and wraps up the JDBC Connection.");
            System.out.println("It is a factory of Transaction Query and Criteria");
            System.out.println("The org.hibernate.Transaction interface creates the methods for transaction management.");
            System.out.println("ConnectionProvider is a factory of JDBC Connections.");
            System.out.println("It abstracts the application from DriverManager and DataSource");
            System.out.println("TransactionFactory it is a factory of Transaction");
            System.out.println("To create and hibernate application without the ide is");
            System.out.println("Create the persistent class, Create the mapping file for the persistent class");
            System.out.println("persistent class is the class for the table in the database");
            System.out.println("Create the configuration file");
            System.out.println("Create a class that retrieves or stores the persistent object");
            System.out.println("Load the jar file");
            System.out.println("Run the first hibernate application without ide");
            System.out.println("To summarise all the above steps -> create the persistent class -> create the mapping file for this class or create the annotations ->" +
                    "create the configuration file -> create a class that will retrieve the persistent object or store the persistent object -> load the jar file and run the first" +
                    "hibernate application without ide");
            System.out.println("The persistent class is having a no arg constructor, create an identifier property that is create atleast a primary key, prefer using non final classes " +
                    "because hibernate will use proxies for lazy association fetching.");
            System.out.println("we can create a mapping for the persistent class by, creating root element in the mapping file");
            System.out.println("The mapping file in hibernate is tablename.hbm.xml");
            System.out.println("It is having the hibernate-mapping tag and class tag with table attribute saying the name of the table");
            System.out.println("It has the id tag withe the name of the id and the generator tag for the for id ,if it is assigned generator");
            System.out.println("The property name is the first name and lastname in the mapping");
            System.out.println("The configuration file is the configurationfilename.cfg.xml");
            System.out.println("It has the property name of hbm2ddlauto and the value is update or other values");
            System.out.println("It has the property dialect connection.url, connection.username, connection.password, connection.driver_class," +
                    "and mapping resource files which are the filenames for the classfiles for database tables.");
            System.out.println("Later to create the class that saves and retrieves the values from the object are new Configuration object" +
                    "is created and cfg.configure method is called with the parameter for configuration file");
            System.out.println("Later using configuration object the sessionFactory object is created using cfg.configure method");
            System.out.println("using the factory object the openSession method is called and the session object is created.");
            System.out.println("And then later the session object's beginTransaction method is called to create the transaction.");
            System.out.println("All the values for the object are created and the session.persist(java object is passed)");
            System.out.println("For the classes to load or jars to load they should be in the jre/ext/lib folder ");
            System.out.println("Now transaction should be committed and the session should be closed.");
            System.out.println("The hibernate application can be created with annotations");
            System.out.println("In Hibernate Transaction Management If one step fails every other step fails.");
            System.out.println("The various properties in hibernate are ACID atomicity Consistency Isolation Durability");
        }
    }

    @SuppressWarnings("unused")
    class BridgePattern {

        BridgePattern() {
            System.out.println("The bridge pattern is used when both the class and what it does are separate");
            System.out.println("Bridge pattern is used to separate abstraction from implementation");
            System.out.println("Bridge pattern is used to decouple abstraction from implementation ");
            System.out.println("Bridge Pattern is using inheritance, aggregation and encapsulation to separate responsibilities into a separate class");
        }


        void getT() {
            System.out.println("Depending on the size of input the space complexity ");
            System.out.println("depending on what we want to decrease the space or the time");
            System.out.println("Iterative algorithm and recursive algorithm. The program is having an input as array a and size is n");
        }
    }

    @SuppressWarnings("unused")
    class StrategyPatternUsingConsumers {

        public class TheClassThatWillCreateStrategiesAndPassToObjectsCreatedUsingConsumers {

            List<Double> listOfDrinks = new ArrayList<>();
            private BiConsumer<Double, Double> happyHourStrategyConsumer = (pricePassed, quantity) -> listOfDrinks.add(pricePassed * 0.5 * quantity);
            private BiConsumer<Double, Double> normalStrategyHourConsumer = (pricePassed, quantity) -> listOfDrinks.add(pricePassed * quantity);

            void strategyConsumerExecution() {
                happyHourStrategyConsumer.accept(45.0, 89.2);
            }
            void strategyConsumerExecution(BiConsumer<Double,Double> biConsumer) {
                biConsumer.accept(45.0, 89.2);
            }

            void setNormalStrategyHourConsumerExecution() {
                normalStrategyHourConsumer.accept(34.4, 5.9);
            }
        }
    }

    public static void main(String[] args) {

    }
}

interface DrawingApi {
    void draw(double x, double y, double radius);
}

 class DrawingApiOne implements DrawingApi {
    @Override
    public void draw(double x, double y, double radius) {
        System.out.println(x + " " + y + " " + radius);
    }
}

 class DrawingApiTwo implements DrawingApi {
    @Override
    public void draw(double x, double y, double radius) {
        System.out.println(x + " " + y + " " + radius);
        System.out.println("Two");
    }
}

abstract class Shape {
    DrawingApi drawingApi;

    Shape(DrawingApi drawingApi) {
        this.drawingApi = drawingApi;
    }

    abstract void draw();

    abstract void resize();
}

 class CircleShape extends Shape {
    double x, y, radius;

    CircleShape(double x, double y, double radius, DrawingApi drawingApi) {
        super(drawingApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawingApi.draw(x, y, radius);
    }

    @Override
    void resize() {
        radius = radius * 1.025;
    }


    void runTheBridgePattern() {
        Shape circleShape = new CircleShape(4, 5, 6, new DrawingApiOne());
        Shape circleShapeSecond = new CircleShape(4, 5, 6, new DrawingApiTwo());
        circleShape.draw();
        circleShapeSecond.draw();
        circleShape.resize();
        circleShapeSecond.resize();
        circleShape.draw();
        circleShapeSecond.draw();
        System.out.println("The circle behaviour can be changed without changing the class, the responsibility is changed into a separate class");
    }
}
