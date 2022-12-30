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
                // setting recyclerView Animation
                recyclerView.scheduleLayoutAnimation();

                // Setting recyclerView adapter
                recyclerView.setAdapter(new GuideAdapter(getGuideData().stream().map(GuideData::getTitle).collect(Collectors.toList()), (position, value) -> {
                    startActivity(new Intent(TouristGuideActivity.this, GuideDetailActivity.class)
                            .putExtra("data", getGuideData().get(position).getDesc())
                            .putExtra("title",getGuideData().get(position).getTitle())
                    );
                }));
            }
        }, 100);





    }

    /*
        creating Guides Array data
        each data are in the form of HTML
     */

    private ArrayList<GuideData> getGuideData() {
        ArrayList<GuideData> arrayList = new ArrayList<>();

        arrayList.add(new GuideData(
                "History of Greenwich",
                "<p>In the early 16th century, Henry VII owned a palace at Greenwich. Henry VIII was born there. His daughters Mary and Elizabeth were also born in Greenwich Palace. The palace was demolished by Charles II.</p>\n" +
                        "<p>In the early 17th century James I decided to build a new house at Greenwich for his queen Anne of Denmark. It was designed by Inigo Jones (1573-1652) and it is known as the Queen&rsquo;s House. It was the first classical building in England.</p>\n" +
                        "<p>Greenwich Park was laid out as a hunting ground by the Duke of Gloucester in 1433. In the early 17th century James I built a brick wall around the park and in the late 17th century a French landscape gardener called Andre Le Notre who designed the gardens at the palace of Versailles designed a garden for Greenwich Park. The Ranger&rsquo;s House was built in 1688.</p>\n" +
                        "<p>The National Observatory was built in 1675 by Charles II for John Flamsteed (1646-1719), the first Astronomer Royal who lived in Flamsteed House in Greenwich.</p>\n" +
                        "<p>Then in 1694, Christopher Wren designed the Royal Hospital for Seamen at Greenwich. The Painted Hall was painted by Sir James Thornhill (1675-1734). In 1804 the hospital was made into the Royal Naval College.</p>\n" +
                        "<p>In 1735 a statue of George II dressed as a Roman emperor was sculpted by John Rysback and erected in Greenwich.</p>\n" +
                        "<h2><mark>Tourism in Greenwich</mark></h2>\n" +
                        "<p>In 1838 Greenwich was connected to London by railway. As a result, people flocked to live in Greenwich and it was engulfed by the growing city.</p>\n" +
                        "<p>In 1884 the meridian (the line running north to south) through Greenwich Observatory was chosen as the international meridian from which longitude is calculated.</p>\n" +
                        "<p>Greenwich University began as a polytechnic in 1890. It became a university in 1992.</p>\n" +
                        "<p>In 1966-67 Sir Francis Chichester sailed around the world alone in his yacht The Gipsy Moth IV. For a long time, it was kept at Greenwich although it has now been removed.</p>\n" +
                        "<p>Greenwich is also famous for the Cutty Sark, a tea clipper launched in 1869. (These ships were built to bring tea from China as fast as possible). However, the Cutty Sark was badly damaged by a fire in 2007. Nevertheless, it is hoped the Cutty Sark will be restored.</p>\n" +
                        "<p>Today Greenwich is known for the National Maritime Museum. Greenwich is also known for its market where books and antiques are sold.</p>\n" +
                        "<figure>\n" +
                        "    <source srcset=\"https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640.jpg.webp 640w, https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640-300x201.jpg.webp 300w\" sizes=\"(max-width: 640px) 100vw, 640px\" type=\"image/webp\"><img width=\"640\" height=\"428\" src=\"https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640.jpg\" alt=\"\" srcset=\"https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640.jpg 640w, https://localhistories.org/wp-content/uploads/2021/05/skyline-340986_640-300x201.jpg 300w\" sizes=\"(max-width: 640px) 100vw, 640px\"></figure>\n" +
                        "<p>The Royal Borough of Greenwich attracts 19 million visitors a year and is home to a Unesco World Heritage Site, the world-famous Meridian Line and hundreds of years of Royal and Military history - and now the Visit Greenwich tourism body and its partners have been recognised for the work they do promoting the borough..</p>"
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
                        "              <figure><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/museums/royal-museums-greenwich-the-grand-axis.jpg?mw=640&hash=66AC89B3BD03F20535FD6C4152BC0777E0E3781B\" alt=\"View from above of Greenwich Park, Royal Museums Greenwich, the River Thames and Canary Wharf in the distance.\" height=\"360\" width=\"640\" itemprop=\"image\">\n" +
                        "                <figcaption>For more information and booking please click the image.</figcaption>\n" +
                        "            </figure>\n" +
                        "            <div>\n" +
                        "                <div>\n" +
                        "                    <h2>Cutty Sark</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/197352-cutty-sark-greenwich\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/cutty-sark/cutty-sark-royal-museums-greenwich.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                        <div>\n" +
                        "                           </div>\n" +
                        "                    </div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>Royal Observatory Greenwich</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/450876-royal-observatory-greenwich\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/royal-observatory-greenwich/equatorial-telescope-royal-observatory-greenwich.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                        </div>\n" +
                        "                    <div><br></div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>Royal Museums Greenwich Day Pass</h2>\n" +
                        "                    <figure><a href=\"https://tickets.london/gt2/timeslot/royal-museums-greenwich-day-pass/230\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/campaigns/greenwich-y3/greenwich-panorama-640x360.jpg\" width=\"640\" height=\"360\" alt=\"\" title=\"Greenwich panorama at sunset. Image courtesy of Visit Greenwich.\"></a>\n" +
                        "                        <figcaption>For more information and booking please click the image.</figcaption>\n" +
                        "                    </figure>\n" +
                        "                    <div><br></div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>National Maritime Museum</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/450869-national-maritime-museum-greenwich\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/national-maritime-museum/national-maritime-museum-greenwich-turner-battle-of-trafalgar.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                         </div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>Peter Harrison Planetarium</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/3967238-peter-harrison-planetarium\"><img src=\"https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/sightseeing/london-attractions/peter-harrison-planetarium/peter-harrison-planetarium-royal-museums-greenwich.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                         </div>\n" +
                        "                </div>\n" +
                        "                <div>\n" +
                        "                    <h2>Queen&apos;s House</h2>\n" +
                        "                    <figure><a href=\"https://www.visitlondon.com/things-to-do/place/284521-queens-house-greenwich\"><img src=\"https://cdn.londonandpartners.com/visit/london-organisations/queens-house/94591-640x360-queens-house-640.jpg\" width=\"640\" height=\"360\" alt=\"\"></a></figure>\n" +
                        "                    <div>\n" +
                        "                         </div>\n" +
                        "                </div>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </div>\n" +
                        "</div>"
        ));

        arrayList.add(new GuideData(
                "Must Things to do ın Greenwich",
                "<header>\n" +
                        "    <h1>14 Top-Rated Attractions &amp; Things to Do in Greenwich</h1>\n" +
                        "    <h2>1. Shop on Greenwich Avenue</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-shop-along-greenwich-avenue.jpg\" alt=\"Shops along Greenwich Avenue\" width=\"730\" height=\"486\">\n" +
                        "        <figcaption>Shops along Greenwich Avenue | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>When in Greenwich, shop. That&apos;s what the high-class locals do, so why not join in? Greenwich Avenue is the town&apos;s answer to a main or high street. It&apos;s lined with vibrant flower boxes, decorated during the holidays, and its stores are fronted with lovely displays to entice window shoppers to venture inside. </p>\n" +
                        "    <h2>2. Enjoy the Beach at Greenwich Point Park</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-greenwich-point-park.jpg\" alt=\"Greenwich Point Park\" width=\"730\" height=\"552\">\n" +
                        "        <figcaption>Greenwich Point Park | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>A beautiful 147-acre park set on the tip of a peninsula jutting into the Long Island Sound, this exclusive spot can be a bit tricky to visit. That&apos;s the main reason we haven&apos;t put it further up on our list. But more on that later.</p>\n" +
                        "    </div>\n" +
                        "    <h2>3. Tour the Bush-Holley House at Greenwich Historical Society</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-greenwich-historical-society.jpg\" alt=\"Greenwich Historical Society\" width=\"730\" height=\"476\">\n" +
                        "        <figcaption>Greenwich Historical Society | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>A hidden gem sitting just shy of the busy I-95 in the Cos Cob neighborhood, The Greenwich Historical Society is more than worthy of a visit. The grounds are beautiful, lined with blossoms, and featuring a grape arbor, a spectacular sight when it&apos;s in full bloom. Wandering this pretty property is one of the best things to do in Greenwich.</p>\n" +
                        "     </div>\n" +
                        "    <h2>4. Get Educated at the Bruce Museum</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-bruce-museum.jpg\" alt=\"The Bruce Museum\" width=\"730\" height=\"452\">\n" +
                        "        <figcaption>The Bruce Museum | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>Currently, the Bruce Museum is housed in a one-story, well-laid out building across from <strong>Bruce Park</strong>. Featuring a variety of changing exhibits, the museum always offers something new to entice visitors to stop by.</p>\n" +
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
                        "    <p>Inside, the <strong>Kimberlin Nature Education Center</strong> offers plenty to occupy kids and grownups. The <strong>Hilfiger Children&apos;s Learning Center</strong> has hands-on exhibits, a puppet theater, and a story corner, as well as live animals to interact with. You&apos;ll also find the <strong>Nature Store</strong> in this building, which is filled with wonderful gifts.</p>\n" +
                        "   <div>\n" +
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
                        "    <p>Greenwich Polo Park is considered one of the &quot;elite high-polo venues in the world&quot; and is home to the White Birch polo team, one of the most successful teams of all time.</p>\n" +
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
                        "    <h2>8. Step Back in Time at Putnam Cottage</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-putnam-cottage.jpg\" alt=\"Putnam Cottage\" width=\"730\" height=\"488\">\n" +
                        "        <figcaption>Putnam Cottage | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "     <p>Address: 243 East Putnam Avenue (a.k.a. US Route 1), Greenwich, Connecticut</p>\n" +
                        "        <p>Official site: http://putnamcottage.org/</p>\n" +
                        "    </div>\n" +
                        "    <h2>9. Listen to the Bells at First Presbyterian Church</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img src=\"https://www.planetware.com/wpimages/2019/11/connecticut-greenwich-top-attractions-first-presbyterian-church.jpg\" alt=\"First Presbyterian Church\" width=\"730\" height=\"460\">\n" +
                        "        <figcaption>First Presbyterian Church | Photo Copyright: Shandley McMurray</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "   <div>\n" +
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
                        "   <div>\n" +
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
                        "    <div>\n" +
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
                        "    <h2>13. Explore the Montgomery Pinetum Park</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img alt=\"Montgomery Pinetum Park\" src=\"https://www.planetware.com/wpimages/2021/10/connecticut-greenwich-top-attractions-things-to-do-explore-montgomery-pinetum-park.jpg\" width=\"730\" height=\"487\">\n" +
                        "        <figcaption>Montgomery Pinetum Park</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>Pack a picnic and enjoy it in this large public park, hike the 1.9 miles of trails, or gaze at the view from the <strong>Joseph Hartman Outlook</strong>. Be sure to wear bug spray in summer and good walking shoes, as the path can get a bit rocky and muddy in places.</p>\n" +
                        "    <div>\n" +
                        "       <p>Address: 130 Bible Street, Cos Cob, Connecticut</p>\n" +
                        "    </div>\n" +
                        "    <h2>14. Take a Ferry Cruise</h2>\n" +
                        "    <p><br></p>\n" +
                        "    <figure><img alt=\"Island Beach\" src=\"https://www.planetware.com/wpimages/2021/10/connecticut-greenwich-top-attractions-things-to-do-take-ferry-cruise.jpg\" width=\"730\" height=\"485\">\n" +
                        "        <figcaption>Island Beach</figcaption>\n" +
                        "    </figure>\n" +
                        "    <p><br></p>\n" +
                        "    <p>Few activities can beat cruising along Greenwich Harbor on a bright, sunny day. In addition to feeling the saltwater breeze tickle your face, you&apos;ll be granted magnificent views of the Greenwich shores, and a relaxing tour of the neighboring area.</p>\n" +
                        "    <div>\n" +
                        "       </div>\n" +
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