(ns ogbe.fulcro.mui.icons.person-search-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PersonSearchRounded" :default PersonSearchRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-search-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonSearchRounded)))