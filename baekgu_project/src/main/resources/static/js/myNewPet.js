let number = 1;

function myNewPet()
{
  let stringNumber = number.toString();
  let petinf_id = "PI-" + stringNumber;
  document.getElementById('myNewPet').value = petinf_id;
  number = number + 1;
}