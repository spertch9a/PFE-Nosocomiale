function send() {

    let patient = {

        NB: document.getElementById('NB').value,
        date: document.getElementById('date').value,
        syptome: document.getElementById('symptome').checked,
        temperature: document.getElementById('temperat').value, 
        tension: document.getElementById('tension').checked,
        pathology: document.getElementById('pathology').checked,
        désaturation: document.getElementById('désaturation').checked,
        KT: document.getElementById('KT').checked,
        Ablation: document.getElementById('Ablation').checked,
        infection_local: document.getElementById('Infect-local').checked,
        secretion: document.getElementById('secretion').checked,
        Modification_sécretion: document.getElementById('Modifsécretion').checked,
        Globules_Blanc: document.getElementById('GB').value,
        CRP: document.getElementById('CRP').value,
        PCT: document.getElementById('PCT').value,
        Radio: document.getElementById('Radio').checked,
        Toux: document.getElementById('Toux').checked,
        Dyspnée: document.getElementById('dyspnée').checked,
        sondage: document.getElementById('sondage').checked,
        Pyrie: document.getElementById('pyurie').checked,
        brulure: document.getElementById('brulure').checked,
        douleur: document.getElementById('douleur').checked,
        frisson: document.getElementById('frisson').checked,
        k: document.getElementById('k').value

    }
     sessionStorage.setItem('request', JSON.stringify(patient));
    console.log(patient)
    var json_data = patient
    var url = new URL("http://traumas.eu.ngrok.io/sendsInfo/");


    url += document.getElementById('k').value
    fetch(url, {
        "method": "POST",
        "headers": {
            "Content-Type": "application/json",
            "Accept": "application/json"
        },

        "body": JSON.stringify(json_data)
    })
        .then(response => response.json()).then(response => {
            console.log(response);
            sessionStorage.setItem('request', JSON.stringify(json_data));
            sessionStorage.setItem('response', JSON.stringify(response));
            // window.open("");

        }).then(data => {
            output.textContent = "";
            output.textContent = "$(data.age)";
        })
        .catch(err => {
        
        });
}

