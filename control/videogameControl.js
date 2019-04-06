var app = angular.module('videogameModule', []);
app.controller('videogameControl', function ($scope, $http) {

    var url = 'http://localhost:8080/videogames';

    $scope.pesquisar = function () {
        $http.get(url).then(function (response) {
            $scope.clientes = response.data;
        }, function (error) {
            alert(error);
            console.log(error);
        });
    }

    $scope.salvar = function () {
        if (typeof $scope.cliente.codigo == 'undefined') {
            $http.post(url, $scope.cliente).then(function (response) {
                $scope.clientes.push(response.data);
                $scope.novo();
            }, function (error) {
                alert(error);
                console.log(error);
            });
        } else {
            $http.put(url, $scope.cliente).then(function () {
                $scope.pesquisar();
                $scope.novo();
            }, function (error) {
                alert(error);
                console.log(error);
            });
        }
    }

    $scope.excluir = function () {
        if (typeof $scope.cliente.codigo == 'undefined') {
            alert('Escolha um video game');
        } else {
            urlExcluir = url + "/" + $scope.cliente.codigo;
            $http.delete(urlExcluir).then(function () {
                $scope.pesquisar();
                $scope.novo();
            }, function (error) {
                alert(error);
                console.log(error);
            });
        }
    }


    /*$scope.clientes = [
                {'codigo':'1',
                 'nome':'Atari',
                 'nomejogo':'River Rider',
                 'categoria':'Simulador',
                 'ano':'1995',
                 'jogabilidade':'excelente',
                 'notas':'10',
                 'piorjogo':'ET o extraterrestre'
                },
                {'codigo':'2',
                 'nome':'Nintendo',
                 'nomejogo':'Internacional Super Star Soccer',
                 'categoria':'Futebol',
                 'ano':'1998',
                 'jogabilidade':'excelente',
                 'notas':'10',
                 'piorjogo':'Shaq-Fu'},
            ]
      */
    $scope.novo = function () {
        $scope.videogame = {};
    }

    $scope.seleciona = function (cliente) {
        $scope.videogame = videogame;
    }

    $scope.pesquisar();
    $scope.novo();

});