(function () {
    var file;
    var URL = "/attendance";
    function onLoad() {
        $("#uploadFile").on("click", sendRequest);
        $("#file").on('change', prepareUpload);
        //loader();
    }
    function prepareUpload(event) {
        console.log("uploaded");
        file = event.target.files;
    }

    window.onload = onLoad();

    function sendRequest() {
        var formData = {};
        formData['file'] = file[0];
        formData['test'] = "test text";
        console.log(file[0]);
        console.log(formData);
        $.ajax({
            "url": URL,
            "type": "POST",
            "dataType": "json",
            "data": formData,
            "processData": false,
            "contentType": "application/json",
            "enctype": 'multipart/form-data',
            "success": success,
            "error": error
        });

        function success(data) {
            console.log(data);
        }


        function error(xhr, status, exception) {
            console.log(xhr);
        }
    }

    function serializeObject(form) {
        var jsonObject = {};
        var array = form.serializeArray();
        $.each(array, function () {
            jsonObject[this.name] = this.value;
        });
        return jsonObject;
    };
})();