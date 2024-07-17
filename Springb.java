//58 34 CRUD

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity //jakarta persistence
@Table(name = "TB_PRODUCTS") //jakarta persistence
public class ProductModel implements Serializabe { //jakarta.io
	private static final long serialVersionUID = 1L;//controle de versão , para as 
	//classes que forem serializadas 
	@Id //jakarta persistence
	@GeneratedValue(strategy=GenerationType.Auto) //jakarta persistence
	private UUID idProduct; //java util uuid são universais e não sequenciais em arquiteturas
	//distribuidas de microservices, identificadores distribuidos evita muitos conflitas
	private String name;
	private BigDecimal value; //java.math
	
	public UUID getIdProduct() {
		return idProduct;
	}
	
	public UUID setIdProduct(UUID idProduct) {
		this.idProduct = idProduct;
	}
	
	public String  getName() {
		return name;
	}
	
	public String setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getValue() {
		return value;
	}
	
	public BigDecimal setValue(BigDecimal value) {
		this.value = value;
	}
}

//repositories interface do JPA diversos métodos prontos sem precisar implementar cada
//um deles 
//46
import com.example.springboot.models.ProductModel;
import java.util.UUID;
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> { //precisa extender
//o JpaRepository 
	
	
	
	
}
//Estudar beans do spring
//beans - determinada classe é um bean , 
//@Component bean generico gerenciado por ele
//@Service - Classe de serviço regra de negócio
//@Repository - Gerenciada por ele com transações com base de dados
//@Controller gerenciada por ele mas pode ter endpoints 

//Controllers
@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;//ponto de injeção para a interface com acesso
	//aos metodos jpa quando tiver necessidade para usar nosso repositório 
	
	//DTO - Data Transfer Object
	//metodo post http - receber recursos , fazer uma validação inicial e salvar 
	//precisa colocar @Valid
	//Bean utils converter dto para model 
	@PostMapping("/products") //"/products é a URI
	public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productRecordDto) {
		var productModel = new ProductModel();
		BeanUtils.copyProperties(productRecordDto, productModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
	}
	
	//4 Niveis
	//Nivel 0 - Usar o protocolo HTTP
	//Primeiro nivel - Recursos bem definidos e o correto usa das URI , de substantivos 
	//Nivel 2 - Metodos HTTP de forma semantica , ou seja usar os metodos para 
	//qual foram feitos . SALVAR utilizamos POST , apenas listar GET , deletar DELETE 
	//atualizar PUT 
	
}

//POST receber o recurso e salvar na base de dados poderia ser por model 
//
//
//para receber estes valores precisa do DTO 
//records para fazer DTO
//se tudo tiver certo faz a conversão para o model 
//escolher record 
//importar jakarta validation
//Serialização para o objeto java , fazer as validações iniciais , depois transformar em model
//DTO é o que vai ser salvo na base de dados 
public record ProductRecordDto(@NotBlank String name , @NotNull BigDecimal value) {
	//records são imutaveis apenas metódos getters , privates e final 
	
	
	
}