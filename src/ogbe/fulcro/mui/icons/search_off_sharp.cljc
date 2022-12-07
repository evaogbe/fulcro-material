(ns ogbe.fulcro.mui.icons.search-off-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SearchOffSharp" :default SearchOffSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-search-off-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SearchOffSharp)))