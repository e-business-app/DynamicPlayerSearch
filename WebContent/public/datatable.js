
let app = angular.module('playerApp', []);

/**
 * 
 * @param $scope has all variables in the current scope
 * @param $http required service to make get request.
 * @returns
 */
app.controller('playerCtrl', function($scope, $http) {
	const cols =[ { data: "id", title : "ID" },
    { data: "fullName" , title: "Player Name"},
    { data: "age", title: "Age" },
    { data: "country", title: "Country" },
    { data: "rating", title: "Rating" },
    { data: "potential", title: "Potential" },
    { data: "team", title: "Team" },
    { data: "price", title: "Price" },
    { data: "wage", title: "Wage" },
    { data: "totalStats", title: "Total Stats" }
    ];
	const table = $('#example').DataTable({"columns":cols,"searching":false});
	$scope.checkPlayer = function(){
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