(ns ogbe.fulcro.mui.icons.vaccines-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VaccinesRounded" :default VaccinesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vaccines-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VaccinesRounded)))