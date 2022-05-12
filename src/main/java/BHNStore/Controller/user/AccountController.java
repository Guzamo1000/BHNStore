package BHNStore.Controller.user;


import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// import BHNStore.model.Account;
import BHNStore.domain.Account;
import BHNStore.domain.Product;
import BHNStore.exception.StorageException;
import BHNStore.model.AccountDto;
import BHNStore.service.AccountService;


@Controller
@RequestMapping("/")
public class AccountController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    AccountService accountService; 
    @Autowired
    private HttpSession session;
    @GetMapping("/login")
    public String login(ModelMap model)
    {
        model.addAttribute("account",new AccountDto());
        return "login";
    }
    @PostMapping("/login")
    public ModelAndView Login(ModelMap model, @Valid @ModelAttribute("account") AccountDto dto, BindingResult result)
    { 
        if(result.hasErrors())
        {
            return new ModelAndView("forward:/login", model);
        }
        
        System.out.println(dto.getUsername()+" "+dto.getPassword());
        Optional<Account> optExist=accountService.findByUserName(dto.getUsername());
        // Account account = accountService.login(dto.getUsername(),dto.getPassword());
        System.out.println(optExist.isPresent());
        if(optExist.isPresent() && dto.getPassword().equals(optExist.get().getPassword()))
        {
			System.out.println("password "+optExist.get().getPassword());
           
            session.setAttribute("username", dto.getUsername());
            // return new ModelAndView("forward:/",model);
            return new ModelAndView("home_login",model);
            // session.setAttribute("username", dto.account.getUsername());
            
        }
        // model.addAttribute("message","Invalid username or password");
        // optExist.get().setPassword("");
        Account acc= new Account();
        acc=optExist.get();
        AccountDto acd=new AccountDto();
        BeanUtils.copyProperties(acc, acd);
        model.addAttribute("account",acd);
        return new ModelAndView("login",model);

        
        // return new ModelAndView("forward:/",model);
    }
    @GetMapping("/dangky")    
    public String Dangky(Model model)
    {
        model.addAttribute("account", new AccountDto());

        return "dangky";
    }
   
    @RequestMapping("/save")
    public ModelAndView dangky(ModelMap model, @Valid @ModelAttribute("account") AccountDto dto, BindingResult result) throws StorageException
    {
        if(result.hasErrors())
        {
            return new ModelAndView("/dangky");
        }
        Account entity=new Account();
        if(dto.getPassword().equals(dto.getConfirm_password()))
        {
            BeanUtils.copyProperties(dto, entity);
            System.out.println(dto.getUsername());
            System.out.println(dto.getPassword());
            System.out.println(entity.getPassword());
            accountService.save(entity);
            model.addAttribute("message","Đăng ký thành công");
            return new ModelAndView("forward:/login", model);
        }
        else 
        {
            model.addAttribute("massage","failde");
            return new ModelAndView("/dangky",model);
        }
    }
}
