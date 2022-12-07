(ns ogbe.fulcro.mui.icons.search-off
  #?(:cljs (:require
            ["@mui/icons-material/SearchOff" :default SearchOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-search-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SearchOff)))