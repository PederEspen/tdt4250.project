package dataModels;

import java.util.Date;
import java.util.List;

public class Title {
	public String title_id;
	public String title;
	public String type;
	public String pub_id;
	public Float price;
	public Float advance;
	public int royalty;
	public int ytd_sales;
	public String notes;
	public Date pubdate;
	public List<String> au_ids;
}
