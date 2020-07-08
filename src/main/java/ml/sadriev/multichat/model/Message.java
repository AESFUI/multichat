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
@Table(name = "table_message")
public class Message {

    @Id
    @GeneratedValue(generator = "system-uuid")
    private UUID id;

    @Column(length = 32, updatable = false)
    private String nickNameFrom;

    @Column(length = 32, updatable = false)
    private String nickNameTo;

    @Column(unique = false, updatable = false, length = 255, nullable = false)
    private String text;
}
