package cn.robertchen.mydb.backend.tm;

import org.junit.Test;

public class TransactionManagerTest {

    private TransactionManager manager;

    @Test
    public void TestTransactionManager() {
        TransactionManagerImpl manager = TransactionManager.open("D:\\Code\\JavaProject\\MyDB\\src\\test\\java\\cn\\robertchen\\mydb\\backend\\tm\\test_file");
        System.out.println(manager);
    }
}
