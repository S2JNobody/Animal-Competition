# Animal-Competition
OOP assignment. This program is a game where two people, or one person and a computer, will create Animals and have them compete against one another


## Game Progression
(The words in bold have explanations down below)

The game progresses as follows:

1. Either player versus player or player versus computer must be chosen.
1. The players will choose their names, and then begin creating their **animals**.
1. The program will then select a random **environment** for the competition to take place in.
1. The players animals will then face off in many **categories**, one category by one.
1. Each category will have one player win, or there will be a tie. The winner gets a point.
1. Whoever has the most points after the animals have faced off in every category will be the winner of the game.


### Animals
Animals have names, and each type of animal has a list of Attributes. Each animal can a different attributes, but some attributes are shared between all animals. For example, both a Lion and a Whale have strength and weight, but of these two only the Lion has sharp claws and only the whale has a blowhole. Attributes have names (such as Strength), and a whole number value from 1-20. The value is chosen by the user, so its possible that illogical things will happen like a squirrel being 5 times stronger than a Lion, or Lion weighing more than a whale. The players will chose the type of their animal, the name of their animal, and the values of their animal's attributes. As an example of an Animal, Gert is a Panther that has the Attributes: Strength with a value of 16, Speed with a value of 12, and Stealth with a value of 20.

### Environments
Environments are places or conditions in which the competition between the two animals takes place. An environment will change how big specific attribute's values are when they are used. For example, if the competition takes place in a Desert (Which is an environment), it will be harder to hide since the Desert is very open. Therefore an attribute like stealth is less effective, in this case it is 20% less effective. So if Gert the Panther has a Stealth attribute with a value of 20, that value is reduced to 16 in the Desert environment. Attributes can also be made more effective by an environment.

### Categories
Categories are different groupings of attributes that the animals are compared in. A category will use the attributes of the animals to calculate their score in the category, but it will use the full value of some attributes for this calculation, for others only use part of their value, the rest of the attributes are not used at all. Categories also factor in the effects of environments. To visualize this, say we have a bear. It has great strength and thick fur. Both are useful for defending itself, but its strength is more important in this respect than its fur. So if someone was guessing if it can defend itself, we think of it being able to do so mostly because it is strong, but only slightly because it has thick fur. As an example of how a category works, lets say we have a Fighting category that uses the Strength and Weight attributes at 100% of their value, and the Stealth attribute at 50% of its value. All other Attributes it ignores. If we have Gert the Panther with attributes of Strength at value 15, Weight at value 10, Stealth at 20, and Purpleness at 9000. Additionally, the environment Gert is competing in does not affect any of his attributes. Gert's score will gain 15 for strength, 10 for weight, only 10 for Stealth (20*50%), but nothing for Purpleness. This will make Gert's score for the category a grand total of 35. If Gert's score is greater than that of his opponents, he wins the category.