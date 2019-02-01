let app = angular.module('playerApp', []);
app.controller('playerCtrl', function($scope, $http) {
	 // $scope.playerName = "Lionel";
	var cols =[ { data: "id", title : "id" },
    { data: "fullName" , title: "Player Name"},
    { data: "age", title: "age" },
    { data: "country", title: "country" },
    ];
	 
	//$("#table").DataTable({"columns":cols});
	var table = $('#example').DataTable({"columns":cols,"searching":false});
	$scope.checkPlayer = function(){
		//$('#example').dataTable().destroy();
		let playerName=$scope.playerName;
		$http.get('http://localhost:8088/EBusinessGroupAssignment1/Player/'+playerName)
		  .then(function(response) {
		    $scope.playerInfo = response.data;
		    table.clear().draw();
		    table.rows.add(response.data);
		    table.columns.adjust().draw(); 
		    /*({
		        "aaData": $scope.playerInfo,
		        "aoColumns": [
		            { "mData": "id" },
		            { "mData": "fullName" },
		            { "mData": "age" },
		            { "mData": "country" }
		        ]
		    });*/
		  });
		
	}
	});