package StudentProject;
import java.util.ArrayList;

public class StudentDB {
  private ArrayList<Student> stList;
  private StudentDbmsService sds;

  public StudentDB( )
  {
	  sds=new StudentDbmsService ();
	  stList=sds.findAll();
  }//
  //
  int size()
  {
  	return stList.size();
  }
boolean add(Student st)
{
	// Add to ArrayList	
	// Add to mysqll table also
	if(sds.add(st))
	{
		stList.add(st);
		
		return true;
	}
	return false;
}

void remove(Student st)
{
	//remove from ArrayList
	stList.remove(st);
	//remove from Database
	sds.remove(st);
}

Student get(int i)
{
	return stList.get(i);
	
}

void set(int pos, Student st)
{
	stList.set(pos, st);
	sds.set(st);
}

int indexOf(Student st)
{
	return stList.indexOf(st);
}

Student findByName(String target)	// "Amit"
{
	for (int i = 0; i < stList.size(); i++) {
		Student st = stList.get(i);
		if(st.getName().equals(target))
				return st;		//found		
	}//for
	return null;		//not found
}
}