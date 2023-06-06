package UserAdmin;

import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Controller extends SelectorComposer <Component> {

    /*active,userName,name,email,role*/
    @Wire
    private Listbox userListbox;
    @Wire
    private Checkbox isActiveLabel = new Checkbox();
    @Wire
    private Textbox userNameLabel;
    @Wire
    private Textbox nameLabel;
    @Wire
    private Textbox emailLabel;
    @Wire
    private Combobox roleLabel;
    private ListModelList<User> dataModel = new ListModelList<>(); //List of User objects
    private UserServiceImpl userService = new UserServiceImpl();





    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        List<User> users =  userService.findAll();
        dataModel = new ListModelList<User>(users);
        userListbox.setModel(dataModel);

    }

    @Listen("onSelect = #userListbox")
    public void showDetails(){

        Set<User> selection = dataModel.getSelection();
        User selected = selection.iterator().next();
        isActiveLabel.setChecked(selected.getActive());
        // isActiveLabel.setValue(selected.getActive());
        userNameLabel.setValue(selected.getUserName());
        nameLabel.setValue(selected.getName());
        emailLabel.setValue(selected.getEmail());
        roleLabel.setValue(selected.getRole());

        dataModel.addToSelection(selected);

    }


    @Listen("onCheck = #check")
    public void isChecked(ForwardEvent evt){


        Checkbox chkBx = (Checkbox) evt.getOrigin().getTarget();
        Listitem lsItem = (Listitem) chkBx.getParent().getParent();

        boolean cheked = chkBx.isChecked();
        boolean Value = isActiveLabel.getValue();

    }


    private List<String> options;
    public void Options(){
        options = new ArrayList<String>();
        options.add("Administrator");
        options.add("Data Steward");
        options.add("CPU User");

    }
    public List<String> getOptions(){
        return options;
    }



}































