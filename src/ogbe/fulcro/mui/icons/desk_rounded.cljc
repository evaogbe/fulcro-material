(ns ogbe.fulcro.mui.icons.desk-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DeskRounded" :default DeskRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-desk-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeskRounded)))