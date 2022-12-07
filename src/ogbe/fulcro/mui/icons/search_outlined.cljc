(ns ogbe.fulcro.mui.icons.search-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SearchOutlined" :default SearchOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-search-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SearchOutlined)))