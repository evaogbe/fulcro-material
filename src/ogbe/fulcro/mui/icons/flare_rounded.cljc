(ns ogbe.fulcro.mui.icons.flare-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FlareRounded" :default FlareRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flare-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlareRounded)))