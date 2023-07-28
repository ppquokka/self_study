function maskingName(name)
{
  if (name.length <= 3)
  {
    return name.replace(name.substring(0, 1, 2), "*");
  }

  return (name.substring(0, 3) + "*".repeat(name.length - 3));
}

function applyDropdownMenu()
{
  document.querySelector('.dropdown-menu').addEventListener('click', function (event)
  {
      // 선택된 카테고리를 가져옵니다.
      const selectedCategory = event.target.dataset.category;
      // "category-row" 클래스를 가진 모든 테이블 행들을 가져옵니다.
      const categoryRows = document.querySelectorAll('.category-row');
      // 선택된 카테고리에 해당하는 행들만 보이도록 처리합니다.
      categoryRows.forEach(row =>
        {
          if (selectedCategory === 'all' || row.dataset.category === selectedCategory)
          {
              row.style.display = 'table-row'; // 해당 행을 보여줍니다.
          }
          
          else
          {
              row.style.display = 'none'; // 해당 행을 숨깁니다.
          }
      });
  });
}