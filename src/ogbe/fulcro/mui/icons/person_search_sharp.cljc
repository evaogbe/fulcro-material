(ns ogbe.fulcro.mui.icons.person-search-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PersonSearchSharp" :default PersonSearchSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-search-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonSearchSharp)))