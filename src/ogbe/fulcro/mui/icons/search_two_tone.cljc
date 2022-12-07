(ns ogbe.fulcro.mui.icons.search-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SearchTwoTone" :default SearchTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-search-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SearchTwoTone)))