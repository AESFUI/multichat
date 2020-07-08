package ml.sadriev.multichat.model;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "table_user")
public class User {

    @Id
    @GeneratedValue(generator = "system-uuid")
    private UUID id;

    @Column(length = 32, unique = true, updatable = false)
    private String nickName;
}
