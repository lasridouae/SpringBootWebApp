package com.spring.springApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springApp.models.Photo;
import com.spring.springApp.services.PhotoService;

@RestController
public class PhotoController {
	
	@Autowired
	PhotoService photoService;
	
		@GetMapping("/photo")
		private List<Photo> getAllPhotos() {
			return photoService.getAllPhotos();
		}

		
		@GetMapping("/photo/{idPhoto}")
		private Photo getphoto(@PathVariable("idPhoto") Long idPhoto) {
			return photoService.getProduitById(idPhoto);
		}

		
		@DeleteMapping("/photo/{idPhoto}")
		private void deletephoto(@PathVariable("idPhoto") Long idPhoto) {
			photoService.delete(idPhoto);
		}

	
		@PostMapping("/photos")
		private Long savephoto(@RequestBody Photo photos) {
			photoService.saveOrUpdate(photos);
			return photos.getIdPhoto();
		}

		
		@PutMapping("/photos")
		private Photo update(@RequestBody Photo photos) {
			photoService.saveOrUpdate(photos);
			return photos;
		}
	

}
