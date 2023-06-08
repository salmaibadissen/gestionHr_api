package  ma.sir.hr;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.cache.annotation.EnableCaching;


import ma.sir.hr.bean.core.*;
import ma.sir.hr.service.facade.admin.*;

import ma.sir.hr.zynerator.security.common.AuthoritiesConstants;
import ma.sir.hr.zynerator.security.bean.User;
import ma.sir.hr.zynerator.security.bean.Permission;
import ma.sir.hr.zynerator.security.bean.Role;
import ma.sir.hr.zynerator.security.service.facade.UserService;
import ma.sir.hr.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.sir.hr.required.facade")
public class HrApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(HrApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(false){



    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }




    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("Sexe.edit"));
        permissions.add(new Permission("Sexe.list"));
        permissions.add(new Permission("Sexe.view"));
        permissions.add(new Permission("Sexe.add"));
        permissions.add(new Permission("Sexe.delete"));
        permissions.add(new Permission("Notation.edit"));
        permissions.add(new Permission("Notation.list"));
        permissions.add(new Permission("Notation.view"));
        permissions.add(new Permission("Notation.add"));
        permissions.add(new Permission("Notation.delete"));
        permissions.add(new Permission("Echelon.edit"));
        permissions.add(new Permission("Echelon.list"));
        permissions.add(new Permission("Echelon.view"));
        permissions.add(new Permission("Echelon.add"));
        permissions.add(new Permission("Echelon.delete"));
        permissions.add(new Permission("Employe.edit"));
        permissions.add(new Permission("Employe.list"));
        permissions.add(new Permission("Employe.view"));
        permissions.add(new Permission("Employe.add"));
        permissions.add(new Permission("Employe.delete"));
        permissions.add(new Permission("ParcoursUniversitaire.edit"));
        permissions.add(new Permission("ParcoursUniversitaire.list"));
        permissions.add(new Permission("ParcoursUniversitaire.view"));
        permissions.add(new Permission("ParcoursUniversitaire.add"));
        permissions.add(new Permission("ParcoursUniversitaire.delete"));
        permissions.add(new Permission("Grade.edit"));
        permissions.add(new Permission("Grade.list"));
        permissions.add(new Permission("Grade.view"));
        permissions.add(new Permission("Grade.add"));
        permissions.add(new Permission("Grade.delete"));
        permissions.add(new Permission("Departement.edit"));
        permissions.add(new Permission("Departement.list"));
        permissions.add(new Permission("Departement.view"));
        permissions.add(new Permission("Departement.add"));
        permissions.add(new Permission("Departement.delete"));
        permissions.add(new Permission("Poste.edit"));
        permissions.add(new Permission("Poste.list"));
        permissions.add(new Permission("Poste.view"));
        permissions.add(new Permission("Poste.add"));
        permissions.add(new Permission("Poste.delete"));
        permissions.add(new Permission("Echelle.edit"));
        permissions.add(new Permission("Echelle.list"));
        permissions.add(new Permission("Echelle.view"));
        permissions.add(new Permission("Echelle.add"));
        permissions.add(new Permission("Echelle.delete"));
        permissions.add(new Permission("Conges.edit"));
        permissions.add(new Permission("Conges.list"));
        permissions.add(new Permission("Conges.view"));
        permissions.add(new Permission("Conges.add"));
        permissions.add(new Permission("Conges.delete"));
        permissions.add(new Permission("Absence.edit"));
        permissions.add(new Permission("Absence.list"));
        permissions.add(new Permission("Absence.view"));
        permissions.add(new Permission("Absence.add"));
        permissions.add(new Permission("Absence.delete"));
        permissions.add(new Permission("Local.edit"));
        permissions.add(new Permission("Local.list"));
        permissions.add(new Permission("Local.view"));
        permissions.add(new Permission("Local.add"));
        permissions.add(new Permission("Local.delete"));
        permissions.add(new Permission("Notification.edit"));
        permissions.add(new Permission("Notification.list"));
        permissions.add(new Permission("Notification.view"));
        permissions.add(new Permission("Notification.add"));
        permissions.add(new Permission("Notification.delete"));
    }

}


