import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="laptop")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Laptop {
    @Id
    private int laptop_id;
    private String brand;
    private String model;
    private int ram_size;
}
