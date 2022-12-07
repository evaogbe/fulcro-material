(ns ogbe.fulcro.mui.icons.flatware-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FlatwareRounded" :default FlatwareRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flatware-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlatwareRounded)))