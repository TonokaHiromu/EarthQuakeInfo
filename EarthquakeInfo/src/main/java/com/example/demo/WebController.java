package com.example.demo;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping("/")
	public String getHome(Model model) {
		int i = 0;
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		EarthquakeDataService FDFAPI = new EarthquakeDataService(restTemplateBuilder);
//		EarthquakeData EQData = FDFAPI.fetchSingleDataFromAPI();
//		
		EarthquakeInfoData earthquakeInfoData; //= EQData.getEarthquake();
    	HypocenterInfoData hypocenterInfoData; //= earthquakeInfoData.getHypocenter();
//        System.out.println("地震ID: " + EQData.getId()+"\n地震地点:"+hypocenterInfoData.getName());
//		model.addAttribute("quakeTime",EQData.getTime());
//		model.addAttribute("quakePointName",hypocenterInfoData.getName());
//		model.addAttribute("maxScale",Convert.shindo(earthquakeInfoData.getMaxScale()));
//		model.addAttribute("magnitude",Convert.magnitude(hypocenterInfoData.getMagnitude()));
//		model.addAttribute("quakePointDepth",hypocenterInfoData.getDepth());
//		model.addAttribute("tsunami",Convert.tsunami(earthquakeInfoData.getDomesticTsunami()));
//		model.addAttribute("mapURL","http://maps.google.co.jp/maps?ll="+hypocenterInfoData.getLatitude()+", "+hypocenterInfoData.getLongitude()+"&q="+hypocenterInfoData.getLatitude()+", "+hypocenterInfoData.getLongitude()+"&output=embed&t=m&z=8");
		for (EarthquakeData earthquake : FDFAPI.fetchMultiDataFromAPI()) {
			i++;
			if (true) {
				earthquakeInfoData = earthquake.getEarthquake();
	    		hypocenterInfoData = earthquakeInfoData.getHypocenter();
	    		if(i==1) {
	    			model.addAttribute("quakeTime",earthquake.getTime());
	    			model.addAttribute("quakePointName",hypocenterInfoData.getName());
	    			model.addAttribute("maxScale",Convert.shindo(earthquakeInfoData.getMaxScale()));
	    			model.addAttribute("magnitude",Convert.magnitude(hypocenterInfoData.getMagnitude()));
	    			model.addAttribute("quakePointDepth",hypocenterInfoData.getDepth());
	    			model.addAttribute("tsunami",Convert.tsunami(earthquakeInfoData.getDomesticTsunami()));
	    			model.addAttribute("mapURL","http://maps.google.co.jp/maps?ll="+hypocenterInfoData.getLatitude()+", "+hypocenterInfoData.getLongitude()+"&q="+hypocenterInfoData.getLatitude()+", "+hypocenterInfoData.getLongitude()+"&output=embed&t=m&z=8");
	    		}
	    		model.addAttribute("past"+i+"quakeTime",earthquakeInfoData.getTime());
	    		model.addAttribute("past"+i+"quakePointName",hypocenterInfoData.getName());
	    		model.addAttribute("past"+i+"maxScale",Convert.shindo(earthquakeInfoData.getMaxScale()));
	    		model.addAttribute("past"+i+"magnitude",Convert.magnitude(hypocenterInfoData.getMagnitude()));
			}
    		
        // 他の情報も表示する
		}
		return "home";
	}
//	
//	@GetMapping("/day")
//	public String getday() {
//		return "day";
//	}
//	
//	@GetMapping("/morning")
//	public String getmorning() {
//		return "morning";
//	}
//	
//	@GetMapping("/noon")
//	public String noon() {
//		return "noon";
//	}
//	
//	@GetMapping("/evening")
//	public String evening() {
//		return "evening";
//	}
//	
//	//ログインページ
//	@GetMapping("/login")
//	public String login() {
//		return "login";
//	}
//	
//	//マイページ２
//	@PostMapping("/mypage")
//	public String mypage(Person p,Model model) {
//		model.addAttribute("Name", "名前: " + p.getName());
//		model.addAttribute("Age", "年齢: " + p.getAge() );
//		System.out.println(p.getName()+p.getAge());
//		System.out.println("ログイン要求");
//		return "mypage";
//	}
//	
//	@GetMapping("/sample3_input")
//	public String sample3_input(Model model) {				
//		model.addAttribute("title", "入力画面3です。");
//	    model.addAttribute("form", new ThreeTextForm_Validated());        
//		return "sample3_input";
//	}
//
//	@PostMapping("/sample3_result")
//	public String sample3_result(@Validated @ModelAttribute("form") ThreeTextForm_Validated form, BindingResult bindingResult, Model model) {
//
//		System.out.println("paramA : " + form.getParamA());
//		System.out.println("paramB : " + form.getParamB());
//		System.out.println("paramC : " + form.getParamC());
//
//		if(bindingResult.hasErrors()) {
//			model.addAttribute("title", "入力画面3の再入力です。");
//	        model.addAttribute("form", form);        
//			return "sample3_input";
//		}
//		
//	    model.addAttribute("form", form);
//	    
//	    return "sample3_result";
//	}
//	
//	@Autowired
//	MyService service;
//	//PersonLists
//	@GetMapping("/PersonLists")
//	public String getUsers(Model model) {
//		ArrayList<Person> persons = service.getPersonList(); // MyServiceからPersonのリストを取得
//		System.out.println(persons);//コンソール出力
//		model.addAttribute("persons",persons);
//		return "PersonLists";
//	}
	
	//データベースえーじ
	
	
}
