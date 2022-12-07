(ns ogbe.fulcro.mui.icons.diamond-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DiamondRounded" :default DiamondRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-diamond-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DiamondRounded)))