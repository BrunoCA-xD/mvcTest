/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcTest.model.bo;

import java.util.List;
import mvcTest.model.dao.PessoaDAO;
import mvcTest.model.vo.PessoaVO;

/**
 *
 * @author bruno
 */
public class PessoaBO {

    public void save(PessoaVO p) throws MyException {
        new PessoaDAO().save(p);
    }

    public void list() {
        //new PessoaDAO().list();
    }

    public List<PessoaVO> lista() {
        List l = null;
        return l;
//return new PessoaDAO().lista();
    }
}
