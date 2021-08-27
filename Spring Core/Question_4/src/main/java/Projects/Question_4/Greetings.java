package Projects.Question_4;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Controller
//@Service
//@Repository
public class Greetings {
Sender s1;

public Sender getS1() {
	return s1;
}
//@Resource
//@Autowired
//@Qualifier("Greetingsrelated")
@Inject
@Qualifier("injectrelated")
public void setS1(Sender s1) {
	this.s1 = s1;
}

void print() {
	System.out.println(s1.getGreet()+"!"+s1.getName());
}
}
