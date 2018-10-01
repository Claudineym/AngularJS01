'use strict';

//Create a controller with name alertMessagesController to bind to the feedback messages section.
App.controller('alertMessagesController', function ($scope) {
    // Picks up the event to display a saved message.
    $scope.$on('userSaved', function () {
        $scope.alerts = [
            { type: 'success', msg: 'Record saved successfully!' }
        ];
    });
 
    // Picks up the event to display a deleted message.
    $scope.$on('personDeleted', function () {
        $scope.alerts = [
            { type: 'success', msg: 'Record deleted successfully!' }
        ];
    });
 
    // Picks up the event to display a server error message.
    $scope.$on('error', function () {
        $scope.alerts = [
            { type: 'danger', msg: 'There was a problem in the server!' }
        ];
    });
 
    $scope.closeAlert = function (index) {
        $scope.alerts.splice(index, 1);
    };
});