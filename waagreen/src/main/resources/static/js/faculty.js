$(document).ready(function () {

    $("#mybtn").click(function () {
        $("#result").html("");
        $("#result").append('<tr><th>NAME</th><th>SUPOSED MEDITATION DAYS</th><th> MEDITATION DAYS</th><th> MEDITATION PERCENTAGE</th><th>EXTRA POINTS</th></tr>');
        var bl = $("#blockid").val();
        var cr = $("#courseid").val();
        $.ajax({
            type: 'GET',
            url: "http://localhost:8080/faculty/Restfaculty?block=" + bl + "&&" + "course=" + cr,
            dataType: "json", // Accept header
            contentType: 'application/json', // Sends - Content-type possibledays meditationdays
            success: function (response) {
                var resultlist = response;
                $.each(response, function (i, data) {
                    $("#result").append('<tr><td>' + data.student.firstName + '</td><td>' + data.possibledays + '</td><td>' + data.meditationdays + '</td><td>' + data.percentage + '</td><td>' + data.extrapoint + '</td></tr>');
                });
                $("#result").show();

            },
            error: function (errorObject) {
                alert("error");

            }
        });
    });

});