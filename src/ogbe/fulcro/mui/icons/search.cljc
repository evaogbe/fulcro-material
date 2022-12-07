(ns ogbe.fulcro.mui.icons.search
  #?(:cljs (:require
            ["@mui/icons-material/Search" :default Search]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-search
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Search)))