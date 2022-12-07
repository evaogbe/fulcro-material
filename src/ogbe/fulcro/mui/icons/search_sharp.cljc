(ns ogbe.fulcro.mui.icons.search-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SearchSharp" :default SearchSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-search-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SearchSharp)))