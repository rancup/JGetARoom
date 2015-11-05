package org.rtk.getaroom;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private DataSource ds;

//    @Autowired
//    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Number of books: " + ds.toString());
    }
}