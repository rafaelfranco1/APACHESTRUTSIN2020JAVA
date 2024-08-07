1 - Application Dbcontext
2- Criar Constructor
3- parametrizar construtor com ApplicationDbContext context
4 - this.context = context;
5 - var products = contexts.Products.ToList();
6 - return View(products);

namespace BestStoreMVC.Controllers
{
	public class ProductsController : Controller
	
	{
		public ProductsController(ApplicationDbContext context)
		{
			this.context = context;
		}
	
		public IActionResult Index()
		{
			var products = contexts.Products.ToList();
			return View(products);
		}
	}
	
}