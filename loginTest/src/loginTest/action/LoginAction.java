package loginTest.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import loginTest.dao.LoginDAO;

public class LoginAction extends ActionSupport implements SessionAware{
    /**
     *
     */
    private static final long serialVersionUID = 7066359893826469749L;
    public String id;
    public String password;
    private Map<String,Object>session;

    public String execute(){

        LoginDAO dao = new LoginDAO(); //LoginDAOクラスを作成すると波線が消える
        boolean res = dao.select(id,password);

        if(!res){
            return ERROR;
        }

        session.put("id", id);
        return SUCCESS;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Map<String, Object> getSession(){
        return session;
    }

    public void setSession(Map<String, Object> session){
        this.session = session;
    }
}
