package test;

import com.baisha.pojo.Notebook;
import com.baisha.service.NotebookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TestCase {
    //@Autowired
    NotebookService service;
    @Test
    public void test1(){
        Notebook notebook=new Notebook();
        notebook.setTitle("test");
        notebook.setText("hello");
        service.add(notebook);
    }
}
