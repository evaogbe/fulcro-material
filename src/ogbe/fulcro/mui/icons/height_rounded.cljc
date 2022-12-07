(ns ogbe.fulcro.mui.icons.height-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HeightRounded" :default HeightRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-height-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HeightRounded)))