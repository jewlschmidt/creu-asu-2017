## Oct 29, 2017 - Nov 5, 2017
Our team met this week to go through possible factors and indicators that could help to create our ontology. We decided that the best way to go about creating a single, all-encompassing index was to split data into three sub-indexes: Social, Economic, and Ecological. These sub-indexes are made up of indicators, which create scores from factors containing datasets. Indicators include concepts like health, the amount of green space in a neighborhood, or the number of entertainment values in an area. We also spent time searching for datasets that would support each factor- for example, CDC datasets indicating suicide life expectancy rates in different areas.

When creating the ontology, the biggest challenge will be normalizing the data in order to create consistent indicators and indexes. We will need to find a way to bring together unlike data such as per capita rates and location counts in a meaningful way that does not unequally weight one over the other.

I continued to search for research on sustainability and ontologies this week, but it really seems like we have exhausted meaningful possibilities.

## Oct 22, 2017 - Oct 28, 2017

Unfortunately, I was not able to complete much work this week due to schoolwork. However, I was able to brainstorm some ideas for ways to create our ontology. We will most likely use a multilayered approach to build a main index from other indexes, which will be made up of multiple datasets.

## Oct 15, 2017 - Oct 21, 2017
This week, I continued to focus on creating a definition of sustainability that would give our application the greatest amount of relevancy in day-to-day use across the widest audience. As a team, we decided that we would pursue a thin version of sustainability so that we could address environmental concerns alongside financial and societal ones.

In order for thin sustainability to remain sustainable, a safe minimum standard must be established in order to prevent the tradeoff between different capitals does not result in an irreversible loss. Bryan Norton theorized that a safe minimum standard exists that separates low-cost but irreversible tradeoffs from high-cost but reversible tradeoffs. This standard would provide a bit more nuance to the idea of what are and are not acceptable losses.

If we are to develop a standard index that defines the relative sustainability of an area, it would make sense to have a relative idea of what defines an acceptable or unacceptable rating. This safe minimum standard could help us define a baseline.

## Oct 8, 2017 - Oct 14, 2017
This week, I tried to find research articles that would provide more guidance, structure, and reputability to the focus areas defined two weeks ago. Two papers, <i>The Difficulty in Defining Sustainability</i> (M.A. Toman, 1992) and <i>Defining Sustainability: A Conceptual Orientation</i> (R.O. Vos, 2007), really stood out to me because they broke down the many definitions of sustainability into concrete parts.

### Core Definitions
Both papers provided a core idea of sustainability that seems to be present no matter the other factors taken into account. Toman defines the core of sustainable development as "development that meets the needs of the present without compromising the ability of future generations to meet their own needs" (3), while Vos lists a few important elements that must be addressed in any definition: economy, environment, and society. Vos also notes that sustainability separates itself from other ways of looking at these elements by emphasizing intergenerational equity and going above and beyond mere compliance with laws and regulations.

It will be important for our team to take these core ideas when creating a definition of 'sustainable' for our end project.

### 'Thin' and 'Weak' vs. 'Thick' and 'Strong'
Based on these papers and other research done this week, sustainability has been split into two types of thought: 'Thin' or 'Weak' sustainability, which prioritizes the relative well-being of people in society, and 'Thick' or 'Strong' sustainability, which prioritizes maintaining the environment over all else. While some would argue that these are the same, the line between the two is something that really interested me.

Vos posits that "in terms of the ontology of nature, the difference in thickness for definitions of sustainability is how much of nature is valued intrinsically". Basically, thin sustainability seeks to ensure that the overall capital value present in society- natural, financial, technological, etc- must remain undiminished for future generations, even if the balance of these resources changes. Thick sustainability views any diminution in the value of natural capital as a negative, even if it results in growth of other areas.

For the purposes of our project, it seems that the thinness or thickness of our definition will differ based on the audience. Families looking to buy homes will look for stability; corporations will look for growth in financial areas; environmentalists will look for growth in nature. Perhaps we could implement separate sustainability ratings in order to appeal to a wider audience.

## Oct 1, 2017 - Oct 7, 2017
This week, I spent the majority of my time at the Grace Hopper Celebration of Women in Computing. While I was there, I had the opportunity to look at the research others were presenting in order to get an idea of what our team should be looking to complete for conferences next fall. I also reviewed papers and tutorials from the rest of the project in order to refresh my memory. During this review, I looked for different ways that our team could define sustainability. An important step will be to give ourselves a defined scope in order to avoid attempting to go too deep or do too much with the time & labor resources that we have. In addition to the focus areas defined in last week's post, beginning with a list of perimeters for our database will prevent excessive information gathering and redundant or irrelevant work. Next week's tasks will include defining some of these perimeters and brainstorming specific areas of sustainability that must be included in the project.

## Sept 24, 2017 - Sept 30, 2017
I continued reading papers discussing ontology creation and use this week, including <i>Building Urban LOD for Solving Illegally Parked Bicycles in Tokyo</i>, <i>Linked Data Analytics in Interdisciplinary Studies: The Health Impact of Air Pollution in Open Areas</i>, and <i>A Physician Advisory System for Chronic Heart Failure Management Based on Knowledge Patterns</i>. The last paper revolved around ASP, an acronym with which I was not immediately familiar. Once I refreshed my knowledge of the framework, it became easier for me to process the paper. Based on these papers and our team discussion on Monday, I began to put together some general areas of 'sustainability' that it might be beneficial to focus on during the project.

### Focus Areas in Sustainability Ratings
When selecting focus areas, I felt that there were some key factors that should be considered in order to maximize functionality and applicability.

#### Relevancy
The first factor was relevancy, or whether or not the data would actually be used in a public app or website. This is important because the large amount of available data can not be feasibly connected or represented using our current resources. Cutting out data that will not be often used by our target client base will allow the team to focus on creating quality references and a usable interface.

#### Potential for Effect
Another important factor to consider is the data's potential to affect the neighborhood in the long-term. It will be important to include data that has direct consequences on the sustainability of a neighborhood, even if it might not be specifically looked for.

#### Audience
A final important factor that must be taken into effect is the viewer of the end product. Data such as school quality and social opportunities may not be directly related to 'sustainability', but site users looking for information on living in a given area will likely be interested in this data.

## Sept 17, 2017 - Sept 23, 2017
This week, I focused on reading through research on ontology creation, including <i>Clinga: Bringing Chinese Physical and Human Geography in Linked Open Data</i>, <i>FOOD: FOod in Open Data</i>, and <i>An Ontology of Soil Properties and Processes</i>. For the sake of brevity, I'll only summarize one here. I also reviewed various tutorials on important technologies and literature from the last two weeks.

#### Clinga: Bringing Chinese Physical and Human Geography in Linked Open Data
Before this project was completed, there was a severe lack of geographical data based on Chinese names. Only 37% of China-based geographical features were referenced by Chinese names. Clinga was developed in order to better identify Chinese geographical features, their relations, and their Chinese names.

In order to create ontologies, Clinga used data gained from Baidu Baike. This database was chosen for the depth and breadth of information, but inconsistencies in its infrastructure and linking required a great effort when crawling for data. First, information was acquired from concrete points, such as titles, infoboxes, and disambiguations. The high levels of inconsistency required that a new ontology be created. The foundation for the ontology was created through heuristic rules and then refined through a machine learning algorithm.

Once entities were ID'd, properties for each entity were extracted from infobox keys. Finally, Clinga was linked to other databases to promote knowledge sharing. This new ontology was determined necessary because while other work has been done in this area, it has not gone as in-depth and has not provided as complete of a database as Clinga does.

## Sept 10, 2017 - Sept 16, 2017
I wasn't able to get much done this week due to career fair and class obligations. I plan to make up this time over the next few weeks.

## Sept 3. 2017 - Sept 9, 2017
This week, I worked on setting up this blog and working through tutorials for XML/XMLSchema, including RDF. I also read through research pertaining to our project that focused on Linked Data, Big Data, and The Semantic Web. These papers led me to do additional research on topics that I did not entirely understand and build a library of resources for the project.

The next steps will be to figure out a plan of action for the group and assign roles and tasks.
