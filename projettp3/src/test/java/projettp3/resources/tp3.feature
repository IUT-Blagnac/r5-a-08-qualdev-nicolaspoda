Feature: Gestion d'une page de notes réservée aux professeurs

  Scenario: Un utilisateur veut accéder à la page de notes
    Given un tableau de bord
    When l'utilisateur clique sur la page "notes" dans le tableau de bord
    Then l'utilisateur accède à la page s'il est professeur et n'y accède pas s'il ne l'est pas