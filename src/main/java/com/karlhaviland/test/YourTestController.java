package com.karlhaviland.test;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Controller responsible for managing requests to the segments page.
 */
@Controller
@RequestMapping("/test")
public class YourTestController {

    @Resource private YourTestService yourTestService;

	@ModelAttribute(value = "a_list_of_super_powers")
	public List<String> getListOfSuperPowers(){
		return yourTestService.findAllSuperPowers();
	}

	/**
	 * When the measure is selected to be edited.  This forwards the URL to the edit page.
	 * @param model
	 * @return String: "edit-test"
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String edit(@ModelAttribute("test") Test test, ModelMap model) {
		System.out.println("you are saving the test object " + test.getName() + " with super power of " + test.getSuperPower());
		model.addAttribute("test", test);

		return "the-actual-jsp-name";
	}

	/**
	 * Returns the full list of measures and displays them on the screen.
	 * @param model
	 * @return String: "measures"
	 */
	@RequestMapping(value="/find-super-powers/{superPower}", method=RequestMethod.GET)
	public String find(@PathVariable String superPower, ModelMap model) {
		System.out.println("Finding the people with the super power " + superPower);
		List<Test> tests = yourTestService.findAllBySuperPowers(superPower);
		model.addAttribute("tests", tests);

		return "the-actual-jsp-name";
	}
}
