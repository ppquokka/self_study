window.addEventListener('DOMContentLoaded', (event) => {
    fetch('/checkLoggedIn')})
        .then(response => {
            if (response.ok) { }
            else {
                window.location.replace('/login.html');
            }
        });