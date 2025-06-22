class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        adapter = MyAdapter(getDummyData())
        recyclerView.adapter = adapter

        view.findViewById<Button>(R.id.btnNavigate).setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

    private fun getDummyData(): List<String> {
        return List(10) { "Item $it" }
    }
}
