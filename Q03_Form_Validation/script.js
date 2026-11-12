function validateForm() {
  let n = document.getElementById("name").value;
  let e = document.getElementById("email").value;
  let p = document.getElementById("pass").value;
  if (n === "" || e === "" || p === "") {
    alert("All fields are required");
    return false;
  }
  if (!e.includes("@") || !e.includes(".")) {
    alert("Enter valid email");
    return false;
  }
  if (p.length < 6) {
    alert("Password must be at least 6 characters");
    return false;
  }
  alert("Registration successful");
  return true;
}
