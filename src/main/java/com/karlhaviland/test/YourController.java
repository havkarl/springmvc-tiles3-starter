package com.karlhaviland.test;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller responsible for managing requests to the segments page.
 */
@Controller
@RequestMapping("/test")
public class YourController {

    @Resource private YourService yourTestService;

	@ModelAttribute(value = "a_list_of_super_powers")
	public List<String> getListOfSuperPowers(){
		return yourTestService.findAllSuperPowers();
	}

	/**
	 * When the measure is selected to be edited.  This forwards the URL to the edit page.
	 * @param model
	 * @return String: "the-actual-jsp-name"
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String edit(@ModelAttribute("superHero") SuperHero superHero, ModelMap model) {
		System.out.println("you are saving the super hero " + superHero.getName() + " with super power of " + superHero.getSuperPower());
		model.addAttribute("superHero", superHero);
		yourTestService.saveSuperHero(superHero);

		return "the-actual-jsp-name";
	}

	/**
	 * Returns the full list of measures and displays them on the screen.
	 * @param model
	 * @return String: "the-actual-jsp-name"
	 */
	@RequestMapping(value="/find-super-powers/{superPower}", method=RequestMethod.GET)
	public String find(@PathVariable String superPower, ModelMap model) {
		System.out.println("Finding the people with the super power " + superPower);
		List<SuperHero> tests = yourTestService.findAllBySuperPowers(superPower);
		model.addAttribute("tests", tests);

		return "the-actual-jsp-name";
	}
}
