class Volume
{
public static void main(String[] args)

{

double pi=3.1415;
int radius_of_earth=6378;
double VOLUME_KILOMETERS=(4/3)*pi*(radius_of_earth)*(radius_of_earth);
double VOLUME_MILES=VOLUME_KILOMETERS/((1.6)*(1.6));
System.out.println(&quot;Volume of the Earth in Kilometers
is:&quot;+VOLUME_KILOMETERS+&quot; kms&quot;);
System.out.println(&quot;Volume of the Earth in Miles is:&quot;+VOLUME_MILES+&quot; miles&quot;);
}
}