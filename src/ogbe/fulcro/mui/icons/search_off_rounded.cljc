(ns ogbe.fulcro.mui.icons.search-off-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SearchOffRounded" :default SearchOffRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-search-off-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SearchOffRounded)))