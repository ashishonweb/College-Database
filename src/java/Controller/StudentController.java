
package Controller;

import DataAccess.StudentData;
import PoJo.Student;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class StudentController {
    
         @Autowired    
        StudentData data;
         
         
         @RequestMapping(value="/addDetail.htm",method=RequestMethod.GET)
    public String addDetail(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
          return "addDetail";
    }
    
    
    @RequestMapping(value="/addDetail.htm",method=RequestMethod.POST)
       public ModelAndView AddDetails(@Valid@ModelAttribute Student student,BindingResult br){           
               ModelAndView mv=new ModelAndView();
                if(br.hasErrors()){
                
                mv.setViewName("addDetail");
                }
                else{
                    data.addStudent(student); 
              mv.setViewName("addDetail");
                }
               return mv;

       }          
        @RequestMapping(value="/displayDetail.htm",method=RequestMethod.GET)
        public ModelAndView displayStudent(){
            List<Student> students=data.displayStudent();
       ModelAndView mv=new ModelAndView();
       mv.addObject("students",students);
         mv.setViewName("displayDetail");
         return mv;           
        }   
        
        
        @RequestMapping(value="/detail.htm",method=RequestMethod.GET)
       public String detail(@RequestParam int id,Model model ){           
                Student student=data.getStudent(id);
          model.addAttribute("students",student);
                  return "detail";
       }
       
       @RequestMapping(value="detail.htm",method=RequestMethod.POST)
        public ModelAndView detail(@RequestParam String command,@ModelAttribute Student student){
            
            if(command.equals("Delete")){
                data.deleteStudent(student.getId());
            }
            else{
                data.updateStudent(student);
            }
            return new ModelAndView("redirect:displayDetail.htm");
        }   
        
}
