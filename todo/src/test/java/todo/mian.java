package todo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.syena.config.SpringConfig;
import com.syena.dao.ToDoDao;
import com.syena.model.ToDo;

public class mian extends Sub{
public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
ToDoDao controller= context.getBean(ToDoDao.class);


List<ToDo> a= controller.getTodos();
for(ToDo d:a)
{
System.out.println(d);	
}

((AnnotationConfigApplicationContext)context).close();
}
}
