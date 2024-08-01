using Microsoft.AspNetCore.Mvc;

namespace RunGroopWebApp1.Controllers
{
    public class RaceController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
