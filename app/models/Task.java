/**
 * @author xingyuchen
 * Created on Apr 10, 2016
 */
package models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.Model;

/**
 * @author xingyuchen
 *
 */

@Entity
public class Task extends Model{
    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String name;

    public boolean done;

    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();
}
