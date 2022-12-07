package com.example.mylocal.touristGuide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mylocal.R;
import com.example.mylocal.touristGuide.adapter.GuideAdapter;
import com.example.mylocal.touristGuide.model.GuideData;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TouristGuideActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_guide);

        recyclerView = findViewById(R.id.guideRec);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                recyclerView.scheduleLayoutAnimation();
                recyclerView.setAdapter(new GuideAdapter(getGuideData().stream().map(GuideData::getTitle).collect(Collectors.toList()), (position, value) -> {
                    startActivity(new Intent(TouristGuideActivity.this, GuideDetailActivity.class)
                            .putExtra("data", getGuideData().get(position).getDesc())
                            .putExtra("title",getGuideData().get(position).getTitle())
                    );
                }));
            }
        }, 100);





    }

    private ArrayList<GuideData> getGuideData() {
        ArrayList<GuideData> arrayList = new ArrayList<>();

        arrayList.add(new GuideData(
                "History of Greenwich",
                "<h2><mark>Early Greenwich</mark></h2>\n" +
                        "<p>Greenwich began as a Saxon village. It was called green wic (the word wic meant a port). So from the beginning, it was a place where ships and boats were tied up. From the beginning, Greenwich was a fishing village as well as a farming settlement.</p>\n" +
                        "<p>The original St Alfege&rsquo;s Church was built in the 11th century on the site where Alfege, Archbishop of Canterbury was killed in 1012. The present building was designed by Nicholas Hawksmoor. It was completed in 1718. General Wolfe (1727-1759), who was killed in Quebec was buried in the church. In 1930 a statue of him was erected in Greenwich.</p>\n" +
                        "<p>In the early 16th century, Henry VII owned a palace at Greenwich. Henry VIII was born there. His daughters Mary and Elizabeth were also born in Greenwich Palace. The palace was demolished by Charles II.</p>\n" +
                        "<p>In the early 17th century James I decided to build a new house at Greenwich for his queen Anne of Denmark. It was designed by Inigo Jones (1573-1652) and it is known as the Queen&rsquo;s House. It was the first classical building in England.</p>\n" +
                        "<p>The Queen&rsquo;s House was completed in 1637. However, Anne died before it was finished and it was given to Henrietta Maria, wife of Charles I. She was so please with it she called it her House of Delights.</p>\n" +
                        "<p>Meanwhile, in 1613 the Earl of Northampton founded Trinity Hospital (actually an almshouse) in Greenwich.</p>\n" +
                        "<p>Greenwich Park was laid out as a hunting ground by the Duke of Gloucester in 1433. In the early 17th century James I built a brick wall around the park and in the late 17th century a French landscape gardener called Andre Le Notre who designed the gardens at the palace of Versailles designed a garden for Greenwich Park. The Ranger&rsquo;s House was built in 1688.</p>\n" +
                        "<p>The National Observatory was built in 1675 by Charles II for John Flamsteed (1646-1719), the first Astronomer Royal who lived in Flamsteed House in Greenwich.</p>\n" +
                        "<p>Then in 1694, Christopher Wren designed the Royal Hospital for Seamen at Greenwich. The Painted Hall was painted by Sir James Thornhill (1675-1734). In 1804 the hospital was made into the Royal Naval College.</p>\n" +
                        "<p>In 1735 a statue of George II dressed as a Roman emperor was sculpted by John Rysback and erected in Greenwich.</p>\n" +
                        "<h2><mark>Modern Greenwich</mark></h2>\n" +
                        "<p>In 1838 Greenwich was connected to London by railway. As a result, people flocked to live in Greenwich and it was engulfed by the growing city.</p>\n" +
                        "<p>In 1884 the meridian (the line running north to south) through Greenwich Observatory was chosen as the international meridian from which longitude is calculated.</p>\n" +
                        "<p>Greenwich University began as a polytechnic in 1890. It became a university in 1992.</p>\n" +
                        "<p>In 1966-67 Sir Francis Chichester sailed around the world alone in his yacht The Gipsy Moth IV. For a long time, it was kept at Greenwich although it has now been removed.</p>\n" +
                        "<p>Greenwich is also famous for the Cutty Sark, a tea clipper launched in 1869. (These ships were built to bring tea from China as fast as possible). However, the Cutty Sark was badly damaged by a fire in 2007. Nevertheless, it is hoped the Cutty Sark will be restored.</p>\n" +
                        "<p>Today Greenwich is known for the National Maritime Museum. Greenwich is also known for its market where books and antiques are sold.</p>\n" +
                        "<p>Furthermore, at the present time, there is a project to regenerate part of Greenwich peninsula. It is called the Greenwich Millennium Village.</p>\n" +
                        "<figure>\n" +
                        "    <source srcset=\"https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640.jpg.webp 640w, https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640-300x201.jpg.webp 300w\" sizes=\"(max-width: 640px) 100vw, 640px\" type=\"image/webp\"><img width=\"640\" height=\"428\" src=\"https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640.jpg\" alt=\"\" srcset=\"https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640.jpg 640w, https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640-300x201.jpg 300w\" sizes=\"(max-width: 640px) 100vw, 640px\"></figure>\n" +
                        "<p>Today Greenwich is a flourishing area of London and a popular tourist destination.</p>"
        ));

        arrayList.add(new GuideData(
                "Museums",
                "<header>\n" +
                        "    <h1>Royal Museums Greenwich</h1>\n" +
                        "</header>\n" +
                        "<div>\n" +
                        "    <div>\n" +
                        "        <div>\n" +
                        "            <div>\n" +
                        "                <div>Explore everything Royal Museums Greenwich has to offer, from maritime history and world-class art to out-of-this-world sights.</div>\n" +
                        "                <div>\n" +
                        "                    <div>Content contains affiliate links, marked with asterisks (*). If you click through and make a purchase, Visit London receives a commission &ndash; every purchase supports London&rsquo;s jobs and economy.</div>\n" +
                        "                </div>\n" +
                        "            </div>\n" +
                        "            <figure><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/museums/royal-museums-greenwich-the-grand-axis.jpg?mw=640&hash=66AC89B3BD03F20535FD6C4152BC0777E0E3781B\" alt=\"View from above of Greenwich Park, Royal Museums Greenwich, the River Thames and Canary Wharf in the distance.\" height=\"360\" width=\"640\" itemprop=\"image\">\n" +
                        "                <figcaption>Royal Museums Greenwich: the grand axis. Image courtesy of Royal Museums Greenwich.</figcaption>\n" +
                        "            </figure>\n" +
                        "            <div>\n" +
                        "                <p>Royal Museums Greenwich is home to the Royal Observatory Greenwich, the iconic tea clipper Cutty Sark, the National Maritime Museum and the Queen&rsquo;s House art gallery. All attractions are located within easy walking distance of each other within a Unesco World Heritage Site.</p>\n" +
                        "                <p>Greenwich Village and the museums are easy to reach by Tube, Docklands Light Railway (DLR) and Overground train, as well as the Uber Boat by Thames Clippers riverboat service. With so many things to see and do in Greenwich, it is a great place for a day out with the family.</p>\n" +
                        "                <div>\n" +
                        "                    <h2>Cutty Sark</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/197352-cutty-sark-greenwich\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/cutty-sark/cutty-sark-royal-museums-greenwich.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                        <div>\n" +
                        "                            <p>Venture onto one of the world&apos;s most famous ships and the last surviving tea clipper. Part of world heritage site Maritime Greenwich, <strong>Cutty Sark</strong> has a rich history that can be explored by walking along the many decks and passageways. Don&apos;t miss special events and activities throughout the year.</p>\n" +
                        "                        </div>\n" +
                        "                    </div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>Royal Observatory Greenwich</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/450876-royal-observatory-greenwich\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/royal-observatory-greenwich/equatorial-telescope-royal-observatory-greenwich.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                        <p>Stand with a foot in each hemisphere and explore how great scientists first mapped the seas and the stars at the <strong>Royal Observatory Greenwich</strong>. Now a museum, it&apos;s home to the Prime Meridian Line, the UK&rsquo;s largest refracting telescope, a 4.5 billion year-old asteroid and London&rsquo;s only planetarium.</p>\n" +
                        "                    </div>\n" +
                        "                    <div><br></div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>Royal Museums Greenwich Day Pass</h2>\n" +
                        "                    <figure><a href=\"https://tickets.london/gt2/timeslot/royal-museums-greenwich-day-pass/230\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/campaigns/greenwich-y3/greenwich-panorama-640x360.jpg\" width=\"640\" height=\"360\" alt=\"\" title=\"Greenwich panorama at sunset. Image courtesy of Visit Greenwich.\"></a>\n" +
                        "                        <figcaption>Greenwich panorama at sunset. Image courtesy of Visit Greenwich.</figcaption>\n" +
                        "                    </figure>\n" +
                        "                    <div>Explore two historical London landmarks in one day with the Royal Museums Greenwich Day Pass. Climb aboard the Cutty Sark and learn about its 150 years&rsquo; experience and adventures at sea, then step back onto the ground at the Royal Observatory and see the Prime Meridian of the world.&nbsp;</div>\n" +
                        "                    <div><br></div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>National Maritime Museum</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/450869-national-maritime-museum-greenwich\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/national-maritime-museum/national-maritime-museum-greenwich-turner-battle-of-trafalgar.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                        <p>The <strong>National Maritime Museum</strong> is the largest museum of its kind in the world. Learn about Britain&apos;s encounters with the world at sea, the Royal Navy, and the life of great British hero Admiral Horatio Nelson, and see the uniform he wore when he was fatally wounded at the Battle of Trafalgar.</p>\n" +
                        "                    </div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>Peter Harrison Planetarium</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/3967238-peter-harrison-planetarium\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/peter-harrison-planetarium/peter-harrison-planetarium-royal-museums-greenwich.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                        <p>Travel to the stars at London&rsquo;s only <strong>planetarium</strong>, part of the Royal Observatory&apos;s modern Astronomy Centre. Experience the wonders of the night sky with a number of shows that could fly you into the heart of the Sun, transport you to distant galaxies, show you the birth of a star or land you on Mars.</p>\n" +
                        "                    </div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>Queen&apos;s House</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/284521-queens-house-greenwich\"><img src=\"https://cdn.londonandpartners.com/visit/london-organisations/queens-house/94591-640x360-queens-house-640.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                        <p>For a regal day out, head to the <strong>Queen&apos;s House</strong> to enjoy more than 400 years of stunning art, architecture and royal history. Built as a &quot;house of delight&quot; for James I&apos;s wife, Anne of Denmark, this royal villa was designed by Inigo Jones in 1616 and is Britain&apos;s first classical building. &nbsp;Read More</p>\n" +
                        "                    </div>\n" +
                        "                </div>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </div>\n" +
                        "</div>"
        ));

        arrayList.add(new GuideData(
                "Public places in Greenwich",
                "<header>\n" +
                        "    <h1>14 Top-Rated Attractions &amp; Things to Do in Greenwich</h1>\n" +
                        "    <p>It&apos;s not all glitz and glam in this prestigious Gold Coast town. A haven for commuters who are sick of swallowing smog, Greenwich tops the list of most affluent communities in Connecticut. It&apos;s home to hedge funds, financial firms, and many a Stepford wife but also houses impressive attractions and a long list of fun things to do.</p>\n" +
                        "    <p>Located in Fairfield County, this swanky coastal town is the place to be for those looking for a more upscale locale to use as a base for a weekend of fun. Here, you&apos;ll find gated mansions a plenty, <strong>high-end shops, and upscale restaurants&nbsp;</strong>galore, but Greenwich has more to offer than mere pomp.</p>\n" +
                        "    <p>From historical cottages to pristine beaches and miles of glorious <strong>hiking trails</strong>, this southwestern Connecticut town has a lot to love.</p>\n" +
                        "    <p>Decide where to start exploring with our list of the top attractions and things to do in Greenwich.</p>\n" +
                        "    <h2>1. Shop on Greenwich Avenue</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-shop-along-greenwich-avenue.jpg\" alt=\"Shops along Greenwich Avenue\" width=\"730\" height=\"486\">\n" +
                        "        <figcaption>Shops along Greenwich Avenue | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>When in Greenwich, shop. That&apos;s what the high-class locals do, so why not join in? Greenwich Avenue is the town&apos;s answer to a main or high street. It&apos;s lined with vibrant flower boxes, decorated during the holidays, and its stores are fronted with lovely displays to entice window shoppers to venture inside. Whittling down your savings on this luxe street is one of the best things to do in Greenwich.</p>\n" +
                        "    <p>As is to be expected in this posh town, many of the shops come with big names and expensive price tags. We&apos;re talking about you, <strong>Apple</strong>, <strong>TUMI</strong>, <strong>Herm&egrave;s</strong>, and <strong>Saks Fifth Avenue</strong>. Other, slightly less pricey options exist as well. <strong>Lululemon</strong>, <strong>Shoes &apos;N&apos; More</strong>, and <strong>LF</strong> are a few examples.</p>\n" +
                        "    <p>Not a shopper? Don&apos;t worry, there&apos;s no pressure to unclamp your wallet. Half of the fun on Greenwich Avenue is found in wandering its street, watching the yoga moms sipping lattes while laden with shopping bags, and well-coiffed men and women rushing to their next appointments.</p>\n" +
                        "    <p>Feeling peckish after practicing all that retail therapy? Greenwich Avenue is peppered with mid- and upscale caf&eacute;s and restaurants.</p>\n" +
                        "    <h2>2. Enjoy the Beach at Greenwich Point Park</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-greenwich-point-park.jpg\" alt=\"Greenwich Point Park\" width=\"730\" height=\"552\">\n" +
                        "        <figcaption>Greenwich Point Park | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>A beautiful 147-acre park set on the tip of a peninsula jutting into the Long Island Sound, this exclusive spot can be a bit tricky to visit. That&apos;s the main reason we haven&apos;t put it further up on our list. But more on that later.</p>\n" +
                        "    <p>Here&apos;s why the park is worth the hassle for outsiders to get in: A <strong>long, golden beach</strong> offers views of the Manhattan skyline and a soft place to relax by the sea. <strong>Walking trails</strong> abound, and concessions are on offer for those looking to cool off with a refreshment or grab a bite to eat. The park also offers showers, grills, a covered pavilion, and multiple picnic tables, making it easy to while away an entire day.</p>\n" +
                        "    <p>Still not convinced? Fishing, kitesurfing, and windsurfing are popular things to do, as is swimming in the calm, shallow water. Plus, Greenwich park boasts its own marina and a boat storage area for residents.</p>\n" +
                        "    <p>In pure Greenwich style, getting into the park has been made to feel exclusive, or perhaps elusive is a better word. Residents can apply for a permit online, as well as one for their guests, but out-of-towners will have a bit of a struggle to gain entry between May 1<sup>st</sup> and October 31<sup>st</sup>.</p>\n" +
                        "    <p>To get in, visitors require a beach pass. These can only be purchased during the week from one of the two civic centers in town. Without this pass, beachgoers will be turned away.</p>\n" +
                        "    <div>\n" +
                        "        <p>Although there&apos;s a gate with fees posted on the side, you can&apos;t buy a pass on-site. Now for some good news: Entrance is free for all from November through March.</p>\n" +
                        "        <p>Address: Greenwich Point Park, Old Greenwich, Connecticut</p>\n" +
                        "    </div>\n" +
                        "    <h2>3. Tour the Bush-Holley House at Greenwich Historical Society</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-greenwich-historical-society.jpg\" alt=\"Greenwich Historical Society\" width=\"730\" height=\"476\">\n" +
                        "        <figcaption>Greenwich Historical Society | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>A hidden gem sitting just shy of the busy I-95 in the Cos Cob neighborhood, The Greenwich Historical Society is more than worthy of a visit. The grounds are beautiful, lined with blossoms, and featuring a grape arbor, a spectacular sight when it&apos;s in full bloom. Wandering this pretty property is one of the best things to do in Greenwich.</p>\n" +
                        "    <p>Inside the main building are vast museum galleries displaying paintings by members of the Cos Cob art colony and an array of works shown during rotating exhibits. Here, too, you&apos;ll find a library, rooftop terrace, store, and an <strong>adorably quaint caf&eacute;</strong>.</p>\n" +
                        "    <p>The Greenwich Historical Society is also home to the <strong>Bush-Holley House Museum</strong>, a National Historic Landmark built in the early 1700s. Originally owned by the Bush family, the house was purchased by the Holley family and used as a boarding house for artists and writers during the late 19<sup>th</sup> century. Offshoots of the main house now play host to the society&apos;s administration offices.</p>\n" +
                        "    <div>\n" +
                        "        <p>The museum is only open from 12 to 4pm on Wednesdays through Sundays. Admission is free on the first Wednesday of the month.</p>\n" +
                        "        <p>Address: 47 Strickland Road, Cos Cob, Greenwich, Connecticut</p>\n" +
                        "        <p>Official site: https://greenwichhistory.org/</p>\n" +
                        "    </div>\n" +
                        "    <h2>4. Get Educated at the Bruce Museum</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-bruce-museum.jpg\" alt=\"The Bruce Museum\" width=\"730\" height=\"452\">\n" +
                        "        <figcaption>The Bruce Museum | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>Currently, the Bruce Museum is housed in a one-story, well-laid out building across from <strong>Bruce Park</strong>. Featuring a variety of changing exhibits, the museum always offers something new to entice visitors to stop by.</p>\n" +
                        "    <p>The best part about the displays is their variety. You&apos;ll find everything from sculptures to photography to Chinese brushwork to giant geodes in the spacious gallery rooms.</p>\n" +
                        "    <p>A great spot to bring kids, the museum is home to a science wing, which features permanent exhibits such as, Every Object Tells a Story, <strong>The Earth&apos;s Minerals</strong>, and <strong>Life Between the Tides</strong>. With the help of interesting exhibits and life-size dioramas, these intriguing displays educate visitors about the earth&apos;s environmental history and present-day worries both globally and here at the Connecticut coast.</p>\n" +
                        "    <p>The museum is undergoing a massive expansion project, which means some sections will be closed at various times, so it&apos;s best to check their website before visiting.</p>\n" +
                        "    <p>By late 2022, the new, double-sized museum will reopen in its entirety, featuring a new caf&eacute;, lecture hall, community spaces, and other incredible offerings. It&apos;s due to include a new and expanded science gallery presenting new ways to look at objects (i.e. via x-ray).</p>\n" +
                        "    <div>\n" +
                        "        <p><strong>Insider&apos;s tip</strong>: To make up for the temporary lack of gallery space, the museum is boosting its programs, so be sure to check out what&apos;s on.</p>\n" +
                        "        <p>Address: 1 Museum Drive, Greenwich, Connecticut</p>\n" +
                        "        <p>Official site: https://brucemuseum.org/</p>\n" +
                        "    </div>\n" +
                        "    <h2>5. Bird-Watch at the Audubon Center</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-audubon-center.jpg\" alt=\"A barred owl at the Greenwich Audubon Center\" width=\"730\" height=\"487\">\n" +
                        "        <figcaption>A barred owl at the Greenwich Audubon Center</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>The Greenwich Audubon Center is a beautiful and relaxing place to visit for the day. Whether you&apos;re in search of serenity or environmental education, you&apos;ll find them all here. One of the best attractions in Greenwich, the center has <strong>miles of trails to hike</strong> and plenty of spots to stop and bird-watch. Be sure to pack binoculars and a good camera, so you don&apos;t miss anything.</p>\n" +
                        "    <p>Inside, the <strong>Kimberlin Nature Education Center</strong> offers plenty to occupy kids and grownups. The <strong>Hilfiger Children&apos;s Learning Center</strong> has hands-on exhibits, a puppet theater, and a story corner, as well as live animals to interact with. You&apos;ll also find the <strong>Nature Store</strong> in this building, which is filled with wonderful gifts.</p>\n" +
                        "    <p>The <strong>Perch Coffee Lounge</strong> is a perfect place to &quot;perch&quot; yourself (sorry, we had to) after your time spent bird-watching. Located in the Education Center, this bright, quiet spot boasts a reading area and <strong>Nature Theater</strong> showing documentaries, as well as live feeds from bird cams. The java on offer is &quot;Bird Friendly Coffee,&quot; which was grown in a protected rainforest habitat. That means you can drink it without guilt.</p>\n" +
                        "    <div>\n" +
                        "        <p><strong>Insider&apos;s tip</strong>: Pick up a Letterbox activity sheet from the front desk before heading to the trails. It includes clues to boxes hidden along the pathways, as well as interesting information about the animals, plants, and habitats you&apos;ll come in contact with.</p>\n" +
                        "        <p>Address: 613 Riversville Road, Greenwich, Connecticut</p>\n" +
                        "        <p>Official site: https://greenwich.audubon.org/</p>\n" +
                        "    </div>\n" +
                        "    <h2>6. Catch a Match at Greenwich Polo Park</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-greenwich-polo-park.jpg\" alt=\"Polo horses in action\" width=\"730\" height=\"502\">\n" +
                        "        <figcaption>Polo horses in action</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>Ever wanted to see a polo game in person? You can, every Sunday from June through the end of August at Greenwich Polo Park. Being Greenwich, these matches don&apos;t take place on a boring farmer&apos;s field. The lawn is immaculately cut, and the surroundings are beautiful.</p>\n" +
                        "    <p>Greenwich Polo Park is considered one of the &quot;elite high-polo venues in the world&quot; and is home to the White Birch polo team, one of the most successful teams of all time.</p>\n" +
                        "    <p>Guests arrive for games dressed in their best, so expect to see men wearing tight, colorful shorts and ascots, and women donning heels and fascinators. You&apos;ll want to dress appropriately but aim for comfort. You could be here for a few hours.</p>\n" +
                        "    <p>As for food, the venue has a nice selection of food trucks, but many pack their own picnics.</p>\n" +
                        "    <div>\n" +
                        "        <p><strong>Insider&apos;s tip</strong>: Arrive early and set up as close to the field as you can. That way, your view of the matches won&apos;t be blocked by other chairs or umbrellas.</p>\n" +
                        "        <p>Address: 1 Hurlingham Drive, Greenwich, Connecticut</p>\n" +
                        "        <p>Official site: https://www.greenwichpoloclub.com/</p>\n" +
                        "    </div>\n" +
                        "    <h2>7. Wander around the Greenwich Avenue Historic District</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img alt=\"Greenwich Town Hall\" src=\"https://www.planetware.com/wpimages/2021/10/connecticut-greenwich-top-attractions-things-to-do-wander-greenwich-avenue-historic-district.jpg\" width=\"730\" height=\"487\">\n" +
                        "        <figcaption>Greenwich Town Hall</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>As you&apos;ve learned, Greenwich Avenue is the heart of this plush town. In addition to the many upscale shops, caf&eacute;s, and restaurants are historic buildings so impressive, they beg to be photographed.</p>\n" +
                        "    <p>An iconic structure lies stoically on Greenwich Avenue, fronted by impressive columns and flanked by a large, copper clock. Currently listed on the National Register of Historic Places, this spectacular building, which was built in 1905, is now home to the <strong>Greenwich Senior Center</strong>. It was designed in a Beaux Arts style.</p>\n" +
                        "    <p>The Havemeyer Building is another must-see, which once served as an elementary school. Built in the late 19th-century, this Richardsonian Romanesque masterpiece stands perched atop a hill at the corner of Greenwich Avenue and Arch Street.</p>\n" +
                        "    <p>While it&apos;s easy to get distracted by the impressive window displays, take a moment to appreciate the other historic buildings on this street, many of which date to the late 19th and early 20th centuries.</p>\n" +
                        "    <h2>8. Step Back in Time at Putnam Cottage</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-putnam-cottage.jpg\" alt=\"Putnam Cottage\" width=\"730\" height=\"488\">\n" +
                        "        <figcaption>Putnam Cottage | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>Sitting atop Putnam hill, this adorable, bright red colonial &quot;cottage&quot; is hard to miss. Originally built during the 17<sup>th</sup> century for Timothy Knapp, the house was used as a meeting place for local Freemasons. It gained its fame, however, during the Revolutionary War. At that time, its resident, General Israel Putnam, made a heroic escape from the British at this location. General Washington is said to have lunched here as Putnam&apos;s guest.</p>\n" +
                        "    <p>Today, Putnam Cottage graces the side of Boston Post Road (named Putnam Avenue in this part of Greenwich) and welcomes visitors, especially school groups, to explore its three main rooms and quaint vegetable garden and carriage barn out back. The inside is decorated as if no time has passed, bringing visitors back to the 18<sup>th</sup> century. It is considered one of the top attractions in Greenwich.</p>\n" +
                        "    <div>\n" +
                        "        <p>Cottage tours are offered by volunteer members of the Putnam Hill Chapter DAR, and must be organized in advance, so be sure to call before you arrive.</p>\n" +
                        "        <p>Address: 243 East Putnam Avenue (a.k.a. US Route 1), Greenwich, Connecticut</p>\n" +
                        "        <p>Official site: http://putnamcottage.org/</p>\n" +
                        "    </div>\n" +
                        "    <h2>9. Listen to the Bells at First Presbyterian Church</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-first-presbyterian-church.jpg\" alt=\"First Presbyterian Church\" width=\"730\" height=\"460\">\n" +
                        "        <figcaption>First Presbyterian Church | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>Perched on the corner of West Putnam Avenue and Lafayette Place, Greenwich&apos;s First Presbyterian Church is a lovely sight. Its slender, white steeple can be seen from busy Putnam and Greenwich Avenues, adding a slice of beauty to the town&apos;s main shopping district. You can&apos;t beat the view of this steeple during sunset, especially as it&apos;s seen from Greenwich Avenue.</p>\n" +
                        "    <p>The remarkable stonework of this picturesque 19<sup>th</sup>-century building stands proudly, arm in branch with an impressive array of large, mature trees. During spring, the cherry blossoms pop next to the grey stone, begging you to stop and take a photo.</p>\n" +
                        "    <div>\n" +
                        "        <p>Inside, the building is breathtaking. A high, vaulted ceiling and bright stained-glass windows are two of the church&apos;s best features. The resplendent organ lies behind the altar, playing music to soothe weary souls.</p>\n" +
                        "        <p>Address: 1 West Putnam Avenue, Greenwich, Connecticut</p>\n" +
                        "        <p>Official site: https://fpcg.org/</p>\n" +
                        "    </div>\n" +
                        "    <h2>10. Go for a Hike in the Babcock Preserve</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-babcock-preserve.jpg\" alt=\"Eastern chipmunk in Connecticut\" width=\"730\" height=\"487\">\n" +
                        "        <figcaption>Eastern chipmunk in Connecticut</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>A natural wonderland hidden in Greenwich, the Babcock Preserve is a delightful place to visit for an hour or two. With 300 acres and <strong>seven miles of trails</strong> to explore, this verdant preserve is the largest of the Greenwich parks and a perfect place for hikers.</p>\n" +
                        "    <p>Open from sunrise to sunset year-round, the trails in this large park are well marked, but it&apos;s still advisable to take a photo of the map before heading off into the forest.</p>\n" +
                        "    <p>You&apos;ll be rewarded for your exertion with phenomenal views, babbling brooks, mucky swamps, and a wide diversity of plants and animals. Look closely and you may see a deer or two.</p>\n" +
                        "    <div>\n" +
                        "        <p><strong>Insider&apos;s tip</strong>: Babcock Preserve can be steep and rocky in parts, so wear appropriate footwear and beware if you struggle on difficult hikes.</p>\n" +
                        "        <p>Address: North Street, parking can be found about 0.5 miles north of the Merritt Parkway, Greenwich, Connecticut</p>\n" +
                        "    </div>\n" +
                        "    <h2>11. Ogle the Art at the Flinn Gallery</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-the-flinn-gallery.jpg\" alt=\"The Flinn Gallery\" width=\"730\" height=\"479\">\n" +
                        "        <figcaption>The Flinn Gallery | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>The vibrant Flinn Gallery recently got a facelift, and it&apos;s all the better for it. Reopening in late November, 2019, the small but impressive space can be a bit tough to find. It&apos;s located at the top of the <strong>Greenwich Library</strong>, with little signage out front. Head through the library doors and hop in the elevator or climb the stairs to find its quiet spot.</p>\n" +
                        "    <p>Inside, you&apos;ll find a multitude of works, including those featured in the frequently changing exhibitions. Each exhibit tends to last for about three months, so there&apos;s plenty of time to catch up on what you&apos;ve missed. From landscape paintings and historical pieces gifted to the library to prints the library acquired between the 1950s and 1990s, there are plenty of interesting things to see.</p>\n" +
                        "    <div>\n" +
                        "        <p>When you&apos;ve finished, nip around the library for a wander around its newly updated space.</p>\n" +
                        "        <p>Address: Greenwich Library, 101 West Putnam Avenue, Greenwich, Connecticut</p>\n" +
                        "        <p>Official site: https://flinngallery.com/</p>\n" +
                        "    </div>\n" +
                        "    <h2>12. Fill Your Belly at Fab Local Eateries</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-fill-your-belly.jpg\" alt=\"Cakes at By the Way Bakery in Greenwich\" width=\"730\" height=\"462\">\n" +
                        "        <figcaption>Cakes at By the Way Bakery in Greenwich | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>No trip to Greenwich would be complete without sampling the delicious food on offer. In addition to the upscale <strong>Thomas Hekelman</strong> (a French restaurant that offers vegan and gluten-free options) and <strong>L&apos;Escale</strong> (another amazing French venue with impeccable views), you&apos;ll find mid-priced fare at the tasty, no-frills <strong>Thai Basil</strong> and the uber healthy and chic <strong>Granola Bar</strong>.</p>\n" +
                        "    <p>While you&apos;re scrounging for food, don&apos;t miss the small but amazing <strong>By the Way Bakery</strong>. Located on West Putnam Avenue (just near the top of Greenwich Avenue), this gluten-and dairy-free phenomenon offers the most delicious cakes, cookies, and muffins you&apos;ll ever eat. Seriously! You won&apos;t even realize they&apos;re gluten-free. Plus, they&apos;re all made lovingly the old-fashioned way, by hand in small batches. No wonder the treats taste so fresh!</p>\n" +
                        "    <h2>13. Explore the Montgomery Pinetum Park</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img alt=\"Montgomery Pinetum Park\" src=\"https://www.planetware.com/wpimages/2021/10/connecticut-greenwich-top-attractions-things-to-do-explore-montgomery-pinetum-park.jpg\" width=\"730\" height=\"487\">\n" +
                        "        <figcaption>Montgomery Pinetum Park</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>The Montgomery Pinetum Park is a relaxing natural wonderland located near the Cos Cob section of Greenwich. A wooded beauty containing spectacular species of trees (including weeping hemlock and Japanese threadleaf maples), this is a popular attraction for those looking for a peaceful respite.</p>\n" +
                        "    <p>Pack a picnic and enjoy it in this large public park, hike the 1.9 miles of trails, or gaze at the view from the <strong>Joseph Hartman Outlook</strong>. Be sure to wear bug spray in summer and good walking shoes, as the path can get a bit rocky and muddy in places.</p>\n" +
                        "    <p>This park is spectacular when the fall foliage is in full bloom, but it is closed from mid-November to mid-March, so plan your trip accordingly. Don&apos;t miss the <strong>Garden Education Center</strong> and <strong>Greenwich Town Greenhouse</strong>.</p>\n" +
                        "    <div>\n" +
                        "        <p>Visiting with your favorite four-legged friend? Bring him (or her) along, but be sure to use a leash.</p>\n" +
                        "        <p>Address: 130 Bible Street, Cos Cob, Connecticut</p>\n" +
                        "    </div>\n" +
                        "    <h2>14. Take a Ferry Cruise</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img alt=\"Island Beach\" src=\"https://www.planetware.com/wpimages/2021/10/connecticut-greenwich-top-attractions-things-to-do-take-ferry-cruise.jpg\" width=\"730\" height=\"485\">\n" +
                        "        <figcaption>Island Beach</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>Few activities can beat cruising along Greenwich Harbor on a bright, sunny day. In addition to feeling the saltwater breeze tickle your face, you&apos;ll be granted magnificent views of the Greenwich shores, and a relaxing tour of the neighboring area.</p>\n" +
                        "    <p>Two miles off the Greenwich coast lie two islands: <strong>Great Captain Island&nbsp;</strong>and <strong>Island Beach</strong>. During the summer months (from early June through mid-September), three ferries depart from Arch Street on their way to these enticing isles.</p>\n" +
                        "    <div>\n" +
                        "        <p>Tickets are available from the <strong>Arch Street Ferry Dock</strong>, but you&apos;ll need either a resident seasonal park pass or a single-entry park pass in order to buy them. The <strong>Cruise to Nowhere</strong> is particularly popular. Consisting of a two-hour tour of the area, this rejuvenating cruise is one of the best things to do in Greenwich.</p>\n" +
                        "    </div>\n" +
                        "</header>\n" +
                        "<div>\n" +
                        "    <div>\n" +
                        "        <div>\n" +
                        "            <div>\n" +
                        "                <div>\n" +
                        "                    <div><br></div>\n" +
                        "                </div>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </div>\n" +
                        "</div>"
        ));

        return arrayList;
    }
}