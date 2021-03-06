package asw.i2b.model;

import asw.i2b.dao.dto.Comment;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

/**
 * Created by Pineirin on 30/03/2017.
 */
public class ProposalCreation {

    private String category;
    private String title;
    private String body;

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
}

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

}
