function setCookie() {
    document.cookie = "username=Koushik; max-age=3600";
    alert("Cookie Created");
}

function getCookie() {
    document.getElementById("result").innerHTML =
        "Cookie: " + document.cookie;
}

function deleteCookie() {
    document.cookie = "username=; max-age=0";
    alert("Cookie Deleted");
}