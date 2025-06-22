class SecondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = MyAdapter(getDummyData())
        recyclerView.adapter = adapter
    }

    private fun getDummyData(): List<String> {
        return List(20) { "Title $it" }
    }
}
