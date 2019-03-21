(function () {
    var URL = "/attendance";

    function loader() {
        $(document).ajaxStart(function () {
            $("#loader-container").fadeIn();
        }).ajaxStop(function () {
            $("#loader-container").fadeOut();
        });
        $("#loader-container").fadeOut();
    }

    function onLoad() {
        $("#uploadFile").on("click", sendRequest);
        $("#files").on('change', prepareUpload);
        loader();
    }

    function sendRequest() {
        var data = new FormData($('#attendance')[0]);
        console.log(data);
        $.ajax({
            url: URL,
            type: "POST",
            data: data,
            enctype: 'multipart/form-data',
            dataType: 'json',
            contentType: 'application/json',
            processData: false,
            contentType: false,
            cache: false,
            success: success,
            error: error
        });

        function success(data) {
            //$('#attendanceTableBody').clear();
            var row = '';
            for (var i = 0; i < data.length; i++) {
                row += '<tr>' +
                    '<td>' +
                    '<span class="icon has-text-success">\n' +
                    '<i class="fas fa-check-square"></i>\n' +
                    '</span></td>' +
                    '<td>' + data[i].student.code.studentId + '</td>' +
                    '<td>' + data[i].attendanceType.type + '</td>' +
                    '<td>' + (data[i].block != null ? data[i].block.block : 'Empty') + '</td>' +
                    '<td>' + data[i].attendanceDate + '</td>' +
                    '<td>' + data[i].period + '</td>' +
                    '<td>' + (data[i].present == 1 ? true : false) + '</td>' +
                    '<td> ' + data[i].location.name + '</td>' +
                    '</tr>';
            }
            $('#attendanceTableBody').append(row);
        }

        function error(xhr, status, exception) {
            console.log(xhr);
        }
    }

    function prepareUpload(event) {
        var files = event.target.files;
        var len = files.length;
        var file_names = '';
        for (var i = 0; i < len; i++) {
            file_names += (i > 0 ? ' ' : '') + files[i].name + (i + 1 < len ? ',' : '');
        }
        $('#selected-files').text(file_names);
        $('#file-numbers').text(len == 1 ? '(1) file' : '(' + len + ') files');
    }

    window.onload = onLoad();
})();