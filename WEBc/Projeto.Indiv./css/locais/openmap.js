function openmap() {
	const country = document.getElementById("countriesDropdown").value;
	const city = document.getElementById("citiesDropdown").value;
	
	const popup = document.getElementById('popup');
  
	if (country === "1" && city === "1") {
	  popup.classList.remove('d-none');
	} else {
	  popup.classList.add('d-none');
	}
  }
  