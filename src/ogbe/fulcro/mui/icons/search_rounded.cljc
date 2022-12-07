(ns ogbe.fulcro.mui.icons.search-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SearchRounded" :default SearchRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-search-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SearchRounded)))