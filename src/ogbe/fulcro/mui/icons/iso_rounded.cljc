(ns ogbe.fulcro.mui.icons.iso-rounded
  #?(:cljs (:require
            ["@mui/icons-material/IsoRounded" :default IsoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-iso-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IsoRounded)))